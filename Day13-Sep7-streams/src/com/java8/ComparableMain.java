package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101, "hello");
		
		List<Product> p = Arrays.asList(new Product(101, "hello"),
				new Product(101, "hello"),
				new Product(101, "hello"),
				new Product(101, "hello"));
		
	    p.sort((p1,p2)-> p1.getProdId() - p2.getProdId());
	    
	    compareTwoProducts((p1,p2)-> p1.getProdId() - p2.getProdId());
	    compareTwoProducts((p1,p2)-> p1.getProdName().compareTo(p2.getProdName()));
	    
	    compareTwoStudents((p1,p2)-> p1.getStudId() - p2.getStudId());
	    compareTwoStudents((p1,p2)-> p1.getStudName().compareTo(p2.getStudName()));
	   
	    
	    

	}

	public static void compareTwoProducts(Comparator<Product> cp) {
		System.out.println(cp.compare(new Product(101, "hello"),new Product(103, "hello11")));
	}
	
	public static void compareTwoStudents(Comparator<Student> cp) {
		System.out.println(cp.compare(new Student(101, "hello"), new Student(102, "hello")));
	}
}
