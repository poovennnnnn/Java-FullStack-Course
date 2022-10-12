package com.training.collection;

import java.util.Objects;

public class Product implements Comparable<Product>{
	
	private int prodId;
	private String prodName;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("hash  is used");
		return Objects.hash(price, prodId, prodName);
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals....");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && prodId == other.prodId
				&& Objects.equals(prodName, other.prodName);
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product arg0) {
		// TODO Auto-generated method stub
		System.out.println("compare to..");
		return prodName.compareTo(arg0.prodName);
	}
	

}
