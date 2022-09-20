package com.hotel.dao;

import com.hotel.dto.Customer;
import com.hotel.dto.Hotel;
import com.hotel.exceptions.HotelNotFoundException;
import com.hotel.exceptions.InvalidInputException;
import com.hotel.storedata.HotelStoreData;

public class HotelDaoImpl implements HotelDao {

	@Override
	public void showAllHotels() {
		// TODO Auto-generated method stub
		
		for(Hotel h:HotelStoreData.arr) {
			System.out.println(h);
		}
		
	}

	@Override
	public Hotel findById(int id) throws HotelNotFoundException, InvalidInputException {
		return  find(id);
		
	}

	@Override
	public Hotel findByName(String name) throws HotelNotFoundException {
		// TODO Auto-generated method stub
		return find(name);
	}

	@Override
	public void bookRoom(int id, Customer c) throws HotelNotFoundException, InvalidInputException {
		// TODO Auto-generated method stub
		Hotel h = find(id);
		h.setAvalability("no");
		
		System.out.println(c);
		System.out.println("Booked");
		
	}
	
	
	static Hotel find(int x) throws HotelNotFoundException, InvalidInputException {
		Hotel foundHotel = null;
		if(x == 0) {
			throw new InvalidInputException("No input is there");
		}
		for(Hotel h : HotelStoreData.arr) {
			if(x == h.getHotelId()) {
				foundHotel = h;
			}
		}
		
		if(foundHotel == null) {
			throw new HotelNotFoundException("Hotel not Found id is " +x );
		}
		
		return foundHotel;
		
	}
	
	static Hotel find(String x) throws HotelNotFoundException {
		Hotel foundHotel = null;
		if(x == null) {
			return null;
		}
		for(Hotel h : HotelStoreData.arr) {
			if(x == h.getHotelName()) {
				foundHotel = h;
			}
		}
		
		if(foundHotel == null) {
			throw new HotelNotFoundException("Hotel not Found Name is "+ x );
		}
		
		return foundHotel;
		
	}


}

