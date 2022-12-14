package com.service.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Day27Sep28SprintBootOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day27Sep28SprintBootOrderServiceApplication.class, args);
	}

}
