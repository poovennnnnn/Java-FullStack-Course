package com.training;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello Java programming Languae";
		StringBuffer sb = new StringBuffer("asfsdff");
		sb.reverse();
		System.out.println(sb);
		Runtime r = Runtime.getRuntime();
				
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 10));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.indexOf("Prog"));
		System.out.println(s1.lastIndexOf("Programming"));
		System.out.println("hello".length());
	
	
		
	

	}

}
