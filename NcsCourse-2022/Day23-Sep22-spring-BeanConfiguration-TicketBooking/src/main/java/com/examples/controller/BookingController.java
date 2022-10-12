package com.examples.controller;
import com.examples.dto.Passenger;
import com.examples.service.BookingService;

public class BookingController {
	
	private BookingService service;

	public BookingService getService() {
		return service;
	}

	public void setService(BookingService service) {
		this.service = service;
	}
	
	public void bookTicket(Passenger passenger) {
		service.bookTicket(passenger);
	}

}
