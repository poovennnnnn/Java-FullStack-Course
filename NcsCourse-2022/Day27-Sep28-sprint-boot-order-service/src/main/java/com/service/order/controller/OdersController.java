package com.service.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.service.order.dto.ModelClass;
import com.service.order.dto.Orders;
import com.service.order.dto.Product;
import com.service.order.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OdersController {
	
	@Autowired
	private OrdersService service;
	
	@Autowired
	private ProductServiceFeign feign;
	
	
	@PostMapping
	@PutMapping
	public Orders save(@RequestBody Orders order) {
		return service.save(order);
	}
	
	@GetMapping
	public List<Orders> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int id) {
		service.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Orders findById(@PathVariable("id") int id) {
		return service.findById(id);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return feign.findAll();
	}
	
	@GetMapping("/test/{id}")
	public Object findAllDetails(@PathVariable int id){
		
		Orders order = service.findById(id);
		
		
		List<Product> product = feign.findAllDetails(order.getProductName());
		
		ModelClass m1 = new ModelClass();
		
		m1.setOrder(order);
		m1.setProduct(product.get(0));
		
		return m1;		

	}
	
}
