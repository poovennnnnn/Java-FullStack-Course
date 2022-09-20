package com.cms.client;


import java.util.Set;

import com.cms.dto.Customer;
import com.cms.dto.Product;
import com.cms.service.CustomerServiceImpl;
import com.cms.storedata.StoreData;
import com.ems.exception.CustomerNotFoundException;
import com.ems.exception.ProductNotFoundexception;

public class MainDemo {

	public static void main(String[] args) throws CustomerNotFoundException, ProductNotFoundexception {
		// TODO Auto-generated method stub
		
		new StoreData();
//		Set<Customer> data = StoreData.cusData;
//		System.out.println(data);
		
		
		CustomerServiceImpl service = new CustomerServiceImpl();
		
//		Customer c = service.findById(101);
		Customer c1 = new Customer();
		c1.setCusId(101);
		c1.setCustomer("scott");
		
		System.out.println(service.findById(101));
		
        System.out.println(service.findAllCustomer());
		
//        service.updateById(101, c1);
        System.out.println(service.findAllCustomer());
        System.out.println("---------------------");
//        service.deleteById(103);
        System.out.println(service.findAllCustomer());
        System.out.println("---------------------");
//       service.deleteProductById(102, 106);
       
       
        System.out.println(service.findAllCustomer());
        System.out.println("---------------------");
        
        
        print(service.findAllCustomer());

	}

	static void print(Set<Customer> cus) {

		for(Customer c : cus) {
			System.out.println(c.getCustomer());
			Set<Product> prod = c.getProduct();
//			System.out.println(prod);
			for(Product p:prod) {
				System.out.print(" "+p.getProdName());
			}
			System.out.println("");
		}
		
	}
}
