package com.blog.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity // this means table  in the database
@JsonIgnoreProperties(ignoreUnknown = true)  // this is to ignore the the unknow property (or) field from the client
public class Post {
	
	@Id //This is unique id  for this table 
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // this will auto generate the unique id to the object
	private Long id;
	
	//validates the field minimum character is 2 and cannot be null and empty string
	@NotEmpty
	@Size(min = 2 , message = "Post title should have more than two caracters") 
	private String title;
	

	//validates the field minimum character is 2 and cannot be null and empty string
    @NotEmpty
    @Size(min = 2 , message = "Post description should have more than two caracters") 
	private String description;
	private String content;
	
	@JsonManagedReference // this anotation is for parent class 
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
	private Set<Comment> comments = new HashSet<>();
	
	
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;
	

	
	
	
	




	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Post(Long id, String title, String description, String content) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;

	}
	public Post() {
		super();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(content, description, id, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(content, other.content) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content + "]";
	}
	
	

}
