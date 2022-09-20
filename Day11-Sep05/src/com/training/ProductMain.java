package com.training;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;




public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		List<Product> p = new LinkedList<>();
		p.add(new Product(101, "Airpods", 1000));
		p.add(new Product(106, "keyboard", 1000));
		p.add(new Product(103, "Desktop", 1000));
		p.add(new Product(104, "laptop", 1000));
		p.add(new Product(105, "mobile", 1000));
		
//		p.forEach((i)-> System.out.println(i));
		
//		Collections.sort((List<Product>) p);
		
		System.out.println("----------------------------");
		
//		p.sort((t1,t2)-> t1.getProdName().compareTo(t2.getProdName()));
		
//		p.forEach((i)-> System.out.println(i));
		
		
		Collections.sort(p, new ProductIdComparator());
		for(Product x:p ) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		Collections.sort(p, new ProductNameComparator());
		
		for(Product x:p ) {
			System.out.println(x);
		}
		
		
		System.out.println("-------------------");
		
		ListIterator<Product> it = p.listIterator();
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		

	}

}
