package com.richim.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.richim.security.config.JwtUtils;
import com.richim.security.entity.User;
import com.richim.security.repo.UserRepository;

@RestController
public class LoginController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Username already taken");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully");
    }
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {
		
		  Authentication authentication = authenticationManager.authenticate(
			        new UsernamePasswordAuthenticationToken(
			            user.getUsername(),
			            user.getPassword()
			        )
			    );
			    SecurityContextHolder.getContext().setAuthentication(authentication);
			    String jwt = jwtUtils.generateJwtToken(authentication);
			    return ResponseEntity.ok(jwt);
	}

}
