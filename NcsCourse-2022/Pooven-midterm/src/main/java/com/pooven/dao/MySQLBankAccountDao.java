package com.pooven.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pooven.dto.BankAccount;

@Repository
public class MySQLBankAccountDao implements BankAccountDao {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager;
	private EntityTransaction transaction;

	@Override
	public BankAccount addRecord(BankAccount account) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();	
		transaction.begin();
		manager.persist(account);
		transaction.commit();	

		return account;
	}

	@Override
	public List<BankAccount> findAll() {
		return null;
	}

	@Override
	public BankAccount updateRecord(BankAccount newAccount) {

		manager = factory.createEntityManager();
		transaction = manager.getTransaction();	
		transaction.begin();
		
//		BankAccount account=   manager.find(BankAccount.class, newAccount.getActNumber());
//		account.setActBalance(newAccount.getActBalance());
//		account.setCustomerName(newAccount.getCustomerName());
		
//		manager.persist(account);
		manager.merge(newAccount);
		transaction.commit();	

		return newAccount;
	}

}
