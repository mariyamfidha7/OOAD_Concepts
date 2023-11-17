package com.ilp.utility;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerConfiguration;
import com.ilp.service.ProductConfiguration;
import com.ilp.service.ServicesService;

public class CustomerUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = null;
		Customer customer = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Services> servicesList = new ArrayList<Services>();
		Scanner scanner = new Scanner(System.in);
		char yesOrNo;
		int mainMenuChoice;
		do {
			System.out.println("Welcome to bank");
			System.out.println("1.Create Service 2.Create Products 3.Create Account 4. Manage Account 5.Display Account 5.Perfrom a Transaction?");
		    mainMenuChoice = scanner.nextInt();
			switch(mainMenuChoice) {
				case 1: 
				servicesList=ProductConfiguration.addServices();
				break;
				case 2:
				productList=ProductConfiguration.addProduct(servicesList);
				break;
				case 3:customer = CustomerConfiguration.createCustomer(productList,servicesList);
				customerList.add(customer);
				break;
				case 4: CustomerConfiguration.manageAccount(customer,productList);
				break;
				case 5:CustomerConfiguration.displayCustomer(customerList);
				break;
				case 6:CustomerConfiguration.transactionBill(customer, customer.getCustomerCode());
				break;
				default:
				System.out.println("Invalid");
				break;
			}
			System.out.println("Do you want to continue y/n : ");
			yesOrNo = scanner.next().charAt(0);	
		  }while(yesOrNo=='y');
	}
		
}
