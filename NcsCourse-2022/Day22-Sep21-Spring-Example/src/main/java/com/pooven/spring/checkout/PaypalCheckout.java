package com.pooven.spring.checkout;

public class PaypalCheckout implements Checkout {

	@Override
	public void processPayment() {
		System.out.println("Payment  By Paypal Checkout");
		
	}

}
