package com.pooven.spring.checkout;

public class CrediCardCheckout implements Checkout {

	@Override
	public void processPayment() {

		System.out.println("Payment By CreditCard Checkout");
	}

}
