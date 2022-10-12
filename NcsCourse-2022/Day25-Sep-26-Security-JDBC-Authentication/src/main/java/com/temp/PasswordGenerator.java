package com.temp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		String password = new BCryptPasswordEncoder().encode("pooven");
		System.out.println(password);
		
	}

}
