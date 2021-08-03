package com.backend.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.restapi.modal.Requested;

public interface RequestRepository extends JpaRepository<Requested,Integer>{

}
