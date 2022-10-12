package com.pooven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pooven.dto.Product;

@SpringBootApplication
public class Day26Sep27SpringBootProductServiceApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(Day26Sep27SpringBootProductServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Day26Sep27SpringBootProductServiceApplication.class, args);
		
	
//		Product p1 = new  Product(121, "hello", 9.0, 23);
		
//		ResponseEntity<String> str = temp.postForEntity("http://localhost:8001/product",p1 ,String.class);
//		logger.error(str.toString());
//		
//		ResponseEntity<Product[]> prodList = temp.getForEntity("http://localhost:8001/product/all", Product[].class);
//		
//		Product[] arr = prodList.getBody();
//		logger.info(arr.toString());
		
		
	}

}
