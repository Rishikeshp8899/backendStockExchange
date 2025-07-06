package com.richim.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richim.repository.entity.Share;

@Repository
public interface ShareRepo extends JpaRepository<Share,Long>{

}
