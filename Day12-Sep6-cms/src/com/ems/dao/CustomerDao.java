package com.ems.dao;

import java.util.Set;

import com.cms.dto.Customer;
import com.cms.dto.Product;
import com.ems.exception.CustomerNotFoundException;
import com.ems.exception.ProductNotFoundexception;

public interface CustomerDao {
	

	public abstract void addRecord(Customer cus);
	public abstract Customer findById(Integer id) throws CustomerNotFoundException;
	public abstract Set<Customer> findAllCustomer();
	public abstract void updateById(Integer id, Customer cus) throws CustomerNotFoundException;
	public abstract void deleteById(Integer id) throws CustomerNotFoundException;
	public abstract void addProductById(Integer id, Product p) throws CustomerNotFoundException;
	public abstract void deleteProductById(Integer id,Integer prodId) throws CustomerNotFoundException, ProductNotFoundexception;

}
