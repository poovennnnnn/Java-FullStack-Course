package com.pooven.service;

import java.util.List;

import com.pooven.dto.BankAccount;
import com.pooven.exception.CustomerAlreadyExistsException;
import com.pooven.exception.CustomerNotFoundException;
import com.pooven.exception.InSufficientAmmountException;


public interface BankAccountService {
	

	BankAccount addRecord(BankAccount account) throws CustomerNotFoundException, CustomerAlreadyExistsException;
	List<BankAccount> findAll();
	BankAccount updateRecord(BankAccount newAccount) throws CustomerNotFoundException;
	BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException;
	String deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException;
	String showBalance(Long accountNumber) throws CustomerNotFoundException;
	String deposit(Long accountNumber,Double ammountToDeposit) throws CustomerNotFoundException;
	String withdraw(Long accountNumber,Double ammountToWithdraw) throws CustomerNotFoundException, InSufficientAmmountException;

}
