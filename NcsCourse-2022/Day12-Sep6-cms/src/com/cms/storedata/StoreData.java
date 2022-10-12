package com.cms.storedata;

import java.util.HashSet;
import java.util.Set;

import com.cms.dto.Customer;
import com.cms.dto.Product;

public class StoreData {
	
      	
	 public static Set<Customer> cusData = new HashSet<>();
     

	public StoreData() {
		super();
		storeData();
		// TODO Auto-generated constructor stub
	}



	public static void  storeData() {
		
		Set<Product> arr = new  HashSet<>();
		arr.add(new Product(101,"Airpods",249.0));
		arr.add(new Product(102,"Iphone",999.0));
		arr.add(new Product(103,"Macbook",1699.0));
		
		Set<Product> arr1 = new  HashSet<>();
		arr1.add(new Product(104,"Earbuds",249.0));
		arr1.add(new Product(105,"Samsung fold",999.0));
		arr1.add(new Product(106,"Laptop",1699.98));
		
		Set<Product> arr2 = new  HashSet<>();
		arr2.add(new Product(103,"Macbook",1699.0));
		arr2.add(new Product(105,"Samsung fold",999.0));
		arr2.add(new Product(106,"Laptop",1699.0));
		
		cusData.add(new Customer(101,"kevin",arr));
		cusData.add(new Customer(102,"hari",arr1));
		cusData.add(new Customer(103,"pooven",arr));
		
		
	}

}
