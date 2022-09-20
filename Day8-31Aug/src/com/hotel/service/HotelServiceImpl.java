package com.hotel.service;

import com.hotel.dao.HotelDaoImpl;
import com.hotel.dto.Customer;
import com.hotel.dto.Hotel;
import com.hotel.exceptions.HotelNotFoundException;
import com.hotel.exceptions.InvalidInputException;

public class HotelServiceImpl implements HotelService {
	
	HotelDaoImpl dao = new HotelDaoImpl();
	
	@Override
	public void showAllHotels() {
		// TODO Auto-generated method stub
		
		dao.showAllHotels();

	}

	@Override
	public Hotel findById(int id){
		// TODO Auto-generated method stub
		
		Hotel hotel = null;
		try {
			  hotel =  dao.findById(id);
		} catch (HotelNotFoundException | InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotel;
	}

	@Override
	public Hotel findByName(String name)  {
		// TODO Auto-generated method stub
		Hotel hotel = null;
		try {
			hotel = dao.findByName(name);
		} catch (HotelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotel;
	}

	@Override
	public void bookRoom(int id, Customer c)  {
		// TODO Auto-generated method stub

		try {
			dao.bookRoom(id, c);
		} catch (HotelNotFoundException | InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
