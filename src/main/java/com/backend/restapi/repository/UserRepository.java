package com.backend.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.restapi.modal.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	@Query(value = "SELECT * FROM user_table WHERE role = :roleName", nativeQuery = true)
    List<Users> findUsersByRole(@Param("roleName") String roleName);
	
	
}
