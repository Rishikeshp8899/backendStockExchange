package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.Shareholder;

@Mapper
public interface ShareHolderMapperResp {
	ShareHolderMapperResp INSTANCE = Mappers.getMapper(ShareHolderMapperResp.class);

    RestResponse toDto(Shareholder shareholder);
    Shareholder toEntity(RestResponse dto);
}
