package com.richim.share_crud_service.Share_Crud_Service.service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richim.share_crud_service.Share_Crud_Service.date.RequestData;
import com.richim.share_crud_service.Share_Crud_Service.entity.Transaction;
import com.richim.share_crud_service.Share_Crud_Service.repository.TransactionRepo;

import jakarta.transaction.Transactional;

@Service
public class TransactionImpl implements TransactionService {
	
	@Autowired 
	private TransactionRepo transactionRepo;


	@Override
	@Transactional
	public void addTransaction(Transaction transaction) {
	ExecutorService  executor = Executors.newFixedThreadPool(3);
		
		//check type
		
		//call api
		transactionRepo.save()
		
	}

}
