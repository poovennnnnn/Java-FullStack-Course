package com.training;

public class WrapperClass {
	
	public static void main(String[] args) {
		Integer i = 10;
		Integer j = 10;
		Byte b = 10;
		Byte b1 = 20;
		Long l = 10l;
		int x = i.parseInt("22") *2 ;// returns Primitive data type
		Integer y = i.valueOf("12") *2; // Returns a Integer Object
		                              
		Short s1 = i.shortValue();  //cannot downcast using normal casting

		
		
		System.out.println(i.compareTo(j));
		System.out.println(i.equals(j));
		
		
		byte x1 = b.parseByte("10"); // returns Primitive data type
		Byte y1 = b.valueOf("20"); // returns Byte object 
		
		
		System.out.println(b.compareTo(b1));
		System.out.println(b.equals(b1));
		
	}

}
