package com.java8.streams.utility;

import java.util.Arrays;
import java.util.List;

import com.java8.streams.Product1;

public class ProductUtility {
	
	public static List<Product1> prodList = Arrays.asList(
			new Product1(101,"Airpods pro",249 ,100 , "Accessories"),
			new Product1(102,"Apple watch",549 ,50 , "Accessories"),
			new Product1(103,"Apple pencil",100 ,200 , "Accessories"),
			new Product1(104,"Iphone 14 pro",1799 ,100 , "Mobile phone"),
			new Product1(105,"samsuns s22",249 ,100 , "Mobile phone"),
			new Product1(106,"Airpods pro",249 ,100 , "Mobile phone")
			);

	public static Product1 findProduct(int prodId) {
		
		return prodList.stream()
				       .filter(p -> p.getProdId() == prodId)
				       .findFirst()
				       .orElse(new Product1(000, "temp", 0, 0, "temp"));
	}
}
