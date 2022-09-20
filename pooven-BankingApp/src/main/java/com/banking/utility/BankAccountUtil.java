package com.banking.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.banking.dto.BankAccount;

public class BankAccountUtil {
	private static final Logger logger = LogManager.getLogger(BankAccountUtil.class);
	 private BankAccountUtil() {
		    throw new IllegalStateException("Utility class");
		  }
	public static void printDetails(BankAccount account) {
		
		 logger.debug("--------------------");
		 logger.debug("Account Number : {}",account.getAccountNumber());
		 logger.debug("Customer Name : {}",account.getCustomerName());
		 logger.debug("Account Balance : {}",account.getAccountBalance());
		 logger.debug("------------------------");
	}

}
