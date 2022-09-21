package com.hibernate.joined.table.mapping;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "empId")
public class ContractEmployee2 extends Employee2{
	
	@Column
	private int hourlyRate;

	public ContractEmployee2() {
	}

	public ContractEmployee2(int hourlyRate) {
		super();
		this.hourlyRate = hourlyRate;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "ContractEmployee [hourlyRate=" + hourlyRate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hourlyRate);
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
		ContractEmployee2 other = (ContractEmployee2) obj;
		return hourlyRate == other.hourlyRate;
	}

	
}
