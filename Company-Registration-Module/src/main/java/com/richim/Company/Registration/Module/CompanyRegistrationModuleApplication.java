package com.richim.Company.Registration.Module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompanyRegistrationModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyRegistrationModuleApplication.class, args);
	}

}
