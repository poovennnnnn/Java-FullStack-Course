package com.cms.dto;

import java.util.Objects;
import java.util.Set;

public class Customer {
	
	private Integer cusId;
	private String Customer;
	private Set<Product> product;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer cusId, String customer, Set<Product> product) {
		super();
		this.cusId = cusId;
		Customer = customer;
		this.product = product;
	}


	public Integer getCusId() {
		return cusId;
	}


	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}


	public String getCustomer() {
		return Customer;
	}


	public void setCustomer(String customer) {
		Customer = customer;
	}


	public Set<Product> getProduct() {
		return product;
	}


	public void setProduct(Set<Product> product) {
		this.product = product;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Customer, cusId, product);
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
		return Objects.equals(Customer, other.Customer) && Objects.equals(cusId, other.cusId)
				&& Objects.equals(product, other.product);
	}


	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", Customer=" + Customer + ", product=" + product + "]";
	}
	
	

}
