package com.pooven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@ComponentScan(basePackages = "com")
@Configuration
public class BankAccountConfig {
	
	
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
		factory.setPersistenceUnitName("test1");
		return factory;
	}

}
