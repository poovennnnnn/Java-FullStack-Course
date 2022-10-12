package com.banking.client;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.banking.datastore.DataStore;
import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;
import com.banking.service.BankAccountServiceImpl;
import com.banking.utility.BankAccountUtil;

public class BankAccountMain {

	private static final Logger logger = LogManager.getLogger(BankAccountMain.class);
	
	public static void main(String[] args) throws CustomerNotFoundException, InSufficientAmmountException {
		
		
		
		var service = new BankAccountServiceImpl();
		
		
		//LOADING THE DATA INTO THE DATASTORE LIST
		DataStore.start();
		
		
		//DEMONSTRATES CREATING A BANKACCOUNT
		logger.debug("DEMONSTRATES CREATING A BANKACCOUNT");
		logger.debug("-------------------");
		var b1 = new BankAccount(3000012l,"abishek",4500.0);
	    service.addBankAccount(b1);
	    logger.debug("**********************");
	    
	    
	    
	    //DEMONSTRATES UPDATING A BANKACCOUNT
	    logger.debug("DEMONSTRATES UPDATING A BANKACCOUNT");
	    logger.debug("-----------------------");
	    var b2 = new BankAccount(300001l,"NEW NAME",3500.0);
	    service.updateBankAccount( b2);
	    
	    logger.debug("*********************");
	    
	    
	    //DEMONSTRATES FINDING ALL BANKACCOUNT
	    logger.debug("DEMONSTRATES FIND ALL  BANKACCOUNT");
	    logger.debug("------------------");
	    List<BankAccount> list = service.findAllBankAccount();
	    list.forEach(BankAccountUtil::printDetails);
	    logger.debug("***********************");
	    
		
	    //DEMONSTRATES FIND  ONE BANKACCOUNT by ACCOUNT NUMBER
	    logger.debug("DEMONSTRATES FIND ONE BANKACCOUNT");
	    logger.debug("------------------");
	    BankAccount b3 = service.findBankAccountByAccountNumber(300004l);
	    BankAccountUtil.printDetails(b3);
	    logger.debug("***********************");
	    
	    //DEMONSTRATES DELETE BANKACCOUNT by ACCOUNT NUMBER
	    logger.debug("DEMONSTRATES DELETE  BANKACCOUNT");
	    logger.debug("------------------");
	    service.deleteBankAccountByaccountNumber(300007l);
	    logger.debug("***********************");
	    
	    
	    //DEMONSTRATES DEPOSIT FUNDS
	    logger.debug("DEMONSTRATES DEPOSIT FUNDS");
	    logger.debug("------------------");
	    service.deposit(300001l, 1200.0);
	    logger.debug("***********************");
	    
	  //DEMONSTRATES WITHDRAW FUNDS
	    logger.debug("DEMONSTRATES WITHDRAW FUNDS");
	    logger.debug("------------------");
	    service.withdraw(300004l, 1000.0);
	    logger.debug("***********************");


	    //DEMONSTRATES EXCEPTIONS
	    
	    logger.debug("DEMONSTRATES EXCEPTION");
	  //  BankAccount b4 = service.findBankAccountByAccountNumber(3000034l); //throws CustomerNotFoundException
	    
	   // service.withdraw(300002l,10000.0); //throws InSufficientAmmountException
	    
	    
	}

}
