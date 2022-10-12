package com.pooven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pooven.dao.BankAccountDao;
import com.pooven.dto.BankAccount;

@Service
public class BankAccountService {
	
	@Autowired
	public BankAccountDao bankAccountDao;
	
	public BankAccount addRecord(BankAccount account) {
		return bankAccountDao.addRecord(account);
	}

	public BankAccount updateRecord(BankAccount newAccount) {

		return bankAccountDao.updateRecord(newAccount);
	}

}
