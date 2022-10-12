package com.hibernate.joined.table.mapping;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "empId")
public class PermanentEmployee2 extends Employee2{
	
	@Column
	private int monthlySalary;

	public PermanentEmployee2() {
	}

	public PermanentEmployee2(int monthlySalary) {
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
		PermanentEmployee2 other = (PermanentEmployee2) obj;
		return monthlySalary == other.monthlySalary;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [monthlySalary=" + monthlySalary + "]";
	}

	
}
