package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Product> p = new TreeSet<>();
//		p.add(new Product(101, "Airpods", 1000));
//		p.add(new Product(106, "keyboard", 1000));
//		p.add(new Product(103, "Desktop", 1000));
//		p.add(new Product(104, "laptop", 1000));
//		p.add(new Product(105, "mobile", 1000));
//
//		for(Product c: p) {
//			System.out.println(c);
//		}
		
		Set<Product> p = new HashSet<>();
		p.add(new Product(101, "Airpods", 1000));
		p.add(new Product(106, "keyboard", 1000));
		p.add(new Product(103, "Desktop", 1000));
		p.add(new Product(104, "laptop", 1000));
		p.add(new Product(105, "mobile", 1000));

		for(Product c: p) {
			System.out.println(c);
		}
		System.out.println("After the looop");
		System.out.println(p.contains(new Product(10512, "mobile", 1000)));
		p.remove(new Product(104, "laptop", 1000));
		
		System.out.println(p.isEmpty());
//		
		p.clear();
		System.out.println(p);
		p = null;
		System.out.println(p);
		
		p.forEach((i)-> System.out.println(i.getProdName()+" "+i.getProdId()  ));	
	}
}
