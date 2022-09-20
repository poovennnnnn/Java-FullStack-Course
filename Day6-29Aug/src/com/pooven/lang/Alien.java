package com.pooven.lang;

import java.util.Objects;

public class Alien {
	
	private int aId;
	private String aName;
	
	

	public Alien() {
		// TODO Auto-generated constructor stub
	}



	public Alien(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}



	public int getaId() {
		return aId;
	}



	public void setaId(int aId) {
		this.aId = aId;
	}



	public String getaName() {
		return aName;
	}



	public void setaName(String aName) {
		this.aName = aName;
	}



	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(aId, aName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alien other = (Alien) obj;
		return aId == other.aId && Objects.equals(aName, other.aName);
	}
	
	

	
}
