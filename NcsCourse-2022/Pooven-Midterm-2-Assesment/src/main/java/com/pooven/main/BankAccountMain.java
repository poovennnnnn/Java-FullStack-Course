package com.pooven.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pooven.config.BankAccountConfig;
import com.pooven.dto.BankAccount;
import com.pooven.exception.CustomerAlreadyExistsException;
import com.pooven.exception.CustomerNotFoundException;
import com.pooven.exception.InSufficientAmmountException;
import com.pooven.service.BankAccountService;

public class BankAccountMain {
	
	static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BankAccountConfig.class);
	static BankAccountService service = ctx.getBean(BankAccountService.class);

	public static void main(String[] args) throws CustomerNotFoundException, CustomerAlreadyExistsException, InSufficientAmmountException {

		
	
		addrecord();
		System.out.println("---------------------------");
		

		updateRecord();
		System.out.println("---------------------------");
		
		findBankAccountByAccountNumber(101l);
		
		System.out.println("---------------------------");
		
		deleteBankAccountByaccountNumber(108l);
		System.out.println("---------------------------");
		
		deposit(103l, 2000.0);
		System.out.println("---------------------------");
		
		withdraw(104l, 200.0);
		System.out.println("---------------------------");
		
		findAll();
		
		
	}

	
	
	
	
	
	public static void addrecord() throws CustomerNotFoundException, CustomerAlreadyExistsException {
		
		service.addRecord(new BankAccount(108l, "lusifer", 540.0));
		System.out.println("record added");
	}
	
	public static void updateRecord() throws CustomerNotFoundException {
		BankAccount newAccount = new BankAccount(104l,"new name2",12000.0);
		service.updateRecord(newAccount);
		System.out.println("Record Updated");
		
	}
	
	public static void findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		BankAccount account = service.findBankAccountByAccountNumber(accountNumber);
		System.out.println(account.getCustomerName()+ " ---- "+account.getActBalance()+"--"+account.getActNumber());
		
	}
	
	public static void deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
		System.out.println(service.deleteBankAccountByaccountNumber(accountNumber));
	}
	
	public static void showBalance(Long accountNumber) throws CustomerNotFoundException {
		System.out.println(service.showBalance( accountNumber));
	}
	
	public static void  deposit(Long accountNumber,Double ammountToDeposit) throws CustomerNotFoundException{
		System.out.println(service.deposit(accountNumber, ammountToDeposit));
	}
	
	public static void withdraw(Long accountNumber,Double ammountToWithdraw) throws CustomerNotFoundException, InSufficientAmmountException{
		System.out.println(service.withdraw(accountNumber, ammountToWithdraw));
	}
	
	public static void findAll(){
		List<BankAccount> accountList = service.findAll();
		accountList.forEach((account)-> System.out.println(account.getCustomerName()+"--"+account.getActNumber()+"--"+account.getActBalance()));
	};
}
