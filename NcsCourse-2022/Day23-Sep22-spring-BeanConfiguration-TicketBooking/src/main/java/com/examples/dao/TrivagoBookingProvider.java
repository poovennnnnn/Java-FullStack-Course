package com.examples.dao;

import com.examples.dto.Passenger;

public class TrivagoBookingProvider implements BookingProvider {
	
	private MyDataSource mydataSource;
	
	

	public MyDataSource getMydataSource() {
		return mydataSource;
	}



	public void setMydataSource(MyDataSource mydataSource) {
		this.mydataSource = mydataSource;
	}



	@Override
	public void bookTicket(Passenger passenger) {
		
		mydataSource.getConnection();
		
		System.out.println("Ticket booked...."+passenger);
	}

}
