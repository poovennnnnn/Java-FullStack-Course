package com.pooven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pooven.dao.BankAccountDao;
import com.pooven.dto.BankAccount;
import com.pooven.exception.CustomerAlreadyExistsException;
import com.pooven.exception.CustomerNotFoundException;
import com.pooven.exception.InSufficientAmmountException;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	private BankAccountDao bankAccountDao;

	@Override
	public BankAccount addRecord(BankAccount account) throws CustomerNotFoundException, CustomerAlreadyExistsException {
		return bankAccountDao.addRecord(account);
	}

	@Override
	public List<BankAccount> findAll() {
		return bankAccountDao.findAll();
	}

	@Override
	public BankAccount updateRecord(BankAccount newAccount) throws CustomerNotFoundException {
		return bankAccountDao.updateRecord(newAccount);
	}

	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		return  bankAccountDao.findBankAccountByAccountNumber(accountNumber);
	}

	@Override
	public String deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
		return bankAccountDao.deleteBankAccountByaccountNumber(accountNumber);
	}

	@Override
	public String showBalance(Long accountNumber) throws CustomerNotFoundException {
		return bankAccountDao.showBalance(accountNumber);
	}

	@Override
	public String deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {
		return bankAccountDao.deposit(accountNumber, ammountToDeposit);
	}

	@Override
	public String withdraw(Long accountNumber, Double ammountToWithdraw)
			throws CustomerNotFoundException, InSufficientAmmountException {
		return bankAccountDao.withdraw(accountNumber, ammountToWithdraw);
	}

}
