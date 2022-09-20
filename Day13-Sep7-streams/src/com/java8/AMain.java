package com.java8;

public class AMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a = System.out::println;
//		a.m1(10);
//		A a1 = (i) -> System.out.println(i);
//		a1.m1(20);
//		
		A a2 = Test::add;  // Test is class add is the method
		a2.m1(10, 0);

	}

}

class Test{
	public static  void add(int i,int j) {
		System.out.println(i +j);
	}
}
