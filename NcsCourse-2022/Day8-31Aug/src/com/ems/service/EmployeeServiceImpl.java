package com.ems.service;

import com.ems.dao.EmployeeDaoImpl;
import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoImpl dao = new EmployeeDaoImpl();

	@Override
	public Employee findEmployee(int employeeId) {
		Employee e = null;
		try {
			e = dao.findEmployee(employeeId);
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		dao.showAllEmployee();

	}

	@Override
	public double getEmployeeSalary(int employeeId)  {
		// TODO Auto-generated method stub
		double salary =0;
		try {
			salary = dao.getEmployeeSalary(employeeId);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salary;
	}

	@Override
	public void updateEmployee(int employeeId, String employeeName)  {
		// TODO Auto-generated method stub
		
		try {
			dao.updateEmployee(employeeId, employeeName);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmployeeSalary(int employeeId, double salary)  {
		// TODO Auto-generated method stub
		
		try {
			dao.updateEmployeeSalary(employeeId, salary);
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
