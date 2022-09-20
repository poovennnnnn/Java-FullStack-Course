package com.banking.dto;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {

	private Long accountNumber;
	private String customerName;
	private Double accountBalance;
	

	
	public BankAccount() {
		
	}


	

	public BankAccount(Long accountNumber, String customerName) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}




	public BankAccount(Long accountNumber, String customerName, Double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}



	public Long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}



	@Override
	public int hashCode() {
		return Objects.hash(accountBalance, accountNumber, customerName);
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
		return Objects.equals(accountBalance, other.accountBalance)
				&& Objects.equals(accountNumber, other.accountNumber)
				&& Objects.equals(customerName, other.customerName);
	}



	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + "]";
	}



	@Override
	public int compareTo(BankAccount o) {
		
		return (int) (accountNumber - o.accountNumber);
	}
	
	

}
