package com.java8;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = () -> System.out.println("thread 1");
		Runnable r2 = () -> System.out.println("thread 2");
		new Thread(r1).start();
		new Thread(r2).start();
		
		new Thread(()->System.out.println("thread 3")).start();

		
	}

}
