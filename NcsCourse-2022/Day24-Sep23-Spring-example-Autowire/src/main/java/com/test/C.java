package com.test;

public class C {
	private A a1;
	
	
	

	public C() {
		super();
	}
	
	


	public C(A a1) {
		super();
		this.a1 = a1;
		System.out.println("param constructor from C");
	}




	public A getA1() {
		return a1;
	}


	public void setA1(A a1) {
		this.a1 = a1;
	}


	public void cMethod() {
		System.out.println("inside C method");
	}

}
