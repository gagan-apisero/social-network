package com.backend.restapi.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.restapi.modal.Users;
import com.backend.restapi.sevices.UserServices;

@RestController
public class UserController {
		
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/users")
	public List<Users> list(){
		return userServices.listAll();
	}
	
	@GetMapping("/get_user/{id}")
	public ResponseEntity<Users> get(@PathVariable Integer id) {
	    try {
	        Users user = userServices.get(id);
	        return new ResponseEntity<Users>(user, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
	    }
	}
	
	@PostMapping("/signup")
	public void add(@RequestBody Users user) {
		userServices.save(user);
	}
	
	@PutMapping("/update_user/{id}")
	public ResponseEntity<?> update(@RequestBody Users user, @PathVariable Integer id) {
	    try {
	    	Users existUser = userServices.get(id);
	    	userServices.save(user);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/delete_user/{id}")
	public void delete(@PathVariable Integer id) {
		userServices.delete(id);
	}
}
