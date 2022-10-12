package com.training.exceptions;

public class NumberExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i = Integer.parseInt("2 ");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
			e.printStackTrace();
		}

		System.out.println("Try catch block executed");
	}

}
