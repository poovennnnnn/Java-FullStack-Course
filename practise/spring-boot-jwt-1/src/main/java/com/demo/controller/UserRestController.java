package com.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.model.UserRequest;
import com.demo.model.UserResponse;
import com.demo.service.IUserService;
import com.demo.util.JwtUtil;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private IUserService service;
	
	@Autowired
	private JwtUtil jwt;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		Integer id = service.saveUser(user);
		String body = "User '"+id +"'  saved";
		//return new ResponseEntity<String>(body,HttpStatus.OK);
		return ResponseEntity.ok(body);
		 
	}
	
	// validate username and password against database, and then if valid, then
	// using that username as the "subject" of JWT token, generate the token
	
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest){
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						userRequest.getUsername(), userRequest.getPassword()));

		//TODO : validate user against database
		String token =jwt.generateToken(userRequest.getUsername());
		
		return ResponseEntity.ok(new UserResponse(token, "Token created Successfully.."));
	} 
	
	// after login only.  2nd request onwards
	
	@PostMapping("/welcome")
	public ResponseEntity<String> accessData(Principal p) {
		return ResponseEntity.ok("hello user => " + p.getName());
	}
}
