package com.blog.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dto.Comment;
import com.blog.execptions.ResourceNotFoundException;
import com.blog.service.CommentService;

@RestController
@RequestMapping("/api/comment")
public class CommentController {


	private CommentService service;


	public CommentController(CommentService service) {
		super();
		this.service = service;
	}


	@PostMapping("/{postId}")
	public ResponseEntity<Comment> addComment(@PathVariable("postId") Long postId, @Valid @RequestBody Comment comment) throws ResourceNotFoundException{

		Comment newcomment = service.addComment(postId, comment);
		return new ResponseEntity<>(newcomment,HttpStatus.CREATED);
	}

	
	@GetMapping()
	public List<Comment> findAll() {


		return service.findAll();
	}




	public void deleteById(Long id) {
		
		service.deleteById(id);
	}



	public Comment findById(Long id) {
		return service.findById(id);
	}

}
