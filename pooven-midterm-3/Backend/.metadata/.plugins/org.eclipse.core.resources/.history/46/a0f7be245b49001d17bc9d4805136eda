package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.exceptions.EmployeeAlreadyExistException;
import com.employee.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	
	
	Employee save(Employee employee) throws EmployeeNotFoundException, EmployeeAlreadyExistException;
	Employee findById(Integer id) throws EmployeeNotFoundException;
	Employee update(Employee employee)throws EmployeeNotFoundException;; 
	List<Employee> findAll();
	void deleteById(Integer id) throws EmployeeNotFoundException;
	boolean existsByEmpId(Integer id);
	
	

}
