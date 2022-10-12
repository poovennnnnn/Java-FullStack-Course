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
		// TODO Auto-generated method stub
		dao.addBankAccount(account);
	}

	@Override
	public void updateBankAccount( BankAccount account) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		dao.updateBankAccount( account);
	}

	@Override
	public List<BankAccount> findAllBankAccount() {
		// TODO Auto-generated method stub
		return dao.findAllBankAccount();
	}

	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return dao.findBankAccountByAccountNumber(accountNumber);
	}

	@Override
	public void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		dao.deleteBankAccountByaccountNumber(accountNumber);
	}

	@Override
	public void showBalance(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		dao.showBalance(accountNumber);
	}

	@Override
	public void deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		dao.deposit(accountNumber, ammountToDeposit);
	}

	@Override
	public void withdraw(Long accountNumber, Double ammountToWithdraw)
			throws CustomerNotFoundException, InSufficientAmmountException {
		// TODO Auto-generated method stub
		dao.withdraw(accountNumber, ammountToWithdraw);
	}

	

}
