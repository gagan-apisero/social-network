package com.backend.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.restapi.modal.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer> {

	@Query(value = "SELECT * FROM user_post_table WHERE username = :input1", nativeQuery = true)
	List<Posts> findPostByUser(@Param("input1") String username);
}
