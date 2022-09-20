package com.ems.dao;

import java.util.Set;

import com.cms.dto.Customer;
import com.cms.dto.Product;
import com.cms.storedata.StoreData;
import com.ems.exception.CustomerNotFoundException;
import com.ems.exception.ProductNotFoundexception;

public class CustomerDaoImpl implements CustomerDao {
	
	
	@Override
	public void addRecord(Customer cus) {
		// TODO Auto-generated method stub
		StoreData.cusData.add(cus);
		
		System.out.println("Customer Created");
		
	}

	@Override
	public Customer findById(Integer id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Customer c = find(id);
		
		
		
		return c;
	}

	@Override
	public Set<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		
		return StoreData.cusData;
	}

	@Override
	public void updateById(Integer id, Customer cus) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Customer c = find(id);
		 updateData(c, cus);	
		 System.out.println("Updated Customer Data");
		
	}

	@Override
	public void deleteById(Integer id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Customer c = find(id);
	    StoreData.cusData.remove(c);
		System.out.println("Deleted successfully Id is" + id );
		
	}
	
	
	
	

	@Override
	public void addProductById(Integer id, Product p) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		Set<Product> c = find(id).getProduct();
		c.add(p);
		
		System.out.println("Product Added");
		
		
	}

	@Override
	public void deleteProductById(Integer cusId, Integer prodId) throws CustomerNotFoundException, ProductNotFoundexception {
		// TODO Auto-generated method stub
		
		Set<Product> c = find(cusId).getProduct();
		Product p = null;
		for(Product x: c) {
			if(x.getProdId() == prodId) {
				p = x;
				System.out.println("Deletd Succefully");
			}
		}
		
		if(p == null) throw new ProductNotFoundexception("Product id is"+prodId);
		c.remove(p);
		
		
	}

	

	private Customer find(Integer id) throws CustomerNotFoundException {
		
		 Customer c = null;
			
			for(Customer x: StoreData.cusData) {
				if(x.getCusId() == id) {
					c = x;
				}
			}
			
			if(c == null) throw new CustomerNotFoundException("Id :"+id+" is not Found in the database");
			return c;
		
	}
	
         private void updateData(Customer c1 , Customer c2) {
		
		     if(c1==null | c2 == null) return ;
		     c1.setCustomer(c2.getCustomer());
	         if(c2.getProduct() == null) return ;
	         c1.setProduct(c2.getProduct());
	
		
	     }
}
