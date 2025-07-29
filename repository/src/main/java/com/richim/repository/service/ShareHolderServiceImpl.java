package com.richim.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.richim.repository.constant.ConstantValue;
import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;
import com.richim.repository.entity.Share;
import com.richim.repository.entity.Shareholder;
import com.richim.repository.mapper.ShareHolderMapperReq;
import com.richim.repository.mapper.ShareHolderMapperResp;
import com.richim.repository.repository.ShareRepo;
import com.richim.repository.repository.ShareholderRepo;
import com.richim.repository.service.inter.ShareHolderService;

public class ShareHolderServiceImpl implements ShareHolderService {

	@Autowired
	private ShareholderRepo repo;
	
	@Autowired
	private ShareRepo shareRepo;
	
	private ShareHolderMapperReq mapperReq=ShareHolderMapperReq.INSTANCE;
	private ShareHolderMapperResp mapperRes=ShareHolderMapperResp.INSTANCE;
	
	
	@Override
	public void createShareHolder(RestRequest request, RestResponse response) {
	    try {
	        Shareholder shareholder = mapperReq.toEntity(request);
	        Shareholder savedShareholder = repo.save(shareholder);

	        if (savedShareholder != null) {
	            response.setStatus(ConstantValue.sucessStatus);
	            response.setStatusCode(ConstantValue.sucessCode);
	        } else {
	        	  response.setStatus(ConstantValue.failedStatus);
		            response.setStatusCode(ConstantValue.failedCode);
	        }
	    } catch (Exception e) {
	    	 response.setStatus(ConstantValue.failedStatus);
	            response.setStatusCode(ConstantValue.failedCode);
	    }
	}

	@Override
	public void getAllShareByShareholder(RestRequest request, RestResponse response) {
		try {
			Long shareholderId = request.getShareholderId();
			Shareholder shareholder = repo.findById(shareholderId).orElse(null);
			if (shareholder == null) {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
			}

			response.setShareList(shareRepo.findShareByShareholderId(shareholder));
			response.setStatus(ConstantValue.sucessStatus);
			response.setStatusCode(ConstantValue.sucessCode);
		} catch (Exception e) {
			response.setStatus(ConstantValue.failedStatus);
			response.setStatusCode(ConstantValue.failedCode);
		}
	
	}

	@Override
	public void getShareDetailsByShareholderIdAndShareId(RestRequest request, RestResponse response) {
		try {
			Long shareholderId = request.getShareholderId();
			Long shareId = request.getShareId();

			Shareholder shareholder = repo.findById(shareholderId).orElse(null);
			if (shareholder == null) {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
			}

			Share share = shareRepo.findShareByShareholderId(shareholder).stream().filter(n-> n.getShareId().equals(shareId)).findFirst().orElse(null);
			if (share == null || !share.getShareId().equals(shareId)) {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
			}

			response.setShare(share);
			response.setStatus(ConstantValue.sucessStatus);
			response.setStatusCode(ConstantValue.sucessCode);
			
		}catch (Exception e) {
			response.setStatus(ConstantValue.failedStatus);
			response.setStatusCode(ConstantValue.failedCode);
			return;
		}
		
	}

	@Override
	public void deleteShareByshareholderIdAndShareId(RestRequest request, RestResponse response) {
		try {
			Long shareholderId = request.getShareholderId();
			Long shareId = request.getShareId();
			
			Shareholder shareholder = repo.findById(shareholderId).orElse(null);
			if(shareholder == null) {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
			}
			
			Optional<Share> share=shareRepo.findById(shareId);
			
			if(share.isPresent() && share.get().getShareholder().equals(shareholder)) {
				try {
					shareRepo.delete(share.get());
					response.setStatus(ConstantValue.sucessStatus);
					response.setStatusCode(ConstantValue.sucessCode);
					return;
				}catch (Exception e) {
					response.setStatus(ConstantValue.failedStatus);
					response.setStatusCode(ConstantValue.failedCode);
					return;
				}
				
			}else {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
				
			}
			
			
			
		}catch (Exception e) {
			response.setStatus(ConstantValue.failedStatus);
			response.setStatusCode(ConstantValue.failedCode);
			return;
		}

	}

	@Override
	public void deleteAllShareByShareolderAndShareId(RestRequest request, RestResponse response) {
		try {
			Long shareholderId = request.getShareholderId();
			Shareholder shareholder = repo.findById(shareholderId).orElse(null);
			if(shareholder == null) {
				response.setStatus(ConstantValue.failedStatus);
				response.setStatusCode(ConstantValue.failedCode);
				return;
			} 
			
		int result= shareRepo.deleteAllShareByShareholderId(shareholder);
		if(result >0) {
			response.setStatus(ConstantValue.sucessStatus);
			response.setStatusCode(ConstantValue.sucessCode);
			return;
		}else {
			response.setStatus(ConstantValue.failedStatus);
			response.setStatusCode(ConstantValue.failedCode);
			return;
		}
			
		}catch (Exception e) {
			response.setStatus(ConstantValue.failedStatus);
			response.setStatusCode(ConstantValue.failedCode);
			return;
		}

	}

}
