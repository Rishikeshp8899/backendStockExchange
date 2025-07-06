package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.Company;
import com.richim.repository.repository.CompanyRepo;

@Mapper
public interface CompanyMapperResponse {
	 CompanyMapperResponse INSTANCE = Mappers.getMapper(CompanyMapperResponse.class);

	    RestResponse toDto(Company company);
	    Company toEntity(RestResponse dto);
}
