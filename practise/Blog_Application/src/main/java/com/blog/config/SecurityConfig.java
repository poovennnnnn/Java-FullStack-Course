package com.blog.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.blog.security.JwtAuthenticationEntryPoint;
import com.blog.security.JwtSecurityFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig{


	
	@Autowired
	private JwtAuthenticationEntryPoint authEntryPoint;




	@Bean
	JwtSecurityFilter getJwtFilter() {
		return new JwtSecurityFilter();
	}


	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


	@Bean
	protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.exceptionHandling()
		.authenticationEntryPoint(authEntryPoint)
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authorizeRequests((authorize) -> authorize

				.antMatchers(HttpMethod.GET, "/api/v1/**").permitAll()
				.antMatchers("/api/auth/**").permitAll()
				.anyRequest()
				.authenticated()
				);
		http.addFilterBefore(getJwtFilter(), UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}




	@Bean
	public AuthenticationManager authenticationManager(
			AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}





	//	@Bean
	//	@Override
	//	protected UserDetailsService userDetailsService() {
	//		
	//		UserDetails pooven = User.builder()
	//				                        .username("pooven")
	//				                        .password(passwordEncoder().encode("pooven"))
	//				                        .roles("USER","SUPER")
	//				                        .build();
	//		UserDetails superUser = User.builder()
	//                .username("super")
	//                .password(passwordEncoder().encode("super"))
	//                .roles("SUPER")
	//                .build();
	//		UserDetails admin = User.builder()
	//                .username("admin")
	//                .password(passwordEncoder().encode("admin"))
	//                .roles("ADMIN")
	//                .build();
	//		return new InMemoryUserDetailsManager(pooven,admin,superUser);
	//	}
	//	





}
