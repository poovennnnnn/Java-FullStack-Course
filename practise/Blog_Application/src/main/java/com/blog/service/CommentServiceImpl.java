package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.dao.CommentsDao;
import com.blog.dao.PostDao;
import com.blog.dto.Comment;
import com.blog.dto.Post;
import com.blog.execptions.ResourceNotFoundException;

@Service
public class CommentServiceImpl implements CommentService {
	
	PostDao postDao;
	CommentsDao commentDao;
	
	

	public CommentServiceImpl(PostDao postDao, CommentsDao commentDao) {
		super();
		this.postDao = postDao;
		this.commentDao = commentDao;
	}



	@Override
	public Comment addComment(Long postId, Comment comment) throws ResourceNotFoundException {
		
		Post post = postDao.findById(postId).orElseThrow(()-> new ResourceNotFoundException("cant find PostID", "error", postId));
	  
		comment.setPost(post);
		
		Comment newComment = commentDao.save(comment);
		return newComment;
	}



	@Override
	public List<Comment> findAll() {
		
		
		return commentDao.findAll();
	}





	@Override
	public void deleteById(Long id) {
		
		commentDao.deleteById(id);
	}



	@Override
	public Comment findById(Long id) {
		return commentDao.findById(id).get();
	}
	
	

}
