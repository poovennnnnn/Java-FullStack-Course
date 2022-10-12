package com.examples.service;

import com.examples.dao.EmployeeDao;
import com.examples.dto.Employee;

public class EmployeeService {
	
	private EmployeeDao empDao;

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	public void addRecord(Employee e) {
		empDao.addRecord(e);
	}

}
