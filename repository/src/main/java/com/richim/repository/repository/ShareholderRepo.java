package com.richim.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richim.repository.entity.Shareholder;

@Repository
public interface ShareholderRepo extends JpaRepository<Shareholder, Long> {

}
