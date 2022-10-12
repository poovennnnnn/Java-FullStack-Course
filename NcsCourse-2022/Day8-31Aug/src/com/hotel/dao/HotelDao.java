package com.hotel.dao;

import com.hotel.dto.Customer;
import com.hotel.dto.Hotel;
import com.hotel.exceptions.HotelNotFoundException;
import com.hotel.exceptions.InvalidInputException;

public interface HotelDao {
	
	public abstract void showAllHotels();
	public abstract Hotel findById(int id) throws HotelNotFoundException, InvalidInputException;
	public abstract Hotel findByName(String name) throws HotelNotFoundException;
	public abstract void bookRoom(int id,Customer c) throws HotelNotFoundException, InvalidInputException;
	
	

}
