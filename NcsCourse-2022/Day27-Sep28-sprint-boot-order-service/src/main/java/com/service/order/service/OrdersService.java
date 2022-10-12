package com.service.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.order.dto.Orders;
import com.service.order.repo.OrdersRepo;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepo repo;
	
	public Orders save(Orders order) {
		return repo.save(order);
	}
	
	public List<Orders> findAll(){
		return repo.findAll();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public Orders findById(int id) {
		return repo.findById(id).get();
	}

}
