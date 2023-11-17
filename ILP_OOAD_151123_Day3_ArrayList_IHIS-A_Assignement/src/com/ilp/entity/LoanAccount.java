package com.ilp.entity;

import java.util.ArrayList;

public class LoanAccount extends Product {
	private double checkDeposit;
	

	public LoanAccount(String productCode, String productName, ArrayList<Services> servicesList, double checkDeposit) {
		super(productCode, productName, servicesList);
		this.checkDeposit = checkDeposit;
	}

	public double getCheckDeposit() {
		return checkDeposit;
	}

	public void setCheckDeposit(double checkDeposit) {
		this.checkDeposit = checkDeposit;
	}
}
