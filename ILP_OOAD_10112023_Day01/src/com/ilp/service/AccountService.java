package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter opening balance");
		double openingBalance = scanner.nextDouble();
		Account account = new Account("ACC100","Savings Account",openingBalance); //constructors are used to initialize member variables
		return account;
	}

	public static void displayAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account No"+"    "+"Account Name"+"     "+"Account Balance");
		System.out.println(account.getAccountNo()+"      "+account.getAccountName()+"     "+account.getAccountBalance());
		
	}

}
