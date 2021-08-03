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

import com.backend.restapi.modal.Posts;
import com.backend.restapi.sevices.PostsServices;

@RestController
public class PostsController {

	@Autowired
	private PostsServices postService;

	@GetMapping("/posts")
	public List<Posts> list() {
		return postService.listAll();
	}

	@GetMapping("/get_post/{id}")
	public ResponseEntity<Posts> get(@PathVariable Integer id) {
		try {
			Posts post = postService.get(id);
			return new ResponseEntity<Posts>(post, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Posts>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/posts_by_username/{usr}")
	public List<Posts> listByUser(@PathVariable String usr) {
		return postService.listByUser(usr);
	}
	
	@PostMapping("/createpost")
	public void add(@RequestBody Posts post) {
		postService.save(post);
	}

	@PutMapping("/update_post/{id}")
	public ResponseEntity<?> update(@RequestBody Posts post, @PathVariable Integer id) {
		try {
			Posts existPost = postService.get(id);
			postService.save(post);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/delete_post/{id}")
	public void delete(@PathVariable Integer id) {
		postService.delete(id);
	}
}
