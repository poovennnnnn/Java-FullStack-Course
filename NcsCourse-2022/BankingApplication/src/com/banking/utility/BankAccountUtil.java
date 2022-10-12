package com.banking.utility;

import com.banking.dto.BankAccount;

public class BankAccountUtil {
	
	public static void printDetails(BankAccount account) {
		
		System.out.println("--------------------");
		System.out.println("Account Number : "+account.getAccountNumber());
		System.out.println("Customer Name : "+account.getCustomerName());
		System.out.println("Account Balance : "+account.getAccountBalance());
		System.out.println("----------------------");
	}

}
