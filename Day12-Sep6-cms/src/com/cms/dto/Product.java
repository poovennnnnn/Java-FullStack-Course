package com.cms.dto;

import java.util.Objects;

public class Product {
	
	private Integer prodId;
	private String prodName;
	private Double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer prodId, String prodName, Double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, prodId, prodName);
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
		return Objects.equals(price, other.price) && Objects.equals(prodId, other.prodId)
				&& Objects.equals(prodName, other.prodName);
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}

	
}
