package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.entity.Company;
import com.richim.repository.repository.CompanyRepo;

@Mapper
public interface CompanyMapperReq {
	 CompanyMapperReq INSTANCE = Mappers.getMapper(CompanyMapperReq.class);

	    RestRequest toDto(Company company);
	    Company toEntity(RestRequest dto);
}
