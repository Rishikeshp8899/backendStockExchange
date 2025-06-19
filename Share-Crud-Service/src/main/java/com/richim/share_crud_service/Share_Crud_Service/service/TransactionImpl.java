package com.richim.share_crud_service.Share_Crud_Service.service;

import com.richim.share_crud_service.Share_Crud_Service.date.RequestData;

import jakarta.transaction.Transactional;

public class TransactionImpl implements Transaction {

	@Override
	@Transactional
	public void addTransaction(RequestData requestData) {
		
		
	}

}
