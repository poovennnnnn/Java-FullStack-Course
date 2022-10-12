package com.pooven.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pooven.product.dto.Product;
import com.pooven.product.repo.ProductRepository;

@Service
public class ProductService {


	@Autowired
	private ProductRepository repo;
	
	public Product save(Product product) {
		
		return repo.save(product);
	}

	
	public void deleteById(int productId) {
		repo.deleteById(productId);
	}
	
	
	public Product findById(int productId) {
		return repo.findById(productId).orElse(null);
	}
	
	public List<Product> findAll(){
		return repo.findAll();
	}
	
	
	public List<Product> addAll(List<Product> products){
		return repo.saveAll(products);
	}
	
	public List<Product> test(String name) {
		return repo.findByProductName(name);
	}
	
}
