package com.pooven.spring.checkout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckoutMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CheckoutBeans.xml");
		
		CheckoutService service1 = (CheckoutService) context.getBean("checkoutService1");
		CheckoutService service2 = (CheckoutService) context.getBean("checkoutService2");
		CheckoutService service3 = (CheckoutService) context.getBean("checkoutService3");
		
		service1.processPayment();
		service2.processPayment();
		service3.processPayment();
		
	}

}
