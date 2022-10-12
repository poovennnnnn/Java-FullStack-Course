package com.java8;

import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<String> p1 = (i) -> i.startsWith("helooo");
		System.out.println(p1.test("poven"));

		
		Predicate<Integer> p2 = (i) -> i>10;
		System.out.println(p2.test(20));
		
		Predicate<Product> p3 = (i) -> i.getProdName().endsWith("n");
		System.out.println(p3.test(new Product(102,"pooven"))); 
	}

}
