package com.java8;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {

	public static void main(String[] args) throws NotFoundEception {
		// TODO Auto-generated method stub

		Optional<String> opStr = Optional.empty();
		Optional<Integer> opInt = Optional.of(102);
		Optional<Product> prod = Optional.of(new Product(101, "airpods"));
		
		
		
//		
		if(opStr.isPresent()) {
			System.out.println(opStr.get());
		}
		System.out.println(opStr.get());
		String x1 = opStr.orElse("hello ");
		
		Consumer<String> c = System.out::println;
		c.accept("hello");
		
		opStr.ifPresent(c); // using consumer
		prod.ifPresent((i)-> System.out.println("i"));
		
		opInt.ifPresent((i)-> System.out.println(i*10));
		String s = opStr.orElseGet(()-> "hello");
		opStr.orElseThrow(()-> new NotFoundEception());
	
		
	}
	
	

}
