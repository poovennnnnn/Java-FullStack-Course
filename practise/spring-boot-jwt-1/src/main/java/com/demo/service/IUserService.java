package com.demo.service;

import java.util.Optional;

import com.demo.model.User;

public interface IUserService {

	public Integer saveUser(User user);
	public Optional<User> findByUsername(String username);
}
