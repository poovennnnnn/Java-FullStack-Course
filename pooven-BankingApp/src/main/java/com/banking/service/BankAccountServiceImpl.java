package com.banking.service;

import java.util.List;

import com.banking.dao.BankAccountDaoImpl;
import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;

public class BankAccountServiceImpl implements BankAccountService {
	
	BankAccountDaoImpl dao = new BankAccountDaoImpl();

	@Override
	public void addBankAccount(BankAccount account) {

		dao.addBankAccount(account);
	}

	@Override
	public void updateBankAccount( BankAccount account) throws CustomerNotFoundException {
	
		dao.updateBankAccount( account);
	}

	@Override
	public List<BankAccount> findAllBankAccount() {
	
		return dao.findAllBankAccount();
	}

	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {

		return dao.findBankAccountByAccountNumber(accountNumber);
	}

	@Override
	public void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {

		dao.deleteBankAccountByaccountNumber(accountNumber);
	}

	@Override
	public void showBalance(Long accountNumber) throws CustomerNotFoundException {

		dao.showBalance(accountNumber);
	}

	@Override
	public void deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {

		dao.deposit(accountNumber, ammountToDeposit);
	}

	@Override
	public void withdraw(Long accountNumber, Double ammountToWithdraw)
			throws CustomerNotFoundException, InSufficientAmmountException {

		dao.withdraw(accountNumber, ammountToWithdraw);
	}

	

}
