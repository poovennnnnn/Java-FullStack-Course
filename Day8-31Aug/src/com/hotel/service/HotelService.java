package com.hotel.service;

import com.hotel.dto.Customer;
import com.hotel.dto.Hotel;
import com.hotel.exceptions.HotelNotFoundException;

public interface HotelService {
	public abstract void showAllHotels();
	public abstract Hotel findById(int id) throws HotelNotFoundException;
	public abstract Hotel findByName(String name) throws HotelNotFoundException;
	public abstract void bookRoom(int id,Customer c) throws HotelNotFoundException;
	
	

}
