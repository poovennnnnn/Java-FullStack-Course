package com.hibernate.dto;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pnr;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="destination")
	private String destination;
	
	
	public Ticket() {
		super();
	}
	public Ticket(int pnr, String customerName, String origin, String destination) {
		super();
		this.pnr = pnr;
		this.customerName = customerName;
		this.origin = origin;
		this.destination = destination;
	}
	
	public Ticket( String customerName, String origin, String destination) {
		super();
		
		this.customerName = customerName;
		this.origin = origin;
		this.destination = destination;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, destination, origin, pnr);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(customerName, other.customerName) && Objects.equals(destination, other.destination)
				&& Objects.equals(origin, other.origin) && pnr == other.pnr;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", customerName=" + customerName + ", origin=" + origin + ", destination="
				+ destination + "]";
	}
	
	

}
