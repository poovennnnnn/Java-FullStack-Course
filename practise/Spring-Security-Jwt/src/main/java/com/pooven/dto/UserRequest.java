package com.pooven.dto;

import java.util.Objects;

import javax.validation.constraints.NotNull;

public class UserRequest {

	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	public UserRequest() {
		super();
	}

	public UserRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRequest other = (UserRequest) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	
	

}
