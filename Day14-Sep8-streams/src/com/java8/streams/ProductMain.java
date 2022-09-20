package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ProductMain {
   public static void main(String[] args) {
	    
	   List<Product> list = Arrays.asList(new Product(105, "scot"),new Product(102, "kevin"),new Product(103, "shan"),new Product(104, "hari"));
	   
	   
	   
	   list.stream()
	        .map((i) -> i.getProdName().toUpperCase())
	        .filter((p)-> p.startsWith("H"))
	        .forEach((p) -> System.out.println(p));
	        
	   list.stream()
	       .map((p)-> {
	    	   Product temp = p;
	    	   temp.setProdName(temp.getProdName().toUpperCase());
	    	   return temp;
	       })
	       .filter(p -> p.getProdName().startsWith("S") )
	       .sorted()
	       .forEach(System.out::print);
	  
	   

	
}

}
