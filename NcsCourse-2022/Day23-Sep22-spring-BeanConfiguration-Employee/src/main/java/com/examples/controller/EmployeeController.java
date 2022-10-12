package com.examples.controller;

import com.examples.dto.Employee;
import com.examples.service.EmployeeService;

public class EmployeeController {
	 private EmployeeService empService;

	public EmployeeService getEmpService() {
		return empService;
	}

	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	} 
	 
	public void addRecord(Employee e) {
		empService.addRecord(e);
	}

}
