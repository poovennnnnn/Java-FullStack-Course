package com.java8;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String[] args) {
		Supplier<Product> s1 = () -> new Product(101, "airpods");
		System.out.println(s1.get());
		
		Supplier<String> s2 = () -> new String("hello");
	     System.out.println(s2.get());
		
		Supplier<Integer> s3 = ()-> new Integer(10);
		System.out.println(	s3.get());
		
	}
}
