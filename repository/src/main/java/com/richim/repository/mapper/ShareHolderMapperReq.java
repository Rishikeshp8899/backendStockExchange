package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.entity.Company;
import com.richim.repository.entity.Shareholder;
import com.richim.repository.repository.CompanyRepo;

@Mapper(componentModel = "spring")
public interface ShareHolderMapperReq {
	ShareHolderMapperReq INSTANCE = Mappers.getMapper(ShareHolderMapperReq.class);

	@Mapping(source = "shareholderName", target = "name") 
	@Mapping(source = "company_email", target = "email")
    @Mapping(source = "shareList", target = "share")
	    RestRequest toDto(Shareholder shareholder);
	
	@Mapping(source = "name", target = "shareholderName") 
	@Mapping(source = "email", target = "company_email")
    @Mapping(source = "share", target = "shareList")
	    Shareholder toEntity(RestRequest dto);
}
