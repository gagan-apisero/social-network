package com.backend.restapi.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.restapi.modal.AcceptedTable;
import com.backend.restapi.modal.Users;
import com.backend.restapi.sevices.AcceptedServices;
import com.backend.restapi.sevices.UserServices;

@RestController
public class AcceptedController {
	
	@Autowired
	private AcceptedServices acceptServices;
	
	@GetMapping("/get-friends/{id}")
	public List<AcceptedTable> get(@PathVariable Integer id) {
	       return acceptServices.Friends(id);    
	}
	
	@PostMapping("/accept-request")
	public void add(@RequestBody AcceptedTable accept) {
		acceptServices.save(accept);
	}
	
}
