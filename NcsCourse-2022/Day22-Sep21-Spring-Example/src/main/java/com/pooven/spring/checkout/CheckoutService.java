package com.pooven.spring.checkout;

public class CheckoutService {
	
	Checkout checkout;

	public Checkout getCheckout() {
		return checkout;
	}

	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	
	public void processPayment() {
		checkout.processPayment();
	}
	

}
