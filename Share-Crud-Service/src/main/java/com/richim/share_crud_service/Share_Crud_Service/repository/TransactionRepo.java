package com.richim.share_crud_service.Share_Crud_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richim.share_crud_service.Share_Crud_Service.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {

}
