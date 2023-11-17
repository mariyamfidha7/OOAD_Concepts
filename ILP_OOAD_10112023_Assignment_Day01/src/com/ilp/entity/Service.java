package com.ilp.entity;

public class Service {

	private String serviceNo;
	private String serviceName;
	private double servicePrice;
	
	public Service(String serviceNo,String serviceName,double servicePrice) {
		this.serviceNo = serviceNo;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
}
	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}
}
