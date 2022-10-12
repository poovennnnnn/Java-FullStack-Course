package com.ems.dao;

import com.ems.datastore.EmployeeDataStore;
import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;


public class EmployeeDaoImpl  implements EmployeeDao{
	

	@Override
	public Employee findEmployee(int employeeId) throws EmployeeNotFoundException {
	
		if(employeeId == 0) {
			return new Employee();
		}
	            Employee e = find(employeeId);
	            return e;
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------");
		System.out.println("Employee List");
		
		for(Employee e: EmployeeDataStore.employeeArray) {
			System.out.println(e);
		}
	}

	@Override
	public double getEmployeeSalary(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		if(employeeId == 0) {
			return 0;
		}
		Employee foundEmployee = find(employeeId);
		
		return foundEmployee.getSalary();
	}

	@Override
	public void updateEmployee(int employeeId, String employeeName) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		if(employeeId == 0 | employeeName == null) {
			System.out.println("Employee Update Failed");
		}
		
		Employee e = find(employeeId);
		
		System.out.println("Update name from "+e.getEmployeeName()+" to "+employeeName);
		e.setEmployeeName(employeeName);
		System.out.println("Updated .........................");
		
		
		
	}

	@Override
	public void updateEmployeeSalary(int employeeId , double salary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		if(employeeId == 0 | salary == 0) {
			System.out.println("Employee Update Failed");
		}
		
		Employee e = findEmployee(employeeId);

		System.out.println("Update salary from "+e.getSalary()+" to "+salary);
		e.setSalary(salary);
		System.out.println("Updated .........................");
		
		
		
		
	}
	
	
	
	//static method to find a employee in a array by id
	public static Employee find(int employeeId) throws EmployeeNotFoundException {
        Employee foundEmployee = null;
		
		for(Employee e: EmployeeDataStore.employeeArray) {
			
			if(employeeId == e.getEmployeeId()) {
				foundEmployee = e;
			}
		}
			if (foundEmployee == null) {
				throw new EmployeeNotFoundException("Employee id "+employeeId +" is not found");
			}
		
			
		
		return foundEmployee;
		

	
	}

}
