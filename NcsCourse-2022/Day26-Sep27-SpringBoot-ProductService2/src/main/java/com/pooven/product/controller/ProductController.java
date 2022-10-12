package com.pooven.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pooven.product.dto.Product;
import com.pooven.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
	public Product save(@RequestBody  Product product) {

		return service.save(product);
	}


	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int productId) {
		service.deleteById(productId);
	}


	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") int productId) {
		return service.findById(productId);
	}

	
	@GetMapping
	public List<Product> findAll(){
		return service.findAll();
	}


	@PostMapping("/all")
	public List<Product> addAll(@RequestBody List<Product> products){
		return service.addAll(products);
	}
	
	@GetMapping("/test")
	public List<Product> test() {
		return service.test("airpods");
	}

}
