package com.blog.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dto.Post;
import com.blog.execptions.ResourceNotFoundException;
import com.blog.service.PostService;




@RestController
public class PostController {
	
	private PostService postService;


	public PostController(PostService postService) {
		super();
		this.postService = postService;
	
	}
	
	@GetMapping("/api/hello")
	public List<Post> hello() {
		List<Post> allPost = postService.getAllPost();
		return allPost;
	}
	
	
//	@PreAuthorize("hasRole('ADMIN')")
	//to create a post
	@PostMapping("/api/post")
	public ResponseEntity<Post> createPost(@Valid @RequestBody Post post) {
		if( post.getTitle() == null || post.getContent() ==null || post.getDescription() == null) {
			return new ResponseEntity<Post>(HttpStatus.BAD_GATEWAY);
		}
		
		
		return new ResponseEntity<>(postService.createPost(post),HttpStatus.CREATED);
		
	}
	//Get a single post
	
	@GetMapping("/api/posts/{id}")
	public Post findByid(@PathVariable Long id) throws ResourceNotFoundException {
		
		return postService.getPostById(id);
	}
	
	// getting all posts
	@GetMapping("/api/posts")
	public ResponseEntity<List<Post>> showAllPost(){		
		
		return new ResponseEntity<List<Post>>(postService.getAllPost() ,HttpStatus.OK);
	}
	
	//Update the post
//	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/api/post")
	public ResponseEntity<Object> updatePost(@Valid @RequestBody Post post) throws ResourceNotFoundException{
		if(post.getId() == 0 || post.getTitle() == null || post.getContent() ==null || post.getDescription() == null) {
			return new ResponseEntity<Object>(HttpStatus.BAD_GATEWAY);
		}
		
		
		return new  ResponseEntity<>(postService.updatePost(post.getId(), post),HttpStatus.CREATED);
	
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	//Delete Post
	@DeleteMapping("/api/post/{id}")
	public ResponseEntity<String> deletePost(@PathVariable("id") Long id) throws ResourceNotFoundException{
		if(id == 0) return new ResponseEntity<>("invalid Id", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<String>(postService.deletePost(id),HttpStatus.ACCEPTED);
	}
	

}
