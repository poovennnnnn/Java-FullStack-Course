package com.feign;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orders {
	
	@Id
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="qty")
	private int qty;

	public Orders() {
		super();
	}

	public Orders(int orderId, String customerName, String productName, int qty) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.productName = productName;
		this.qty = qty;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerName, orderId, productName, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(customerName, other.customerName) && orderId == other.orderId
				&& Objects.equals(productName, other.productName) && qty == other.qty;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerName=" + customerName + ", productName=" + productName
				+ ", qty=" + qty + "]";
	}

	
	
}
