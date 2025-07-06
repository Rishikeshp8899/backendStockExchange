package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.entity.Company;
import com.richim.repository.entity.Shareholder;
import com.richim.repository.repository.CompanyRepo;

@Mapper
public interface ShareHolderMapperReq {
	ShareHolderMapperReq INSTANCE = Mappers.getMapper(ShareHolderMapperReq.class);

	    RestRequest toDto(Shareholder company);
	    Shareholder toEntity(RestRequest dto);
}
