package com.training;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer e = new Customer(123, "123213");
		Customer e2 = new Customer(12, "123");
		Customer e1 = new Customer(123, "123213");
		
		
		System.out.println(e.compareTo(e2));
		System.out.println(e2.compareTo(e));
		System.out.println(e2.compareTo(e2));


	}

}
