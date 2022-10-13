package com.blog.security;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blog.dao.UserRepository;
import com.blog.dto.Role;
import com.blog.dto.User;

@Service
public class CustomDetailService implements UserDetailsService {
	
	private UserRepository repo;

	public CustomDetailService(UserRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByEmailOrUserName(username, username)
				 .orElseThrow(()-> new UsernameNotFoundException("User not Found Username or Email is :"+username));
		
		
		
		return new org.springframework.security.core.userdetails.User
				(user.getEmail(), user.getPassword(), mapToGrantedAuthority(user.getRole()));
	}
	
	
	private Collection<? extends GrantedAuthority> mapToGrantedAuthority(Set<Role> role){
		
		List<SimpleGrantedAuthority> authoritylist = role.stream()
		    .map((item) -> new SimpleGrantedAuthority(item.getName()))
		    .collect(Collectors.toList());
		
		return authoritylist;
	}

}
