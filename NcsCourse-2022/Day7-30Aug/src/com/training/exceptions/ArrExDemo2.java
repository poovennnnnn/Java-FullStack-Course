package com.training.exceptions;

public class ArrExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,4};
		
		try {
			System.out.println(arr[23]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Try catch block executed");
	}

}
