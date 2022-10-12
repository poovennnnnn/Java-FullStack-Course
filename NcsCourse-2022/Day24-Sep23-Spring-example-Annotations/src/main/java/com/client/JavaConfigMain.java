package com.client;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.EmployeeConfig;
import com.pooven.controller.EmployeeController;



public class JavaConfigMain {

	
	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeController controller = ctx.getBean(EmployeeController.class);
		controller.addRecord();
		
		ctx.close();
		
		
		

	}

}
