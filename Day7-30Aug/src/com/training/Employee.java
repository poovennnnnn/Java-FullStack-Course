package com.training;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return employeeId - o.employeeId;
	}
	
	
	

}
