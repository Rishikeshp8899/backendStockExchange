package com.richim.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richim.security.dto.requestDto;
import com.richim.security.dto.responseDto;
import com.richim.security.proxyservers.CompanyServerProxy;


@RestController
@RequestMapping("company")
public class CompanyController {

	
	@Autowired
	private CompanyServerProxy comapanyServerProxy;
	
	@PostMapping("/register")
	@PreAuthorize("hasRole('company')")
	public ResponseEntity<String> registerController(@RequestBody requestDto dto){
		System.out.println("in---controller");
		responseDto dto2=comapanyServerProxy.registerCompanyInfo(dto);
		
		if(dto2.getStatus().equalsIgnoreCase("success")) {
			if(dto2.getStatusCode()==1) {
				return ResponseEntity.ok("register done");
			}
			return ResponseEntity.ok("register failed");
		}
		return ResponseEntity.ok("internal error");
		
	}
	
}
