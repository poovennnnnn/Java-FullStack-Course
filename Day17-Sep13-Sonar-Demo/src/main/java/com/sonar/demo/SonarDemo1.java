package com.sonar.demo;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SonarDemo1 {
	
	public final static int MAX_SCORE=10;
	public final static String STR="hello";
	public final  static Logger log = LogManager.getLogger(SonarDemo1.class);

	public void  welcome() {
		
	    m1(STR);
	    m1(STR);
	   
	    
		List<Integer> inList = null;
		if (inList == null) {
			log.debug("List is null");
		}else {
			log.debug("List size is :"+inList.size());
		}
		
		
	}

	public static void m1(String name) {

		log.debug("Welcome "+name);
		
	}

	public static void m2() {
		
		int num[] = {1,23,4,5};
		
		Arrays.stream(num).forEach(log::debug);

	}
	public static void m3() {

		String str = new String("java");
		Integer i = Integer.valueOf(MAX_SCORE);
		
		log.debug(str);
		log.debug("Max value is :"+i);
	}

}
