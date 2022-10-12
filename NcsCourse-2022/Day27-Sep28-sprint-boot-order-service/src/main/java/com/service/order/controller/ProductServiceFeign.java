package com.service.order.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.service.order.dto.Product;

@FeignClient("product-service")
public interface ProductServiceFeign {

	// a list of method declarations with
	//relavant @GetMapping @PostMapping ..etc

	@GetMapping("/product")
	public List<Product> findAll();
	
	@GetMapping("/product/test/{name}")
	public List<Product> findAllDetails(@PathVariable("name") String name);
	

	
       
	
	
}
