package com.pooven.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;


public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public void addRecord() {
		
		dao.addRecord();
		System.out.println("Added record service");
	}

}
