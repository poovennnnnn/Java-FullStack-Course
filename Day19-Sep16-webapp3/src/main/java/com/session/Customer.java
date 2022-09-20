package com.session;

import java.util.Objects;

public class Customer {
	
	private String customerId;
	private String customerNae;
	private String city;
	private String zip;
	private String mobile;
	private String email;

	public Customer() {
		
	}

	public Customer(String customerId, String customerNae, String city, String zip, String mobile, String email) {
		super();
		this.customerId = customerId;
		this.customerNae = customerNae;
		this.city = city;
		this.zip = zip;
		this.mobile = mobile;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNae() {
		return customerNae;
	}

	public void setCustomerNae(String customerNae) {
		this.customerNae = customerNae;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerNae=" + customerNae + ", city=" + city + ", zip=" + zip
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, customerId, customerNae, email, mobile, zip);
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
		return Objects.equals(city, other.city) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerNae, other.customerNae) && Objects.equals(email, other.email)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(zip, other.zip);
	}

	
}
