package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Code : - ");
		String accountCode = scanner.nextLine();
		System.out.println("Enter account name : - ");
		String accountName = scanner.nextLine();
		System.out.println("Enter opening balance");
		double openingBalance = scanner.nextDouble();
//		Account account = new Account(accountCode,accountName,openingBalance);
//		return account;
		return new Account(accountCode,accountName,openingBalance);
	}

	public static void searchAccount(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Code : - ");
		String accountSearchCode = scanner.nextLine();	
		for(Account account:accountList) {
//			String tempAccount=account.getAccountNo();
			if(account.getAccountNo().equalsIgnoreCase(accountSearchCode)) {
				System.out.println("Account No"+"    "+"Account Name"+"     "+"Account Balance");
				System.out.println(account.getAccountNo()+"      "+account.getAccountName()+"     "+account.getAccountBalance());
				
			}
			
		}
		
	}

	public static void displayAllAccounts(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		System.out.println("Account No"+"    "+"Account Name"+"     "+"Account Balance");
		for(Account account:accountList) {
			
			System.out.println(account.getAccountNo()+"      "+account.getAccountName()+"     "+account.getAccountBalance());		
		}
	}
}
