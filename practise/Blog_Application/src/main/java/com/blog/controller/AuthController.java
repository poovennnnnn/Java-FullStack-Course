package com.blog.controller;



import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.RoleRepository;
import com.blog.dao.UserRepository;
import com.blog.dto.JwtAuthResponse;
import com.blog.dto.LoginDto;
import com.blog.dto.Role;
import com.blog.dto.SignUpDto;
import com.blog.dto.User;
import com.blog.security.JwtTokenProvider;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthenticationManager authManager;
	private UserRepository userRepo;
	private RoleRepository roleRepo;
	private PasswordEncoder passwordEncode;
	private JwtTokenProvider jwtProvider;

	public AuthController(AuthenticationManager authManager, JwtTokenProvider jwtProvider,UserRepository userRepo, RoleRepository roleRepo,
			PasswordEncoder passwordEncode) {
		super();
		this.authManager = authManager;
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.passwordEncode = passwordEncode;
		this.jwtProvider = jwtProvider;
	}






	@PostMapping("/signin")
	public ResponseEntity<Object> sigin(@RequestBody LoginDto logindto){
		
		Authentication authentication = authManager.authenticate
				(new UsernamePasswordAuthenticationToken
				(logindto.getUsernameOrEmail(),logindto.getPassword()));
		
	
		
		System.out.println(authentication.toString());
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		//generate token
		String token = jwtProvider.generateToken(authentication);
		System.out.println(token);
		
		
		return new ResponseEntity<Object>(new JwtAuthResponse(token),HttpStatus.OK);
	}
	
	
	@PostMapping("/signup")
	public ResponseEntity<Object> signUp(@RequestBody SignUpDto signUpdto){
		//check if user exists by username
		if(userRepo.existsByUserName(signUpdto.getUsername())) {
			return new ResponseEntity<Object>("Username Already Taken",HttpStatus.BAD_GATEWAY);
		}
		
		//check if user exists by Email
		
		if(userRepo.existsByEmail(signUpdto.getEmail())) {
			return new ResponseEntity<Object>("Email Already exists",HttpStatus.BAD_GATEWAY);
		}
		
		User user = new User();
		user.setEmail(signUpdto.getEmail());
		user.setUserName(signUpdto.getUsername());
		user.setName(signUpdto.getName());
		user.setPassword(passwordEncode.encode(signUpdto.getPassword()));
		
		Role role = roleRepo.findByName("ROLE_ADMIN").get();
		user.setRole(Collections.singleton(role));

		userRepo.save(user);
		return new ResponseEntity<Object>("Register Successfully",HttpStatus.OK);
	}
	
	
	

}
