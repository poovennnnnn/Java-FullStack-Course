package com.pooven.dto;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_account")
public class BankAccount  implements Comparable<BankAccount>{
	
	@Id
	@Column(name="act_number")
	private Long actNumber;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="actBalance")
	private Double actBalance;
	
	

	public BankAccount(Long actNumber, String customerName, Double actBalance) {
		super();
		this.actNumber = actNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}

	public BankAccount() {
		super();
	}

	public Long getActNumber() {
		return actNumber;
	}

	public void setActNumber(Long actNumber) {
		this.actNumber = actNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getActBalance() {
		return actBalance;
	}

	public void setActBalance(Double actBalance) {
		this.actBalance = actBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actBalance, actNumber, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Double.doubleToLongBits(actBalance) == Double.doubleToLongBits(other.actBalance)
				&& actNumber == other.actNumber && Objects.equals(customerName, other.customerName);
	}

	@Override
	public String toString() {
		return "BankAccount [actNumber=" + actNumber + ", customerName=" + customerName + ", actBalance=" + actBalance
				+ "]";
	}

	@Override
	public int compareTo(BankAccount o) {
		
		return actNumber.compareTo(o.actNumber);
	}
	
	

}
