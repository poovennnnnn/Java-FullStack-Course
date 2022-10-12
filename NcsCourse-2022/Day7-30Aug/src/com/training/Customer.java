package com.training;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
	
	private int customerId;
	private  String customerName;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(customerName, other.customerName);
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return customerName.compareTo(o.customerName);
	}
	
	

	
}
