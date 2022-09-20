package com.java8;



public class GreetinMain {

	
	public static void main(String[] args) {
		
		Greeting g = (name)-> System.out.println("hello "+name);
		
		g.greet("world");
		
		
	}
}
