package com.training.exceptions;

import com.training.Employee;

public class NullExDemo2 {
	
	static String str;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(str.charAt(0));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Try catch block executed");
	
		
	}

}
