package com.junit5.demo;

public class DemoJunit {
	
	public String newYearGreeting(String name) {
		if(name == null) {
			throw new NullPointerException("name cannot be null");
		}
		return "happy new year: "+name;
	}

	
	public boolean isPalindrome(String input) {
		if(input==null) {
			throw new IllegalArgumentException("Input cannot be null");
		}
		
		String temp = new StringBuffer(input).reverse().toString();
		
		if(temp.equals(input)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
