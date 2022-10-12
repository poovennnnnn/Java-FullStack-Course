package com.banking.dao;

import java.util.List;

import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;

public interface BankAccountDao {
	
	public abstract void addBankAccount(BankAccount account);
	public abstract void updateBankAccount(BankAccount account) throws CustomerNotFoundException;
	public abstract List<BankAccount> findAllBankAccount();
	public abstract BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException;
	public abstract  void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException;
	public abstract void showBalance(Long accountNumber) throws CustomerNotFoundException;
	public abstract void deposit(Long accountNumber,Double ammountToDeposit) throws CustomerNotFoundException;
	public abstract void withdraw(Long accountNumber,Double ammountToWithdraw) throws CustomerNotFoundException, InSufficientAmmountException;

	

}
