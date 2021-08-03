package com.backend.restapi.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.restapi.modal.Users;
import com.backend.restapi.repository.UserRepository;

@Service
@Transactional
public class UserServices {

	@Autowired
	private UserRepository userRepo;
	
	public List<Users> listAll(){
		return userRepo.findAll();
	}

	public void save(Users user) {
		userRepo.save(user);
	}
	
	public Users get(Integer id) {
		return userRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		userRepo.deleteById(id);
	}
	
	public List<Users> listByRole(String roleName){
		return userRepo.findUsersByRole(roleName);
	}
}
