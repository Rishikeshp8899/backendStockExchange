package com.richim.Company.Registration.Module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richim.Company.Registration.Module.entity.CompanyRegistration;

@Repository
public interface CompanyRegistrationRepository extends JpaRepository<CompanyRegistration, Long> {

}
