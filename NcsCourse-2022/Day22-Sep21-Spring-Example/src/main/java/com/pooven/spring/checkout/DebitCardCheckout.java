package com.pooven.spring.checkout;

public class DebitCardCheckout implements Checkout {

	@Override
	public void processPayment() {
		System.out.println("Payment  By DebitCard Checkout");
		
	}

}
