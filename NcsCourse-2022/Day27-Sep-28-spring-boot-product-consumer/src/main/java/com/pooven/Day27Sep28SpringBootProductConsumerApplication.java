package com.pooven;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.pooven.consumer.ProductConsumer;

@SpringBootApplication
public class Day27Sep28SpringBootProductConsumerApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = null;
		ctx = SpringApplication.run(Day27Sep28SpringBootProductConsumerApplication.class, args);
//		ctx.getBean(ProductConsumer.class).consumeProductApi();
		
	 System.out.println("hello main");
		
		
	}
	
	@Bean
	CommandLineRunner run() {
		return (args)-> System.out.println("cli");
	}

}
