package com.richim.share_crud_service.Share_Crud_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richim.share_crud_service.Share_Crud_Service.entity.Shareholder;

public interface ShareHolderRepo extends JpaRepository<Shareholder, Long>{

}
