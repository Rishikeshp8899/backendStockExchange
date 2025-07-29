package com.richim.repository.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.richim.repository.entity.Share;
import com.richim.repository.entity.Shareholder;

import jakarta.transaction.Transactional;

@Repository
public interface ShareRepo extends JpaRepository<Share,Long>{
	
	 @Query("SELECT s FROM Share s WHERE s.shareholder = :shareholder")
	    List<Share> findShareByShareholderId(@Param("shareholder") Shareholder shareholder);

	    @Modifying
	    @Transactional
	    @Query("DELETE FROM Share s WHERE s.shareholder = :shareholder")
	    int deleteAllShareByShareholderId(@Param("shareholder") Shareholder shareholder);
	

}
