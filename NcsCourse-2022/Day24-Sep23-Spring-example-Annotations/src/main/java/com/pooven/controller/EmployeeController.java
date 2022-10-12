package com.pooven.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.pooven.service.EmployeeService;


public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	public void addRecord() {
		
		service.addRecord();
		System.out.println("Added record in controller");
	}

}
