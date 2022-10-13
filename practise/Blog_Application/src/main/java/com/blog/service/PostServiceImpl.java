package com.blog.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.blog.dao.PostDao;
import com.blog.dto.Post;
import com.blog.execptions.ResourceNotFoundException;

@Service // service annotation is used to represtent it is a service
public class PostServiceImpl implements PostService {

	private PostDao dao ; //it is a best practice to define in a  constructor
	

	//Autowired is not required if you have only one constructor
	public PostServiceImpl(PostDao dao) {
		super();
		this.dao = dao;
	}


	//to create post implementation
	@Override
	public Post createPost( Post post) {
	
		
		
		return dao.save(post);
	}


	// get all post implementatiopn
	@Override
	public List<Post> getAllPost() {

		
	
		
		return dao.findAll();
	}

	// Get a post by id
	@Override
	public Post getPostById(Long id) throws ResourceNotFoundException {

		
		
		
		return dao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not Found", "post", id));
	}

	
	

	//update post implementation
	@Override
	public Post updatePost(Long id,Post post) throws ResourceNotFoundException {

		
		var savedPost = dao.findById(id).orElse(null);
		if(savedPost == null) {
			throw new ResourceNotFoundException("Not Found", "post", id);
		}
		
		savedPost.setContent(post.getContent());
		savedPost.setDescription(post.getDescription());
		savedPost.setTitle(post.getTitle());
		
		dao.save(savedPost);
		
		
		
		return savedPost;
	}


	//delete post implementation
	@Override
	public String deletePost(Long id) throws ResourceNotFoundException {
		
		var post = dao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not Found", "post", id));
		dao.deleteById(post.getId());
		
		
		return "Deleted";
	}


	


}
