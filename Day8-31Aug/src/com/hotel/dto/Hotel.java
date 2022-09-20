package com.hotel.dto;

public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String roomType;
	private int costPerDay;
	private  String avalability;
	
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}



	public Hotel(int hotelId, String hotelName, String roomType, int costPerDay) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.costPerDay = costPerDay;
		this.avalability = "yes";
	}



	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public int getCostPerDay() {
		return costPerDay;
	}


	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}


	public String getAvalability() {
		return avalability;
	}


	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}

	

	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", costPerDay=" + costPerDay
				+ ", avalability=" + avalability + "]";
	}
	
	

}
