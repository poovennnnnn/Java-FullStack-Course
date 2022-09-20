package com.banking.datastore;

import java.util.ArrayList;

import java.util.List;

import com.banking.dto.BankAccount;

public class DataStore {
	
	public static List<BankAccount> storeData = new ArrayList<>();

	 private DataStore() {
		    throw new IllegalStateException("Utility class");
		  }

	public static void start() {
		
		storeData.add(new BankAccount(300001L, "Hari",6500.0));
		storeData.add(new BankAccount(300002L, "Kural",5500.0));
		storeData.add(new BankAccount(300003L, "Scott",4500.0));
		storeData.add(new BankAccount(300004L, "Ramesh",3500.0));
		storeData.add(new BankAccount(300005L, "Kevin",9500.0));
		storeData.add(new BankAccount(300006L, "Steve",8500.0));
		storeData.add(new BankAccount(300007L, "Amrish",7500.0));
		storeData.add(new BankAccount(300008L, "Karthik",2500.0));
		storeData.add(new BankAccount(300009L, "Dhanush",5500.0));
		storeData.add(new BankAccount(3000010L, "Pooven",4500.0));
		
		
		
		
	}
	
	
}
