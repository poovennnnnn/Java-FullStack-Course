package com.pooven.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pooven.dto.BankAccount;
import com.pooven.exception.CustomerAlreadyExistsException;
import com.pooven.exception.CustomerNotFoundException;
import com.pooven.exception.InSufficientAmmountException;

@Repository
public class MySQLBankAccountDao implements BankAccountDao {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager;
	private EntityTransaction transaction;

	@Override
	public BankAccount addRecord(BankAccount account) throws CustomerNotFoundException, CustomerAlreadyExistsException {
		
	  
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();	
		transaction.begin();
		BankAccount temp = null;
		if(account != null) {
		 temp =  manager.find(BankAccount.class, account.getActNumber());
			
		}
		if(temp !=null) {
			throw new CustomerAlreadyExistsException("Already Exists Ac.no: "+account.getActNumber());
		}
	
		
		manager.persist(account);
		
		transaction.commit();	

		return account;
	}

	@Override
	public List<BankAccount> findAll() {
		
		
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();	
		Query query = manager.createQuery("SELECT s From  com.pooven.dto.BankAccount s");

		List<BankAccount>  bankAccountList = query.getResultList();

		
		return bankAccountList;
	}

	@Override
	public BankAccount updateRecord(BankAccount newAccount) throws CustomerNotFoundException {

		manager = factory.createEntityManager();
		transaction = manager.getTransaction();	
		transaction.begin();
		BankAccount account =  manager.find(BankAccount.class, newAccount.getActNumber());
		if(account == null) {
			throw new CustomerNotFoundException("Not Found Ac.no: "+newAccount.getActNumber());
		}
		manager.merge(newAccount);
		transaction.commit();
		
		return newAccount;
	}

	@Override
	public BankAccount findBankAccountByAccountNumber(Long accountNumber) throws CustomerNotFoundException {
		manager = factory.createEntityManager();
		BankAccount account =  manager.find(BankAccount.class, accountNumber);
		if(account == null) {
			throw new CustomerNotFoundException("Not Found Ac.no: "+accountNumber);
		}
		return account;
	}

	@Override
	public String deleteBankAccountByaccountNumber(Long accountNumber) throws CustomerNotFoundException {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		BankAccount account =  manager.find(BankAccount.class, accountNumber);
		if(account == null) {
			throw new CustomerNotFoundException("customer not found Ac.no: "+accountNumber );
		}
		manager.remove(account);
		transaction.commit();
		return "Deleted Successfully";
	}

	@Override
	public String showBalance(Long accountNumber) throws CustomerNotFoundException {
		manager = factory.createEntityManager();
		BankAccount account =  manager.find(BankAccount.class, accountNumber);
		if(account == null) {
			throw new CustomerNotFoundException("customer not found Ac.no: "+accountNumber );
		}
		
		return "Your Balance is "+account.getActBalance();
	}

	@Override
	public String deposit(Long accountNumber, Double ammountToDeposit) throws CustomerNotFoundException {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		transaction.begin();
		BankAccount account =  manager.find(BankAccount.class, accountNumber);
		if(account == null) {
			throw new CustomerNotFoundException("customer not found Ac.no: "+accountNumber );
		}
		Double balance = account.getActBalance();
		account.setActBalance(ammountToDeposit+balance);
		manager.persist(account);
		transaction.commit();
		
		return "Your updated balance is :"+account.getActBalance();

	}

	@Override
	public String withdraw(Long accountNumber, Double ammountToWithdraw)
			throws CustomerNotFoundException, InSufficientAmmountException {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		transaction.begin();
		BankAccount account =  manager.find(BankAccount.class, accountNumber);
		if(account == null) {
			throw new CustomerNotFoundException("customer not found Ac.no: "+accountNumber );
		}
		Double balance = account.getActBalance();
		if(ammountToWithdraw > balance) {
			throw new InSufficientAmmountException("Insufficent Fund Ac.no :"+account.getActNumber());
		}
		account.setActBalance(balance - ammountToWithdraw);
		manager.persist(account);
		transaction.commit();
		return "Your updated balance is :"+account.getActBalance();

	}

	
	//private util method

	

	
}
