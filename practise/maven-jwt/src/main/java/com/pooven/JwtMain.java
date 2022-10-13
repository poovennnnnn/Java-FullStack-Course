package com.pooven;

import io.jsonwebtoken.Claims;

public class JwtMain {

	public static void main(String[] args) {

		
		String token = JwtUtil.generateToken("101","pooven", "1234");
		
		System.out.println(token);
		
		Claims c =JwtUtil.getClaims("1234", token);
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());
		
	}

}
