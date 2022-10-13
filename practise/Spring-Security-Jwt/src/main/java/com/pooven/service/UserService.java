package com.pooven.service;

import java.util.Optional;

import com.pooven.dto.User;

public interface UserService {
	
	public Integer saveUser(User user);
	public Optional<User> findByUsername(String username);
	boolean existsByUsername(String username);

}
