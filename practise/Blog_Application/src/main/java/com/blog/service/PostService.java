package com.blog.service;

import java.util.List;

import com.blog.dto.Post;
import com.blog.execptions.ResourceNotFoundException;

public interface PostService {
	
	Post createPost(Post post);
	List<Post> getAllPost();
	Post updatePost(Long id, Post post) throws ResourceNotFoundException;
	String deletePost(Long id) throws ResourceNotFoundException;
	Post getPostById(Long id) throws ResourceNotFoundException;
	

}
