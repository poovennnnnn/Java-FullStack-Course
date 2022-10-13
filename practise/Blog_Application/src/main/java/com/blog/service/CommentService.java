package com.blog.service;



import java.util.List;

import com.blog.dto.Comment;
import com.blog.execptions.ResourceNotFoundException;


public interface CommentService {
	
	Comment addComment(Long postId, Comment comment) throws ResourceNotFoundException;
	List<Comment> findAll();
	
	void deleteById(Long id);
	Comment findById(Long id);

}
