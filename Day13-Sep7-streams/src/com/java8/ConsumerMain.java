package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("hello","world","!");
		List<Integer> intList = Arrays.asList(12,23,4134,124,123,123,123423,34);
		List<Product> prodList = Arrays.asList(new Product(101, "airpods"),
				new Product(102, "macbook"),
				new Product(103, "Iphone"),
				new Product(101, "airpods"));
		
		
		
		
		strList.forEach(System.out::println);
		System.out.println("-------------------");
		intList.forEach(System.out::println);
		System.out.println("-------------------");
		prodList.forEach(System.out::println);
		System.out.println("-------------------");
		
		
		Consumer<String> c = System.out::println;
		c.accept("hello");
		
		
	}
	


}

