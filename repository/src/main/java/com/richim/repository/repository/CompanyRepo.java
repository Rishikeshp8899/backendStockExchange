package com.richim.repository.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.richim.repository.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long>{
	
	@Query("select c from Company c where c.company_email= ?1")
	public Optional<Company> findByEmail(String email);
}
