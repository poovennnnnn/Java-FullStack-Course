package com.pooven.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pooven.config.BankAccountConfig;
import com.pooven.dto.BankAccount;
import com.pooven.service.BankAccountService;

public class BankAccountMain {
	
	static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BankAccountConfig.class);
	static BankAccountService service = ctx.getBean(BankAccountService.class);

	public static void main(String[] args) {

		testAddrecord();
//		testUpdateRecord();
	}

	public static void testAddrecord() {
		
		service.addRecord(new BankAccount(101, "pooven", 100.0));
		System.out.println("record added");
	}
	
	public static void testUpdateRecord() {
		BankAccount newAccount = new BankAccount(101,"neee",12000);
		service.updateRecord(newAccount);
		System.out.println(newAccount);
	}
}
