package com.security.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class JdbcSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.antMatchers("/admin").access("hasRole('ADMIN')")
		.antMatchers("/user").access("hasRole('USER') OR hasRole('ADMIN')" )
		.and()
		.formLogin();
		
		
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		String SelectByUsernameCommand = "SELECT username,password, enabled FROM users WHERE username=?";
		String authoritiesCommand = "SELECT username,authority FROM authorities WHERE username=?";
		
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(SelectByUsernameCommand)
		.authoritiesByUsernameQuery(authoritiesCommand)
		.passwordEncoder(new BCryptPasswordEncoder());
		
	}

}
