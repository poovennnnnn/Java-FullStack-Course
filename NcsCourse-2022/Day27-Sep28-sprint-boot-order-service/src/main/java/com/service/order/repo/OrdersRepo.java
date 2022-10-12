package com.service.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.order.dto.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
