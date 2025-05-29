package com.richim.Company.Registration.Module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.richim.Company.Registration.Module.data.RestInputController;
import com.richim.Company.Registration.Module.data.RestOutputController;
import com.richim.Company.Registration.Module.data.StutusData;
import com.richim.Company.Registration.Module.entity.CompanyRegistration;
import com.richim.Company.Registration.Module.mapper.MappingInputForController;
import com.richim.Company.Registration.Module.service.CompanyRegisterService;
import com.richim.Company.Registration.Module.service.CompanyRegisterServiceInterface;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyRegistrationController {

	@Autowired
	private CompanyRegisterService companyRegisterService;
	
	@PostMapping("/addCompanyRegistration")
	public ResponseEntity<RestOutputController> addRegistration(@RequestBody RestInputController restInputController) {
		RestOutputController outputController=new RestOutputController();
		restInputController.setApiName("addCompanyRegister");
		CompanyRegistration companyRegistration=MappingInputForController.getServiceInput(restInputController);
		if(companyRegistration != null) {
			try {
				CompanyRegistration companyRegistration2=companyRegisterService.addCompanyRegistration(companyRegistration);
				outputController.setStatus(StutusData.successStatus);
				outputController.setStatusCode(StutusData.success);
				
				return ResponseEntity.ok(outputController);
				
			}catch (Exception e){
				outputController.setStatus(StutusData.failureStatus);
				outputController.setStatusCode(StutusData.failure);
				
				   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(outputController);
			}
			
		}
		outputController.setStatus(StutusData.failureStatus);
		outputController.setStatusCode(StutusData.failure);
		
		   return ResponseEntity.badRequest().body(outputController);
	}
	
}
