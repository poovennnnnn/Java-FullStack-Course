package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.dao.EmployeeDao;
import com.datasource.MyDataSource;
import com.pooven.controller.EmployeeController;
import com.pooven.service.EmployeeService;


@ComponentScan(basePackages = {"com"})
@Configuration  //this annotation is just for readability no functions inside
public class EmployeeConfig {
	
	@Bean
	public MyDataSource dataSource() {
		return new MyDataSource();
	}

	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDao();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController();
	}
	
}
