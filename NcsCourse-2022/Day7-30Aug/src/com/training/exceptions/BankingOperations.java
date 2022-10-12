package com.training.exceptions;

public class BankingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void withdraw(double howMuch)  {
		
		
		try {
			if(howMuch > 500) {
				throw new InSufficentFundsException(howMuch);
			}
		} catch (InSufficentFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
