package com.examples.service;

import com.examples.dao.BookingProvider;
import com.examples.dto.Passenger;

public class BookingService {
	
	private BookingProvider provider;

	public BookingProvider getProvider() {
		return provider;
	}

	public void setProvider(BookingProvider provider) {
		this.provider = provider;
	}
	
	public void bookTicket(Passenger passenger) {

		provider.bookTicket(passenger);
	}

}
