package com.banking.dao;

import java.util.Collections;
import java.util.List;

import com.banking.datastore.DataStore;
import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;
import com.banking.utility.BankAccountUtil;

public class BankAccountDaoImpl implements BankAccountDao {
	
 
	// CREATE BANK ACCOUNT
	@Override
	public void addBankAccount(BankAccount account) {
		// TODO Auto-generated method stub
		validateBankaccount(account);
		DataStore.storeData.add(account);
		System.out.println("BankAccount Created");
	}

	
	//UPDATE BANK ACCOUNT
	@Override
	public void updateBankAccount( BankAccount account) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		BankAccount tempAccount = find(account.getAccountNumber());
		
		validateBankaccount(account);
		tempAccount.setAccountBalance(account.getAccountBalance());
		tempAccount.setCustomerName(account.getCustomerName());
		
		System.out.println("BankAccount Updated");
		BankAccountUtil.printDetails(tempAccount);
		

	}

	
	//GET ALL THE BANKACCOUNT
	@Override
	public List<BankAccount> findAllBankAccount() {
		// TODO Auto-generated method stub
		return DataStore.storeData;
	}

	
	//GET BANKACCOUNT BY ACCOUNT NUMBER
	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return find(accountNumber);
	}

	//DELETE BANKACCOUNT BY ACCOUNT NUMBER
	@Override
	public void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		BankAccount account =  find(accountNumber);
		DataStore.storeData.remove(account);
		
		System.out.println("BankAccount Deleted");

	}

	//SHOW BALANCE BY ACCOUNTNUMBER
	@Override
	public void showBalance(Long accountNumber) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		BankAccount account =  find(accountNumber);
	    System.out.println("Your Account Balance :" +account.getAccountBalance());
	    
		
	}
	
	
	@Override
	public void deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		BankAccount temp = find(accountNumber);
		System.out.println("Before Update Balance is :"+temp.getAccountBalance());
		System.out.println("Deposit Ammount: "+ammountToDeposit);
		temp.setAccountBalance(temp.getAccountBalance()+ammountToDeposit);
		System.out.println("Deposit successfull");
		System.out.println("After Update Balance is :"+temp.getAccountBalance());
		
	}


	@Override
	public void withdraw(Long accountNumber, Double ammountToWithdraw) throws CustomerNotFoundException, InSufficientAmmountException {
		// TODO Auto-generated method stub
		BankAccount temp = find(accountNumber);
		System.out.println("Before Update Balance is :"+temp.getAccountBalance());
		System.out.println("Withdraw Ammount: "+ammountToWithdraw);
		if(temp.getAccountBalance()<(ammountToWithdraw)) {
			throw new InSufficientAmmountException("Insuffient funds to withdraw");
		}
		temp.setAccountBalance(temp.getAccountBalance() - ammountToWithdraw);
		System.out.println("Withdraw successfull");
		System.out.println("After Update Balance is:"+temp.getAccountBalance());
		
		
	}

	
	
	
	//PRIVATE METHOD TO FIND ACCOUNT BY ACCOUNT NUMBER
	private BankAccount find(Long accountNumber) throws CustomerNotFoundException {
		
	  BankAccount temp = null;

	                     
//	                     
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
		if(account == null || account.getAccountNumber() == 0 ||account.getAccountNumber()== null  || account.getCustomerName() == null  ) {
			throw new IllegalArgumentException("Account fields cannot be empty");
		}
		
		return true;
	}
	
	
}
