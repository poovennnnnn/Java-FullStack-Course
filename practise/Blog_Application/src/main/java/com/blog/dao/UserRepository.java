package com.blog.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
	Optional<User> findByEmail(String email);
	Optional<User> findByEmailOrUserName(String userName, String email);
	boolean existsByUserName(String userName);
	boolean existsByEmail(String email);
	
}
