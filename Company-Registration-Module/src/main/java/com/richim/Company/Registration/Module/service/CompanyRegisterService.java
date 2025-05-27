package com.richim.Company.Registration.Module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richim.Company.Registration.Module.entity.CompanyRegistration;
import com.richim.Company.Registration.Module.repository.CompanyRegistrationRepository;

@Service
public class CompanyRegisterService implements CompanyRegisterServiceInterface{

	@Autowired
	private CompanyRegistrationRepository companyRegistrationRepository;

	@Override
	public CompanyRegistration addCompanyRegistration(CompanyRegistration companyRegistration) {
		
		if(companyRegistration == null)
			throw new IllegalArgumentException("comapany information is null");
		
		CompanyRegistration companyRegistration2 =companyRegistrationRepository.save(companyRegistration);
		if(companyRegistration2 == null)
			throw new IllegalArgumentException("comapany not able to store");
			
		return companyRegistration2;
		
	}
	
	
}
