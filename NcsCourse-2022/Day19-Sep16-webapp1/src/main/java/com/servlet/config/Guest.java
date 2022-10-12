package com.servlet.config;

public class Guest {

	private int guestId;
	private String guestName;
	public Guest() {
		// TODO Auto-generated constructor stub
	}
	public Guest(int guestId, String guestName) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestName=" + guestName + "]";
	}

	
}
