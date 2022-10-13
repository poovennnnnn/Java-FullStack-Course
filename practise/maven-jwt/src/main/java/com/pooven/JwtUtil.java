package com.pooven;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	public static String generateToken(String id,String sub,String key) {
		
		return Jwts.builder()
				    .setId(id)
				    .setSubject(sub)
				    .setIssuer("pooven")
				    .setIssuedAt(new Date(System.currentTimeMillis()))
				    .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))
				    .signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(key.getBytes()))
				    .compact();
	}
	
   public static Claims getClaims(String key,String token) {
	   
	   return Jwts.parser()
			      .setSigningKey(Base64.getEncoder().encode(key.getBytes()))
			      .parseClaimsJws(token)
			      .getBody();
	   
   }
   
   public static String getSubject(String key,String token) {
	   return getClaims(key, token).getSubject();
   }
   
   public boolean isValidToken(String key,String token) {
	   
	   return getClaims(key, token).getExpiration().after(new Date(System.currentTimeMillis()));
   }
}









