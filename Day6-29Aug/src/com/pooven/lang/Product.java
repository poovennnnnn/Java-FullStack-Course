package com.pooven.lang;

import java.util.Objects;

public class Product extends java.lang.Object {
	
	private int proId;
	private String proName;
	
	
	public Product(int proId, String proName) {
		super();
		this.proId = proId;
		this.proName = proName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(proId, proName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return proId == other.proId && Objects.equals(proName, other.proName);
	}
	
	
	
	
	
	

}
