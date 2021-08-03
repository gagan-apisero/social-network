package com.backend.restapi.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.restapi.modal.AcceptedTable;


public interface AcceptedRepository extends JpaRepository<AcceptedTable, Integer> {
	
	@Query(value="Select * from accepted_table where user_id=:id OR accepted_id=:id", nativeQuery = true)
	 List<AcceptedTable> findFriends(@Param("id") Integer id);
}
