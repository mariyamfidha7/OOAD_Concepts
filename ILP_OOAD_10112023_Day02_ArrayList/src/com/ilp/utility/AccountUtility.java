package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerService;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = null;
		ArrayList<Account> accountList = new ArrayList<Account>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println("1.Create Account 2.Display All Account 3.Create Customer 4. Display All Customer 5.Display One Account 6.Display One Customer");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
//				account = AccountService.createAccount();
//				accountList.add(account);
				accountList.add(AccountService.createAccount());
				break;
			case 2:
				AccountService.displayAllAccounts(accountList);			
				break;
			case 3:
//				customer = CustomerService.createCustomer();
				customerList.add(CustomerService.createCustomer());
				break;
			case 4:
				CustomerService.displayAllCustomers(customerList);
				break;
			case 5 :
				AccountService.searchAccount(accountList);
				break;
			case 6 :
				CustomerService.searchCustomer(customerList);
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
		
	}

}
