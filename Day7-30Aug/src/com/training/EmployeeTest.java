package com.training;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(123, "sdfdsf");
		Employee e2 = new Employee(123, "sdfdsf");
		Employee e1 = new Employee(123, "sdfdsf");
		
		System.out.println(e.compareTo(e2));
		System.out.println(e2.compareTo(e));
		System.out.println(e2.compareTo(e2));

	}

}
