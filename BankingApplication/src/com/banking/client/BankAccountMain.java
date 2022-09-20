package com.banking.client;

import java.util.List;
import com.banking.datastore.DataStore;
import com.banking.dto.BankAccount;
import com.banking.exception.CustomerNotFoundException;
import com.banking.exception.InSufficientAmmountException;
import com.banking.service.BankAccountServiceImpl;
import com.banking.utility.BankAccountUtil;

public class BankAccountMain {

	public static void main(String[] args) throws CustomerNotFoundException, InSufficientAmmountException {
		// TODO Auto-generated method stub
		
		
		BankAccountServiceImpl service = new BankAccountServiceImpl();
		
		//LOADING THE DATA INTO THE DATASTORE LIST
		new DataStore();
		
		
		
		//DEMONSTRATES CREATING A BANKACCOUNT
		System.out.println("DEMONSTRATES CREATING A BANKACCOUNT");
	    System.out.println("------------------");
		BankAccount b1 = new BankAccount(3000012l,"abishek",4500.0);
	    service.addBankAccount(b1);
	    System.out.println("***********************");
	    
	    
	    
	    //DEMONSTRATES UPDATING A BANKACCOUNT
	    System.out.println("DEMONSTRATES UPDATING A BANKACCOUNT");
	    System.out.println("------------------");
	    BankAccount b2 = new BankAccount(300001l,"NEW NAME",3500.0);
	    service.updateBankAccount( b2);
	    
	    System.out.println("***********************");
	    
	    
	    //DEMONSTRATES FINDING ALL BANKACCOUNT
	    System.out.println("DEMONSTRATES FIND ALL  BANKACCOUNT");
	    System.out.println("------------------");
	    List<BankAccount> list = service.findAllBankAccount();
	    list.forEach((account) -> BankAccountUtil.printDetails(account));
	    System.out.println("***********************");
	    
		
	    //DEMONSTRATES FIND  ONE BANKACCOUNT by ACCOUNT NUMBER
	    System.out.println("DEMONSTRATES FIND ONE BANKACCOUNT");
	    System.out.println("------------------");
	    BankAccount b3 = service.findBankAccountByAccountNumber(300004l);
	    BankAccountUtil.printDetails(b3);
	    System.out.println("***********************");
	    
	    //DEMONSTRATES DELETE BANKACCOUNT by ACCOUNT NUMBER
	    System.out.println("DEMONSTRATES DELETE  BANKACCOUNT");
	    System.out.println("------------------");
	    service.deleteBankAccountByaccountNumber(300007l);
	    System.out.println("***********************");
	    
	    
	    //DEMONSTRATES DEPOSIT FUNDS
	    System.out.println("DEMONSTRATES DEPOSIT FUNDS");
	    System.out.println("------------------");
	    service.deposit(300001l, 1200.0);
	    System.out.println("***********************");
	    
	  //DEMONSTRATES WITHDRAW FUNDS
	    System.out.println("DEMONSTRATES WITHDRAW FUNDS");
	    System.out.println("------------------");
	    service.withdraw(300004l, 1000.0);
	    System.out.println("***********************");


	    //DEMONSTRATES EXCEPTIONS
	    
	    System.out.println("DEMONSTRATES EXCEPTION");
	  //  BankAccount b4 = service.findBankAccountByAccountNumber(3000034l); //throws CustomerNotFoundException
	    
	   // service.withdraw(300002l,10000.0); //throws InSufficientAmmountException
	    
	    
	}

}
