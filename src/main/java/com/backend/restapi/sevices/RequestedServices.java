package com.backend.restapi.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.restapi.modal.Requested;
import com.backend.restapi.modal.Users;
import com.backend.restapi.repository.RequestRepository;


@Service
@Transactional
public class RequestedServices {
	
	@Autowired
	private RequestRepository reqRepo;
	
	public List<Requested> listAll(){
		return reqRepo.findAll();
	}
	
	public void save(Requested req) {
		reqRepo.save(req);
	}
	
	

}
