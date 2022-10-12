package com.java8.streams;

import java.util.stream.IntStream;

public class IntStreams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		streamEx1();
	}
	
	public static void streamEx1() {
//		IntStream
//		     .range(1, 20)
//		     .forEach(System.out::println);
		
		boolean b = IntStream
	     .range(1, 20)
	     .sorted()
	     .filter((i) -> i >10)
	     .skip(1)
	     .findFirst()
	     .isPresent();
		
		System.out.println(b);
	}

}
