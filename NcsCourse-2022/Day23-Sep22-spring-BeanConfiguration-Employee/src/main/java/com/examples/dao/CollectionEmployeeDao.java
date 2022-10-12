package com.examples.dao;

import com.examples.dto.Employee;

public class CollectionEmployeeDao implements EmployeeDao {
	 private  MyDataSource myDataSource;
	 
	 

	public MyDataSource getMyDataSource() {
		return myDataSource;
	}



	public void setMyDataSource(MyDataSource myDataSource) {
		this.myDataSource = myDataSource;
	}



	@Override
	public void addRecord(Employee e) {
	
		myDataSource.getConnection();
		System.out.println("Record Added in Collection  "+e );
		
		
	}

}
