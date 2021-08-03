package com.backend.restapi.sevices;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.restapi.modal.Posts;
import com.backend.restapi.repository.PostsRepository;

@Service
@Transactional
public class PostsServices {

	@Autowired
	private PostsRepository postRepo;

	public List<Posts> listAll() {
		return postRepo.findAll();
	}

	public void save(Posts post) {
		postRepo.save(post);
	}

	public Posts get(Integer id) {
		return postRepo.findById(id).get();
	}

	public void delete(Integer id) {
		postRepo.deleteById(id);
	}
	
	public List<Posts> listByUser(String username){
		return postRepo.findPostByUser(username);
	}

}
