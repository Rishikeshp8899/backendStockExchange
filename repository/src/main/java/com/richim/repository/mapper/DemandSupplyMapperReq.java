package com.richim.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.entity.Company;
import com.richim.repository.entity.DemandSupply;
import com.richim.repository.repository.CompanyRepo;


@Mapper
public interface DemandSupplyMapperReq {
	DemandSupplyMapperReq INSTANCE = Mappers.getMapper(DemandSupplyMapperReq.class);

	    RestRequest toDto(DemandSupply demandSupply);
	    DemandSupply toEntity(RestRequest dto);
}
