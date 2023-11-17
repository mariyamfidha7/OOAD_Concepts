package com.ilp.entity;

import java.util.ArrayList;

public class SavingsAccount extends Product {
	
	private double balance;

	public SavingsAccount(String productCode, String productName, ArrayList<Services> servicesList, double balance) {
		super(productCode, productName, servicesList);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
