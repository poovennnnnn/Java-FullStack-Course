package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exceptions.EmployeeAlreadyExistException;
import com.employee.exceptions.EmployeeNotFoundException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee) throws EmployeeNotFoundException, EmployeeAlreadyExistException{
		
		
		Employee newEmployee = employeeService.save(employee);
		return new ResponseEntity<Employee>(newEmployee, HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<Object> findAll(){
		
		List<Employee> employeeList = employeeService.findAll();
		
		return new ResponseEntity<Object>(employeeList,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable  Integer id) throws EmployeeNotFoundException{
		
		Employee newEmployee = employeeService.findById(id);
		
		return new ResponseEntity<Employee>(newEmployee,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Integer id) throws EmployeeNotFoundException {
		
		employeeService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Employee> update(@RequestBody Employee employee) throws EmployeeNotFoundException{
		
		Employee newEmployee = employeeService.update(employee);
		
		return new ResponseEntity<Employee>(newEmployee,HttpStatus.OK);
	}

}