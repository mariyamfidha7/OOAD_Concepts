package com.ilp.entity;

public class Account {
	
	private String accountNo;
	private String accountName;
	private double accountBalance;
	
	public Account(String accountNo,String accountName,double accountBalance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
