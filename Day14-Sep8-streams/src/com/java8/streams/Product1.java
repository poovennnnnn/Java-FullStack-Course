package com.java8.streams;


import java.util.Objects;

public class Product1  implements Comparable<Product>{
	
	private Integer prodId;
	private String prodName;
	private double price;
	private int qoh;
	private String category;
	


	public Product1() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}



	public Product1(Integer prodId, String prodName, double price, int qoh, String category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.qoh = qoh;
		this.category = category;
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



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQoh() {
		return qoh;
	}



	public void setQoh(int qoh) {
		this.qoh = qoh;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public int hashCode() {
		return Objects.hash(category, price, prodId, prodName, qoh);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product1 other = (Product1) obj;
		return Objects.equals(category, other.category)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(prodId, other.prodId) && Objects.equals(prodName, other.prodName) && qoh == other.qoh;
	}



	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", qoh=" + qoh
				+ ", category=" + category + "]";
	}


	
	
}
