package com.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-feign")
public class ProductFeignController {
	
	@Autowired
	private ProductServiceFeign productFeign;

	@GetMapping
	public List<Product> findAllProducts(){
			return productFeign.findAll();
	}
}
