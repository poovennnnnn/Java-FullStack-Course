package com.examples.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.controller.EmployeeController;
import com.examples.dto.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {
				"ControllerBeans.xml",
				"DataSourceBean.xml",
				"DaoBeans.xml",
				"ServiceBeans.xml",
				"EmployeeBean.xml"
				});
		EmployeeController controller = (EmployeeController) ctx.getBean("employeeController");
		Employee e1 = (Employee) ctx.getBean("e1");
		controller.addRecord(e1);

	}

}
