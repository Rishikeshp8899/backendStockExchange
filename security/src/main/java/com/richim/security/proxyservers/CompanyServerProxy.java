package com.richim.security.proxyservers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.richim.security.dto.requestDto;
import com.richim.security.dto.responseDto;

@FeignClient(
	    name = "company-registration-module", // Can be any name, required by Feign
	    url = "http://localhost:7001"         // Base URL of the service
	)
public interface CompanyServerProxy {

	    @PostMapping("/company-registration-module/company/registration")
	    public responseDto registerCompanyInfo(@RequestBody requestDto dto);
	}
