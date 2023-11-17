package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Services;

public class ServicesService {
	public static ArrayList<Services> createServices() {
		ArrayList<Services> servicesList = new ArrayList<Services>();
		Services services = new Services("1","Internet Banking",3.00);
		Services services1 = new Services("2","Cash Withdrawl",3.00);
		Services services2 = new Services("3","Cash Deposit",3.00);
		Scanner scanner = new Scanner(System.in);

		char yesOrNo;
		do {
			System.out.println("Choose the Services you want to add \r\n"
					+ "\r\n"
					+ "1.Internet Banking \r\n"
					+ "\r\n"
					+ "2.Cash Withdrawl \r\n"
					+ "\r\n"
					+ "3.Cash Deposit \r\n"
					+ "\r\n"
					+ "Enter your choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: servicesList.add(services);
			break;
			case 2: servicesList.add(services1);
			break;
			case 3: servicesList.add(services2);
			break;
		 }
		System.out.println("Do you want to add more?");
		yesOrNo = scanner.next().charAt(0);	
	   }while(yesOrNo=='y');
	return servicesList;
	}
}
