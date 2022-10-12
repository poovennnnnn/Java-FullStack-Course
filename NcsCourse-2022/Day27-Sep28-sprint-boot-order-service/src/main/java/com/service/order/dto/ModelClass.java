package com.service.order.dto;

public class ModelClass {
	
	private Orders order;
	private Product product;
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ModelClass(Orders order, Product product) {
		super();
		this.order = order;
		this.product = product;
	}
	public ModelClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
