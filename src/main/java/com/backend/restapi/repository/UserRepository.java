package com.backend.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.restapi.modal.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
