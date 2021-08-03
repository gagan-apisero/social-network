package com.backend.restapi.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.backend.restapi.modal.AcceptedTable;
import com.backend.restapi.modal.Users;
import com.backend.restapi.repository.AcceptedRepository;

@Service
@Transactional
public class AcceptedServices {
	@Autowired
	private AcceptedRepository acceptRepo;
	
	
	public List<AcceptedTable> Friends(Integer id){
		return acceptRepo.findFriends(id);
	}
	public void save(AcceptedTable accept) {
		acceptRepo.save(accept);
	}
}
