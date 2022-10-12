package com.java8.streams;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);

		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String s = d1.format(f);
		System.out.println(s);
	}

}
