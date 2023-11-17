package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter code");
		String customerCode = scanner.nextLine();
		System.out.println("Enter name");
		String customerName = scanner.nextLine();
		Customer customer = new Customer(customerCode,customerName);

		
		return customer;
	}

	public static void searchCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Code : - ");
		String customerSearchCode = scanner.nextLine();	
		for(Customer customer : customerList) {
			if(customer.getCustomerCode().equalsIgnoreCase(customerSearchCode));{
				System.out.println("Customer Code"+"    "+"Customer Name");
				System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName());
				
			}
			
		}
		
	}

	public static void displayAllCustomers(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code"+"    "+"Customer Name");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName());
		}
		
	}

}
