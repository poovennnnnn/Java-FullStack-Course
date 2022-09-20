package com.java8.streams;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.streams.utility.ProductUtility;

public class Product1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		forEachDemo();
//        findPriceGreaterThan(500);
//        filterByCategory("Accessories");
//        decreasePriceFivePcForMobiles();
//        increaseProductPriceByTenPercent();
//		sortByName();
		showPriceSummary();
	}

	public static void forEachDemo() {
		ProductUtility.prodList.stream()
		                       .forEach(System.out::println);
	}
	
	public static void findAndCollect() {
		Integer prodIds[] = {101,105,103};
		
		Stream.of(prodIds)
		      .map(ProductUtility::findProduct)
		      .collect(Collectors.toList())
		      .forEach(System.out::println);
		
	}
	
	
	public static void findPriceGreaterThan(int price) {
		
		ProductUtility.prodList
		              .stream()
		              .filter(p -> p.getPrice() > price)
		              .collect(Collectors.toList())
		              .forEach(System.out::println);
		
	}
	
	public static void increaseProductPriceByTenPercent() {
		ProductUtility.prodList
        .stream() 
        .forEach(i ->{
        	
        	double price = i.getPrice() + (10 *i.getPrice())/100;
        	i.setPrice(price);
        	System.out.println(i);
        	
        });
		
	}

	public static void decreasePriceFivePcForMobiles() {
		ProductUtility.prodList
        .stream() 
        .filter(i -> i.getCategory().equals("Mobile phone"))
        .forEach(i ->{
        	
        	double price = i.getPrice() - (10 *i.getPrice())/100;
        	i.setPrice(price);
        	System.out.println(i);
        	
        });
		
	}
	
	public static void filterByCategory(String category) {
		   
		ProductUtility.prodList
                      .stream() 
                      .filter(p -> p.getCategory().equals(category))
                      .forEach(System.out::println);
		
	}
	
	public static void sortByName() {

		ProductUtility.prodList
		              .stream()
		              .sorted((p1,p2)-> p1.getProdName().compareTo(p2.getProdName()))
		              .forEach(System.out::println);
	}
	
	public static void showPriceSummary() {
		DoubleSummaryStatistics stats = ProductUtility.prodList
				                                       .stream()
				                                       .collect(Collectors.summarizingDouble(Product1::getPrice));
		System.out.println("Average = "+stats.getAverage());
		System.out.println("sum = "+stats.getSum());
		
	}
}

















