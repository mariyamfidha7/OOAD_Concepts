package com.ilp.entity;

public class Product {

	private String productNo;
	private String productName;
	private double productPrice;
	
	public Product(String productNo,String productName,double productPrice) {
		this.productNo = productNo;
		this.productName = productName;
		this.productPrice = productPrice;
}
	
	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
