package com.hibernate.table.perclass;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PermanentEmployee extends Employee{
	
	@Column
	private int monthlySalary;

	public PermanentEmployee() {
	}

	public PermanentEmployee(int monthlySalary) {
		super();
		this.monthlySalary = monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(monthlySalary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermanentEmployee other = (PermanentEmployee) obj;
		return monthlySalary == other.monthlySalary;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [monthlySalary=" + monthlySalary + "]";
	}

	
}
