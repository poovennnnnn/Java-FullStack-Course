package com.training.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> str = new TreeSet<>();
		str.add("hello");
		str.add("hasdfsfd");
		str.add("asdvsdvs");
		str.add("sdvxcxc");
		str.add("asdvvsdv");
		
		//Using Iterator
		Iterator <String> it = str.iterator();
		
		while(it.hasNext()) {
			String x = it.next();
			System.out.println(x);
		}
		
		System.out.println("-----------");
		
		//Enhanced For Loop
		for(String i:str) {
			System.out.println(i);
		}
		

	}

}