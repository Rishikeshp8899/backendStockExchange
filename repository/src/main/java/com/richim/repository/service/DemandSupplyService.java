package com.richim.repository.service;



import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.richim.repository.constant.TypeOfRequest;
import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.Company;
import com.richim.repository.entity.DemandSupply;
import com.richim.repository.mapper.DemandSupplyMapperReq;
import com.richim.repository.mapper.DemandSupplyMapperResp;
import com.richim.repository.repository.CompanyRepo;
import com.richim.repository.repository.DemandSupplyRepo;

public class DemandSupplyService {
	 @Autowired
	    private DemandSupplyRepo demandSupplyRepo;

	    @Autowired
	    private CompanyRepo companyRepo;

	    private final DemandSupplyMapperReq mapperReq = DemandSupplyMapperReq.INSTANCE;
	    
	    private final DemandSupplyMapperResp mapperResp = DemandSupplyMapperResp.INSTANCE;

	    public String createDemandSupply(RestRequest request) {
	        Optional<Company> optionalCompany = companyRepo.findById(request.getCompnayId());
	        if (optionalCompany.isEmpty()) {
	            return "Company not found";
	        }

	        DemandSupply ds = new DemandSupply();
	        ds.setComapany(optionalCompany.get());
	        ds.setDemand(request.getTypeOfRequest()==TypeOfRequest.Buyer?request.getNumberOfShare():0);
	        ds.setSupply(request.getTypeOfRequest()==TypeOfRequest.Seller?request.getNumberOfShare():0);
	        ds.setAtPrice(request.getSharePrice());

	        demandSupplyRepo.save(ds);
	        return "DemandSupply created successfully";
	    }

	    public List<RestResponse> getAllDemandSupply() {
	        return demandSupplyRepo.findAll()
	                .stream()
	                .map(mapperResp::toDto)
	                .toList();
	    }

	    public RestResponse getDemandSupplyById(Long id) {
	        return demandSupplyRepo.findById(id)
	                .map(mapperResp::toDto)
	                .orElse(null);
	    }

	    public String updateDemandSupply(Long id, RestRequest request) {
	        Optional<DemandSupply> optionalDS = demandSupplyRepo.findById(id);
	        if (optionalDS.isEmpty()) {
	            return "DemandSupply record not found";
	        }

	        Optional<Company> optionalCompany = companyRepo.findById(request.getCompnayId());
	        if (optionalCompany.isEmpty()) {
	            return "Company not found";
	        }
	        DemandSupply ds = new DemandSupply();
	        ds.setComapany(optionalCompany.get());
	        ds.setDemand(request.getTypeOfRequest()==TypeOfRequest.Buyer?request.getNumberOfShare():0);
	        ds.setSupply(request.getTypeOfRequest()==TypeOfRequest.Seller?request.getNumberOfShare():0);
	        ds.setAtPrice(request.getSharePrice());

	        demandSupplyRepo.save(ds);
	        return "DemandSupply updated successfully";
	    }

	    public String deleteDemandSupply(Long id) {
	        if (!demandSupplyRepo.existsById(id)) {
	            return "DemandSupply record not found";
	        }

	        demandSupplyRepo.deleteById(id);
	        return "DemandSupply deleted successfully";
	    }
}
