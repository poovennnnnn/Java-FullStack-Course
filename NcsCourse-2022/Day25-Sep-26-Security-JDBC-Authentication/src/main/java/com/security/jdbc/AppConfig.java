package com.security.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@PropertySource("classpath:connection.properties")
@EnableWebMvc  // handlermapping ,handleradapter
@ComponentScan("com.security.jdbc")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUsername(environment.getProperty("connection.username"));
		datasource.setPassword(environment.getProperty("connection.password"));
		datasource.setUrl(environment.getProperty("connection.url"));
		datasource.setDriverClassName(environment.getProperty("connection.driverClass"));
		
		return datasource;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	

}
