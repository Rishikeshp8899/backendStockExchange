package com.richim.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.richim.security.service.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
public class SecurityConfig  {	
	@Autowired
	private JwtAuthTokenFilter jwtAuthTokenFilter;
	
	private final CustomUserDetailsService customUserDetailsService;

	public SecurityConfig(CustomUserDetailsService customUserDetailsService) {
	    this.customUserDetailsService = customUserDetailsService;
	}

	
	  @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable()) 
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/login","/register").permitAll()  
	                .anyRequest().authenticated()        
	            )    
	            .sessionManagement(session -> session
	                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	                    );
	        http.addFilterBefore(jwtAuthTokenFilter, UsernamePasswordAuthenticationFilter.class);
	        return http.build();
	    }

	  @Bean
	  public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
	      AuthenticationManagerBuilder authManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
	      authManagerBuilder
	          .userDetailsService(customUserDetailsService)
	          .passwordEncoder(passwordEncoder());

	      return authManagerBuilder.build(); 
	  }


	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }


	    @Bean
	    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
	    	return customUserDetailsService;
	    }
	
}
