package com.pooven.util;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	
	public  String generateToken(String sub) {
		
		return Jwts.builder()
				    .setSubject(sub)
				    .setIssuer("pooven")
				    .setIssuedAt(new Date(System.currentTimeMillis()))
				    .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))
				    .signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode("1234".getBytes()))
				    .compact();
	}
	
   public  Claims getClaims(String token) {
	   
	   return Jwts.parser()
			      .setSigningKey(Base64.getEncoder().encode("1234".getBytes()))
			      .parseClaimsJws(token)
			      .getBody();
	   
   }
   
   public  String getSubject(String key,String token) {
	   return getClaims( token).getSubject();
   }
   
//   public boolean isValidToken(String key,String token) {
//	   
//	   return getClaims( token).getExpiration().after(new Date(System.currentTimeMillis()));
//   }

   public  Date getExpiryDate(String token) {
	   return getClaims(token).getExpiration();
   }
   
   public boolean isTokenExpired(String token) {
	   Date expDate = getExpiryDate(token);
	   return expDate.before(new Date(System.currentTimeMillis()));
   }
   
   
   public   String getUsername(String token) {
	   
	   return getClaims(token).getSubject();
   }
   
   public   boolean validateToken(String token,String username) {
	   String tokenName = getUsername(token);
	   return 
			   (tokenName.equals(username) && !isTokenExpired(token));
   }
}
