package com.richim.repository.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richim.repository.constant.ConstantValue;
import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.Company;
import com.richim.repository.mapper.CompanyMapperReq;
import com.richim.repository.mapper.CompanyMapperResponse;
import com.richim.repository.repository.CompanyRepo;

@Service
public class companyService {
	@Autowired
	private CompanyRepo companyRepo;
	
	@Autowired
	private CompanyMapperReq companyMapperReq;
	
	@Autowired
	private CompanyMapperResponse companyMapperResponse;
	
	public RestResponse addCompany(RestRequest request) {
		RestResponse response;
		Company company=companyRepo.save(companyMapperReq.toEntity(request));
		if(company ==null) {
			response= new RestResponse();
			response.setStatusCode(ConstantValue.failedCode);
			response.setStatus(ConstantValue.failedStatus);
			return response;
		}
		response= companyMapperResponse.toDto(company);
		response.setStatusCode(ConstantValue.sucessCode);
		response.setStatus(ConstantValue.sucessStatus);
		return response;
	}
	
	
	public RestResponse removeCompany(Long id) {
		RestResponse response;
		Company company=companyRepo.getById(id);
		try {
			companyRepo.deleteById(id);
		}
		catch(Exception  ex){
			response= companyMapperResponse.toDto(company);
			response.setStatusCode(ConstantValue.failedCode);
			response.setStatus(ConstantValue.failedStatus);
			return response;
		}
		response= companyMapperResponse.toDto(company);
		response.setStatusCode(ConstantValue.sucessCode);
		response.setStatus(ConstantValue.sucessStatus);
		return response;
	}
	
	
	public RestResponse updateCompany(RestRequest request) {
	    RestResponse response;

	    Optional<Company> optionalCompany = companyRepo.findByEmail(request.getCompany_email());
	    if (optionalCompany.isEmpty()) {
	        response = new RestResponse();
	        response.setStatusCode(ConstantValue.failedCode);
	        response.setStatus("Company not found");
	        return response;
	    }

	    Company existingCompany = optionalCompany.get();
	    existingCompany= companyMapperReq.toEntity(request);

	    Company updatedCompany = companyRepo.save(existingCompany);

	    response = companyMapperResponse.toDto(updatedCompany);
	    response.setStatusCode(ConstantValue.sucessCode);
	    response.setStatus(ConstantValue.sucessStatus);
	    return response;
	}
	
	public RestResponse getCompany(Long id) {
		RestResponse response;
		Company company=companyRepo.getById(id);
	if(company ==null){
			response= companyMapperResponse.toDto(company);
			response.setStatusCode(ConstantValue.failedCode);
			response.setStatus(ConstantValue.failedStatus);
			return response;
		}
		response= companyMapperResponse.toDto(company);
		response.setStatusCode(ConstantValue.sucessCode);
		response.setStatus(ConstantValue.sucessStatus);
		return response;
	}

}
