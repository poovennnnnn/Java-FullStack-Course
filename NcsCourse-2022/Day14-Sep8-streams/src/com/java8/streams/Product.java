package com.java8.streams;


import java.util.Objects;

public class Product  implements Comparable<Product>{
	
	private Integer prodId;
	private String prodName;


	public Product() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public Product(Integer prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}


	public Integer getProdId() {
		return prodId;
	}


	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(prodId, prodName);
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
		return Objects.equals(prodId, other.prodId) && Objects.equals(prodName, other.prodName);
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}

	

	
}
