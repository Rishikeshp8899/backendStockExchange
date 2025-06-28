package com.richim.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<String> testController(){
		return ResponseEntity.ok("test controller");
	}
	
}
