package com.examples.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.controller.BookingController;
import com.examples.dto.Passenger;

public class BookingMain {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		BookingController controller = (BookingController) ctx.getBean("bookingController");
		Passenger passenger = (Passenger) ctx.getBean("p1");
		
		controller.bookTicket(passenger);
		
//	
	}

}
