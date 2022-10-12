package com.client;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.pooven.controller.EmployeeController;



public class EmployeeMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeController controller = ctx.getBean(EmployeeController.class);
		controller.addRecord();
		
		
		

	}

}
