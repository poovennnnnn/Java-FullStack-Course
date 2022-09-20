package com.hotel.dto;

public class Customer {

	private int customerId;
	private String customName;
	private int noOfPerson;
	private int customerNumber;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	
	}

	public Customer(int customerId, String customName, int noOfPerson, int customerNumber) {
		super();
		this.customerId = customerId;
		this.customName = customName;
		this.noOfPerson = noOfPerson;
		this.customerNumber = customerNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public int getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customName=" + customName + ", noOfPerson=" + noOfPerson
				+ ", customerNumber=" + customerNumber + "]";
	}

	
}
