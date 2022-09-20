package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> programmingList = Arrays.asList("java","Python","PHP");
		List<String> osList = Arrays.asList("Windows","Mac","Linux");
		List<String> BackendList = Arrays.asList("nodeJS","Spring Boot","Django");
		
		
		List<List<String>> unFlatenedList = Arrays.asList(programmingList,osList,BackendList);
		System.out.println("Unflattenend list");
		System.out.println(unFlatenedList);
		
		List<String> flatenedList = unFlatenedList
				                               .stream()
				                               .flatMap(list -> list.stream())
				                               .collect(Collectors.toList());
				                                  
		System.out.println("Flatened List");
		System.out.println(flatenedList);
		

	}

}
