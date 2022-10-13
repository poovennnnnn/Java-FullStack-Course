package com.blog.dto;

import lombok.Data;

@Data
public class JwtAuthResponse {
	
	private String jwtToken;
	private String tokenType = "Bearer ";
	public JwtAuthResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}
	
	

}
