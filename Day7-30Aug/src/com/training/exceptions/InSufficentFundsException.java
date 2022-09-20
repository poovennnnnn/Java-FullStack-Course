package com.training.exceptions;

public class InSufficentFundsException  extends Exception{
	
	private double hoMuch;
	
	
	

	public InSufficentFundsException(double hoMuch) {
		super();
		this.hoMuch = hoMuch;
	}

	public InSufficentFundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getHoMuch() {
		return hoMuch;
	}

	public void setHoMuch(double hoMuch) {
		this.hoMuch = hoMuch;
	}

	@Override
	public String toString() {
		return "InSufficentFundsException [hoMuch=" + hoMuch + "]";
	}
	
	

}
