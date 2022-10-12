package com.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mapDemo();
		mapDemoLoop();
	}

	public static void mapDemo() {
		Map<Integer,String> m = new HashMap<>();
		
		m.put(1, "java");
		m.put(2, "html");
		m.put(3, "ReactJS");
		m.put(4, "AngularJS");
		m.put(5, "PHP");
		
		System.out.println(m.get(4));
	}
	
	
	public static void mapDemoLoop() {
		Map<Integer,String> m = new HashMap<>();
		
		m.put(1, "java");
		m.put(2, "html");
		m.put(3, "ReactJS");
		m.put(4, "AngularJS");
		m.put(5, "PHP");
		
		Set<Integer> keys = m.keySet();
		
		for(Integer s:keys) {
			System.out.println(m.get(s));
			
		}
		
		Set<Map.Entry<Integer, String>> entries = m.entrySet();
		
		for(Map.Entry<Integer, String> e: entries) {
			System.out.println(e.getKey()+" :"+ e.getValue());
		}
		
	}
}
