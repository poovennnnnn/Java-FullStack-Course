package com.ems.service;

import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	public abstract Employee findEmployee(int employeeId) throws EmployeeNotFoundException;
	public abstract void showAllEmployee();
	public abstract double getEmployeeSalary(int employeeId) throws EmployeeNotFoundException;
	public abstract void updateEmployee(int employeeId , String employeeName) throws EmployeeNotFoundException;
	public abstract void updateEmployeeSalary(int employeeId , double salary) throws EmployeeNotFoundException;

}
