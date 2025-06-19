package com.richim.share_crud_service.Share_Crud_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richim.share_crud_service.Share_Crud_Service.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {

}
