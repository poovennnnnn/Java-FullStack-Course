package com.blog.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.blog.execptions.ResourceNotFoundException;
import io.jsonwebtoken.*;


@Component
public class JwtTokenProvider {

	@Value("${app.jwt-secret}")
	private String jwtSecret = "jwtSecret";

//	@Value("${app.jwt-expiration-milliseconds}")
	private int expirationInMs = 640404044;

	//generate token
	public String generateToken(Authentication auth) {

		String username = auth.getName();
		Date currentDate = new Date();
		Date expireDate = new Date(currentDate.getTime() + expirationInMs);

		String token = Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(expireDate)
				.signWith(SignatureAlgorithm.HS512,jwtSecret)
				.compact();

		return token;


	}			            


	//get username from jwt token
	public String getUsernameFromToken(String token) {
		Claims claim = Jwts.parser()
				.setSigningKey(jwtSecret)
				.parseClaimsJws(token)
				.getBody();

		return claim.getSubject();
	}


	//validate jwt token

	public boolean validateJwtToken(String token) throws ResourceNotFoundException {

		try {
			Jwts.parser()
			.setSigningKey(jwtSecret)
			.parseClaimsJws(token);

			return true;


		} catch (SignatureException e) {
			throw new ResourceNotFoundException("invalid", "jwt signature");
		} catch (ExpiredJwtException e) {
			throw new ResourceNotFoundException("invalid", "jwt Token");
		} catch (UnsupportedJwtException e) {
			throw new ResourceNotFoundException("Expired", "jwt token");
		} catch (MalformedJwtException e) {
			throw new ResourceNotFoundException("unsupported ", "jwt token");
		} catch (IllegalArgumentException e) {
			throw new ResourceNotFoundException("claim", "jwt is empty");		}
		
	}
}
