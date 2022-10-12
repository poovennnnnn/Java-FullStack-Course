package com.training.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LoopThroughCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> p = new LinkedList<>();
		p.add(new Product(101, "Airpods", 1000));
		p.add(new Product(106, "keyboard", 1000));
		p.add(new Product(103, "Desktop", 1000));
		p.add(new Product(104, "laptop", 1000));
		p.add(new Product(105, "mobile", 1000));
	
		// Using Iterator Method 
		Iterator<Product> it = p.iterator();
		
		while(it.hasNext()) {
			Product prod = it.next();
			System.out.println(prod.getProdName());
		}

		
		//
	}

}
