package com.richim.repository.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richim.repository.entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long>{
public Optcional<Company> findByEmail(String email);
}
