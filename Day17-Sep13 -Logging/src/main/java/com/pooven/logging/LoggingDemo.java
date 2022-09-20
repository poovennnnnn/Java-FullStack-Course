package com.pooven.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	
	
	public static Logger log = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		
		log.debug("this ia a Debug Message");
		log.info("this ia a Info Message");
		log.error("this ia a Error Message");
		log.fatal("this ia a Fatal Message");
		
	
	}

}
