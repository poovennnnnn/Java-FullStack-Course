package com.ems.dto;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String jobType;
	private double salary;


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee(int employeeId, String employeeName, String jobType, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.jobType = jobType;
		this.salary = salary;
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


	public String getJobType() {
		return jobType;
	}


	public void setJobType(String jobType) {
		this.jobType = jobType;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", jobType=" + jobType
				+ ", salary=" + salary + "]";
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
