package com.java8;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = (r) -> Math.PI*r*r;	
		System.out.println(c1.area(1.2));
		callArea((r)-> Math.PI*r*r);
		
	}
	
	public static void callArea(Circle c) {
		System.out.println(c.area(2.3));
	}

}
