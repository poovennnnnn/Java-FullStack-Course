package com.test;

public class B {

	private A a1;
	private D d1;
	
	
	public B(A a1, D d1) {
		super();
		this.a1 = a1;
		this.d1 = d1;
	}


	public D getD1() {
		return d1;
	}


	public void setD1(D d1) {
		this.d1 = d1;
	}


	public B() {
		super();
	}
	
	public B(A a1) {
		super();
		this.a1 = a1;
	
		System.out.println("param constructor from B");
	}




	public A getA1() {
		return a1;
	}

	public void setA1(A a1) {
		this.a1 = a1;
	}

	public void bMethod() {
		System.out.println("inside B method");
	}

}
