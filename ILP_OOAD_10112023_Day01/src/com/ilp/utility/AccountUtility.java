package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.service.AccountService;
import com.ilp.service.CustomerService;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = null;
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println("1.Create Account 2.Display Account 3.Create Customer 4. Display Customer");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				account = AccountService.createAccount();
				break;
			case 2:
				AccountService.displayAccount(account);
				break;
			case 3:
				customer = CustomerService.createCustomer();
				break;
			case 4:
				CustomerService.displayCustomer(customer);
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
		
	}

}
