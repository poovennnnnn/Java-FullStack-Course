package com.pooven.dto;

import java.util.Objects;

public class UserResponse {
	
	private String token;
	private String message;

	public UserResponse() {
		super();
	}

	public UserResponse(String token, String message) {
		super();
		this.token = token;
		this.message = message;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, token);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserResponse other = (UserResponse) obj;
		return Objects.equals(message, other.message) && Objects.equals(token, other.token);
	}

	@Override
	public String toString() {
		return "UserResponse [token=" + token + ", message=" + message + "]";
	}

	
	
}
