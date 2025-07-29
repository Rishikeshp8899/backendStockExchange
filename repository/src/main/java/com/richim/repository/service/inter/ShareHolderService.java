package com.richim.repository.service.inter;

import com.richim.repository.dto.RestRequest;
import com.richim.repository.dto.RestResponse;

public interface ShareHolderService {
void createShareHolder(RestRequest request,RestResponse response);
void getAllShareByShareholder(RestRequest request,RestResponse response);
void getShareDetailsByShareholderIdAndShareId(RestRequest request,RestResponse response);
void deleteShareByshareholderIdAndShareId(RestRequest request,RestResponse response);
void deleteAllShareByShareolderAndShareId(RestRequest request,RestResponse response);
}
