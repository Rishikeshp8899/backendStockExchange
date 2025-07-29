package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.DemandSupply;

@Mapper
public interface DemandSupplyMapperResp {
	DemandSupplyMapperResp INSTANCE = Mappers.getMapper(DemandSupplyMapperResp.class);

    RestResponse toDto(DemandSupply demandSupply);
    DemandSupply toEntity(RestResponse dto);
}
