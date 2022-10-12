package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Day27Sep28SprintBootFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day27Sep28SprintBootFeign1Application.class, args);
	}

}
