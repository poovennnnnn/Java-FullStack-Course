package com.blog.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "user", uniqueConstraints = {
		@UniqueConstraint(columnNames = "user_name"),
		@UniqueConstraint(columnNames = "email"),
		
})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	@Column(name = "user_name")
	private String userName;
	private String email;
	private  String password;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name = "user_role" ,
	joinColumns = @JoinColumn(name ="user_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
	private Set<Role> role = new HashSet<>();
	
	

}

