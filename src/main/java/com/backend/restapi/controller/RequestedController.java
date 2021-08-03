package com.backend.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.backend.restapi.modal.Requested;
import com.backend.restapi.sevices.RequestedServices;

public class RequestedController {
	@Autowired
	private RequestedServices reqServices;
	
	@GetMapping("/all_requests")
	public List<Requested> list(){
		return reqServices.listAll();
	}
	
	
	
	

}
