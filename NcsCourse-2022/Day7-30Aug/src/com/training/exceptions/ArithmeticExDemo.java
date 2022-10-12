package com.training.exceptions;

public class ArithmeticExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 1;
			int y = 24/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		    
			e.printStackTrace();

		}
		
		System.out.println("Try catch block executed");
	

	}

}
