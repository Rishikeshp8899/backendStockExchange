package com.richim.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	 private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
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
    	logger.info("LoginController|register|register method started"+user.toString());
        if (userRepository.findByUsername(user.getUsername()) != null) {
        	logger.info("LoginController|register|user already taken");
            return ResponseEntity.badRequest().body("Username already taken");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        logger.info("LoginController|register|User registered successfully");
        return ResponseEntity.ok("User registered successfully");
    }
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {
		logger.info("LoginController|login|login method started"+user.toString());
		  Authentication authentication = authenticationManager.authenticate(
			        new UsernamePasswordAuthenticationToken(
			            user.getUsername(),
			            user.getPassword()
			        )
			    );
			    SecurityContextHolder.getContext().setAuthentication(authentication);
			    String jwt = jwtUtils.generateJwtToken(authentication);
			    logger.info("LoginController|login|jwt is generate for user:="+jwt);
			    return ResponseEntity.ok(jwt);
	}

}
