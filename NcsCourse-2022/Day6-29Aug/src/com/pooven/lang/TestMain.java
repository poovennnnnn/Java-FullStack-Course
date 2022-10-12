package com.pooven.lang;

public class TestMain {

	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cus1 = new Customer(101,"hello");
		Customer cus2 = new Customer(101,"hello");
		Customer cus3 = new Customer(102,"hari");
		System.out.println("c1 ="+cus1);
		System.out.println(cus1.equals(cus2));
		
		Employee e1 = new Employee(123,"hari");
		Employee e2 = new Employee(123,"hari");
		Employee e3 = new Employee(123,"sdf");
		System.out.println("e1 = "+e1);
		
		System.out.println(e1.equals(e2));
		
		Class c2 = cus1.getClass();
		String className = c2.getName();
		System.out.println(className);
		
		Class c3 = e1.getClass();
		System.out.println(c3.getName());

	
		
	}

}
