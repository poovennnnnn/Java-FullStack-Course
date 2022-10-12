package com.cms.service;

import java.util.Set;

import com.cms.dto.Customer;
import com.cms.dto.Product;
import com.ems.dao.CustomerDaoImpl;
import com.ems.exception.CustomerNotFoundException;
import com.ems.exception.ProductNotFoundexception;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDaoImpl dao = new CustomerDaoImpl();

	@Override
	public Customer findById(Integer id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
	
		
		return dao.findById(id);
	}

	@Override
	public Set<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return dao.findAllCustomer();
	}

	@Override
	public void updateById(Integer id, Customer cus) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		dao.updateById(id, cus);

	}

	@Override
	public void deleteById(Integer id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub

		dao.deleteById(id);
	}

	@Override
	public void addRecord(Customer cus) {
		// TODO Auto-generated method stub
		
		dao.addRecord(cus);
		
	}

	@Override
	public void addProductById(Integer id, Product p) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		dao.addProductById(id, p);
	}

	@Override
	public void deleteProductById(Integer id, Integer prodId) throws CustomerNotFoundException, ProductNotFoundexception {
		// TODO Auto-generated method stub
		
		dao.deleteProductById(id, prodId);
		
	}

}
