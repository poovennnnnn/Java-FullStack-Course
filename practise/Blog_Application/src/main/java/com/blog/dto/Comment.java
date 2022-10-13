package com.blog.dto;

import java.util.Objects;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//validates the field minimum character is 2 and cannot be null and empty string
	@NotEmpty
	@Size(min = 5 , message = "Comment:  name should have more than five characters") 
	private String name;
	
	
	//validates the email whether its correct syntax or not
	@Email(message = "your Email id should be valid email")
	@NotEmpty
	private String email;
	
	//validates the field minimum character is 2 and cannot be null and empty string
	@NotEmpty
	@Size(min = 10 , message = "Comment:  name should have more than Ten characters") 
	private String body;
	

	@JsonBackReference// this anotation is for child class 
	@ManyToOne // connecting comments class to post class using this anotations
	@JoinColumn(name = "post_id",nullable = false)
	private Post post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Comment() {
		super();
	
	}

	public Comment(Long id, String name, String email, String body, Post post) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
		this.post = post;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, email, id, name, post);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(body, other.body) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(post, other.post);
	}

	
}
