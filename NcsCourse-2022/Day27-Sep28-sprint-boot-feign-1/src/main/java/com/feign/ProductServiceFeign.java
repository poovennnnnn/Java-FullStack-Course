package com.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-service")
public interface ProductServiceFeign {

	// a list of method declarations with
	//relavant @GetMapping @PostMapping ..etc
	
	@GetMapping("/product")
	public List<Product> findAll();
}
