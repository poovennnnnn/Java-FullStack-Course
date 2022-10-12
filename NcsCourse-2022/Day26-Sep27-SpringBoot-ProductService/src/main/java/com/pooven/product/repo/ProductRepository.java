package com.pooven.product.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pooven.product.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByProductName(String name);

}
