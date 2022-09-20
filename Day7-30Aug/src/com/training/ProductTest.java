package com.training;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product e = new Product(101,"airpods",1001);
		Product e1 = new Product(101,"airpods",1001);

		Product e2 = new Product(101,"airpods",1001);
		
		System.out.println(e.compareTo(e2));
		System.out.println(e2.compareTo(e));
		System.out.println(e2.compareTo(e2));


	}

}
