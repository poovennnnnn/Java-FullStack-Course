package com.training.collection;

import java.util.LinkedList;
import java.util.List;

public class IntegerCollection {
	public static void main(String[] args) {
		
		
		List<Integer> i = new LinkedList<>();
		i.add(1);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		i.add(676);
		i.add(234);
		i.add(324);
		
		for(Integer j:i) {
			System.out.println(j);
		}

		
	}

}
