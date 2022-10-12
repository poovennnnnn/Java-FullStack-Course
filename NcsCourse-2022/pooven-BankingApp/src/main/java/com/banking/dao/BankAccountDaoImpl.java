package com.banking.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.banking.datastore.DataStore;
import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;
import com.banking.utility.BankAccountUtil;

public class BankAccountDaoImpl implements BankAccountDao {
	private static final Logger logger = LogManager.getLogger(BankAccountDaoImpl.class);
	
 
	// CREATE BANK ACCOUNT
	@Override
	public void addBankAccount(BankAccount account) {
		
		validateBankaccount(account);
		DataStore.storeData.add(account);
		logger.debug("BankAccount Created");
	}

	
	//UPDATE BANK ACCOUNT
	@Override
	public void updateBankAccount( BankAccount account) throws CustomerNotFoundException {
	
		
		BankAccount tempAccount = find(account.getAccountNumber());
		
		validateBankaccount(account);
		tempAccount.setAccountBalance(account.getAccountBalance());
		tempAccount.setCustomerName(account.getCustomerName());
		
		logger.debug("BankAccount Updated");
		BankAccountUtil.printDetails(tempAccount);
		

	}

	
	//GET ALL THE BANKACCOUNT
	@Override
	public List<BankAccount> findAllBankAccount() {

		return DataStore.storeData;
	}

	
	//GET BANKACCOUNT BY ACCOUNT NUMBER
	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		
		return find(accountNumber);
	}

	//DELETE BANKACCOUNT BY ACCOUNT NUMBER
	@Override
	public void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
	
		BankAccount account =  find(accountNumber);
		DataStore.storeData.remove(account);
		
		logger.debug("BankAccount Deleted");

	}

	//SHOW BALANCE BY ACCOUNTNUMBER
	@Override
	public void showBalance(Long accountNumber) throws CustomerNotFoundException {

		BankAccount account =  find(accountNumber);
		logger.debug("Your Account Balance :{}" ,account.getAccountBalance());
	    
		
	}
	
	
	@Override
	public void deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {

		BankAccount temp = find(accountNumber);
		logger.debug("Before Update Balance is :{}",temp.getAccountBalance());
		logger.debug("Deposit Ammount:{} ",ammountToDeposit);
		temp.setAccountBalance(temp.getAccountBalance()+ammountToDeposit);
		logger.debug("Deposit successfull");
		logger.debug("After Update Balance is :{}",temp.getAccountBalance());
		
	}


	@Override
	public void withdraw(Long accountNumber, Double ammountToWithdraw) throws CustomerNotFoundException, InSufficientAmmountException {

		BankAccount temp = find(accountNumber);
		logger.debug("Before Update Balance is :{}",temp.getAccountBalance());
		logger.debug("Withdraw Ammount:{} ",ammountToWithdraw);
		if(temp.getAccountBalance()<(ammountToWithdraw)) {
			throw new InSufficientAmmountException("Insuffient funds to withdraw");
		}
		temp.setAccountBalance(temp.getAccountBalance() - ammountToWithdraw);
		logger.debug("Withdraw successfull");
		logger.debug("After Update Balance is:{}",temp.getAccountBalance());
	}

	
	
	
	//PRIVATE METHOD TO FIND ACCOUNT BY ACCOUNT NUMBER
	private BankAccount find(Long accountNumber) throws CustomerNotFoundException {
		
	  BankAccount temp = null;

	  for(BankAccount account: DataStore.storeData) {
		  if(account.getAccountNumber().equals(accountNumber)) {
			  temp = account;
		  }
	  }
	  
	  if(temp == null) {
		  throw new CustomerNotFoundException("Customer AccountNumber :"+accountNumber);
	  }
		
	  return temp;
		
	}
	
	
	//PRIVATE METHOD TO VALIDATE GIVEN OBJECT OR FIELDS IS EMPTY
	private boolean validateBankaccount(BankAccount account) {
		if(account == null || account.getAccountNumber() == 0 ||account.getAccountNumber() == (null)  || account.getCustomerName() == null  ) {
			throw new IllegalArgumentException("Account fields cannot be empty");
		}
		
		return true;
	}
	
	
}
