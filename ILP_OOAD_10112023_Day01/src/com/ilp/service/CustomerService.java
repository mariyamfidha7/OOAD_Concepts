package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String customerName = scanner.nextLine();
		Customer customer = new Customer("CC100",customerName);

		
		return customer;
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code"+"    "+"Customer Name");
		System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName());
		
	}

}
