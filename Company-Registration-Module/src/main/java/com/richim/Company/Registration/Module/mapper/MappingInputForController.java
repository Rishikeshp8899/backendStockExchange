package com.richim.Company.Registration.Module.mapper;

import com.richim.Company.Registration.Module.data.RestInputController;
import com.richim.Company.Registration.Module.entity.CompanyRegistration;

public class MappingInputForController {

	public static  <T> T getServiceInput(RestInputController inputController) {
		switch (inputController.getApiName()) {
		case "addCompanyRegister":{
			CompanyRegistration companyRegistration=new CompanyRegistration();
			companyRegistration.setCompany_name(inputController.getCompany_name());
			companyRegistration.setCompany_email(inputController.getCompany_email());
			companyRegistration.setContact_no(inputController.getContact_no());
			companyRegistration.setLocation(inputController.getLocation());
			companyRegistration.setPassword(inputController.getPassword());
			companyRegistration.setTurnover1(inputController.getTurnover_no_1());
			companyRegistration.setTurnover2(inputController.getTurnover_no_2());
			companyRegistration.setTurnover3(inputController.getTurnover_no_3());
			companyRegistration.setTurnover4(inputController.getTurnover_no_4());
			companyRegistration.setTurnover5(inputController.getTurnover_no_5());
			return (T) companyRegistration;
		}

		default:
			break;
		}
		return null;
	} 
	
}
