package com.pooven.dao;

import java.util.List;

import com.pooven.dto.BankAccount;

public interface BankAccountDao {
	
	BankAccount addRecord(BankAccount account);
	List<BankAccount> findAll();
    BankAccount updateRecord(BankAccount newAccount);

}
