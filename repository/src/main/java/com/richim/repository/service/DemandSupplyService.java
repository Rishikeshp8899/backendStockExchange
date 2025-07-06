package com.richim.repository.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.mapper.DemandSupplyMapperReq;
import com.richim.repository.repository.CompanyRepo;
import com.richim.repository.repository.DemandSupplyRepo;

public class DemandSupplyService {
	 @Autowired
	    private DemandSupplyRepo demandSupplyRepo;

	    @Autowired
	    private CompanyRepo companyRepo;

	    private final DemandSupplyMapperReq mapperReq = DemandSupplyMapperReq.INSTANCE;

	    public String createDemandSupply(RestRequest request) {
	        Optional<Company> optionalCompany = companyRepo.findById(request.getCompanyId());
	        if (optionalCompany.isEmpty()) {
	            return "Company not found";
	        }

	        DemandSupply ds = new DemandSupply();
	        ds.setCompany(optionalCompany.get());
	        ds.setDemand(request.getDemand());
	        ds.setSupply(request.getSupply());
	        ds.setAtPrice(request.getAtPrice());

	        demandSupplyRepo.save(ds);
	        return "DemandSupply created successfully";
	    }

	    public List<DemandSupplyResponse> getAllDemandSupply() {
	        return demandSupplyRepo.findAll()
	                .stream()
	                .map(mapper::toDto)
	                .collect(Collectors.toList());
	    }

	    public DemandSupplyResponse getDemandSupplyById(Long id) {
	        return demandSupplyRepo.findById(id)
	                .map(mapper::toDto)
	                .orElse(null);
	    }

	    public String updateDemandSupply(Long id, DemandSupplyRequest request) {
	        Optional<DemandSupply> optionalDS = demandSupplyRepo.findById(id);
	        if (optionalDS.isEmpty()) {
	            return "DemandSupply record not found";
	        }

	        Optional<Company> optionalCompany = companyRepo.findById(request.getCompanyId());
	        if (optionalCompany.isEmpty()) {
	            return "Company not found";
	        }

	        DemandSupply ds = optionalDS.get();
	        ds.setCompany(optionalCompany.get());
	        ds.setDemand(request.getDemand());
	        ds.setSupply(request.getSupply());
	        ds.setAtPrice(request.getAtPrice());

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
