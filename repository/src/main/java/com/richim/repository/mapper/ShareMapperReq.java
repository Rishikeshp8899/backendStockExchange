package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.entity.Company;
import com.richim.repository.entity.Share;
import com.richim.repository.repository.CompanyRepo;


@Mapper
public interface ShareMapperReq {
	ShareMapperReq INSTANCE = Mappers.getMapper(ShareMapperReq.class);

	    RestRequest toDto( Share share);
	    Share toEntity(RestRequest dto);
}
