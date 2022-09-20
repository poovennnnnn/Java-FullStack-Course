package com.training.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntegerCollection1 {
	public static void main(String[] args) {
		
		
		Set<Integer> i = new TreeSet<>();
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		i.add(676);
		i.add(234);
		i.add(324);
		System.out.println("Tree Set");
		for(Integer j:i) {
			System.out.println(j);
		}

		
		Set<Integer> j = new HashSet<>();
		j.add(3);
		j.add(4);
		j.add(5);
		j.add(6);
		j.add(676);
		j.add(234);
		j.add(324);
		System.out.println("In HashSet");
		
		for(Integer k:j) {
			System.out.println(k);
		}
		
		i.forEach((x)-> System.out.println(x));
	
		
	}

}
