package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter code");
		String customerCode = scanner.nextLine();
		
		System.out.println("Enter name");
		String customerName = scanner.nextLine();
		Account account = AccountService.createAccount();
		Customer customer = new Customer(customerCode,customerName,account);		
		return customer;
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code"+"    "+"Customer Name"+"    "+"Account Code"+"    "+"Account Name"+"    "+"Account Balance");
		System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName()+"  "+customer.getAccount().getAccountNo()+"  "+customer.getAccount().getAccountName()+"  "+customer.getAccount().getAccountBalance());
		
	}

}
