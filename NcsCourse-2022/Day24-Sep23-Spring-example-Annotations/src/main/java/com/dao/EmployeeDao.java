package com.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.datasource.MyDataSource;


public class EmployeeDao {
	
	@Autowired
	private MyDataSource dataSource;
	
	public void addRecord() {
		
		dataSource.getConnection();
		System.out.println("Added record Dao");
	}

}
