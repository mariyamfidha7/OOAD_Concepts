package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsAccount;
import com.ilp.entity.Services;

public class CustomerConfiguration {
	
	public static Account createAccount(ArrayList<Product> productList,ArrayList<Services> serviceList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the account code : ");
		String accountCode = scanner.next();
		System.out.print("Enter the opening balance to be deposited : ");
		double openingBlance = scanner.nextDouble();
		System.out.println("The exisiting products:");
		for(Product product: productList)
		{
			System.out.println(product.getProductCode()+" "+product.getProductName());
			System.out.println("The services for the product are:");
			for(Services services : product.getServicesList()) {
				System.out.println(services.getServiceName());
			}
		}
		System.out.println("Enter the product code to be added:");
		String selectProduct = scanner.next();
		Product selectedProduct=null;
		for(Product product:productList)
		{
			if(selectProduct.equals(product.getProductCode()))
			{
				selectedProduct=product;
			}
		}
		return new Account(accountCode,openingBlance,selectedProduct);
		
	}


	public static void displayAllAccounts(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		System.out.println("Account No."+"\t"+"Account Name"+"\t"+"Opening Balance");
		for(Account account : accountList) {
			System.out.println(account.getAccountNo()+"\t\t"+account.getBalance());
		}
		
	}

	public static Customer createCustomer(ArrayList<Product> productList,ArrayList<Services> serviceList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		ArrayList<Account> accountList= new ArrayList<Account>();
		System.out.println("Enter the customer code : ");
		String customerCode = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the customer name : ");
		String customerName = scanner.nextLine();
		account = createAccount(productList,serviceList);
		accountList.add(account);
		System.out.println();
		System.out.println("Account Created!!!");
		return new Customer(customerCode,customerName,accountList);
	}


	public static void displayCustomer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the customer code");
//		String customerCode = scanner.next();
		System.out.println();
		System.out.println("**************Customer-Info******************\r\n"
				+ "\r\n"
				+ "Customer Code"+"\t"+"Customer Name\r\n"
				+ "\r\n"
				+ "***************************************************");
		for(Customer customer: customerList) {
//			if(customerCode.equals(customer.getCustomerCode())){
			System.out.println(customer.getCustomerCode()+"\t\t"+customer.getCustomerName());
			System.out.println();
			System.out.println("******************Account-Info**********************\r\n"
					+ "\r\n"
					+ "Account Number"+"\t"+"Account Name"+"\t"+"Account Type\r\n"
					+ "\r\n"
					+ "***************************************************************");
			for(Account account: customer.getAccountList()) {
				System.out.println(account.getAccountNo()+"\t\t"+account.getBalance()+"\t\t"+account.getProduct().getProductName());
//			}
		}
	  }
		for(Customer customer: customerList) {
			for(Account account:customer.getAccountList()) {
				Product product=account.getProduct();
					System.out.println("Services for "+product.getProductName()+": ");
					int i=1;
					for(Services service:product.getServicesList()) {
						System.out.println(i+"."+service.getServiceName());
					}
			}
		}
	}
	
	
	
	public static void transactionBill(Customer customer, String customerCode) {
		// TODO Auto-generated method stub
		if (!(customerCode.equalsIgnoreCase(customer.getCustomerCode()))) {
			System.out.println("Customer not found!");
		} else {
			System.out.println(customer.getCustomerName() + " has the following accounts");
			for (Account account : customer.getAccountList()) {
				System.out.println(account.getAccountNo() + " - " + account.getProduct().getProductName());
			}
 
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the account no you want to operate on : ");
			String accountChoice = scanner.nextLine();
			for (Account account : customer.getAccountList()) {
				if (accountChoice.equalsIgnoreCase(account.getAccountNo())) {
					Product product = account.getProduct();
					System.out.print("Choose the Service you want to use : ");
					for (Services services : product.getServicesList()) {
						System.out.println(services.getServiceCode() + ". " + services.getServiceName());
					}
					System.out.print("Enter the service ID you want to use : ");
					String serviceChoice = scanner.nextLine();
					double calculateRate=0;
					for (Services services : product.getServicesList()) {
						if (serviceChoice.equalsIgnoreCase(services.getServiceCode())) {
							calculateRate= services.getRate();
						}
					}
					System.out.print("Enter the number of transactions : ");
					double noTransactions = scanner.nextDouble();
					System.out.println("Total rate:"+noTransactions*calculateRate);
					
				}
			}
		}
 
	}	


	public static void manageAccount(Customer customer, ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer Code:");
		String customerCode = scanner.nextLine();
		if(customerCode.equals(customer.getCustomerCode())) 
				{
			System.out.println("Welcome "+customer.getCustomerName()+"!!");
			System.out.print("Select account you want to manage : ");
			int index = 1 ;
			for(Account account : customer.getAccountList()) {
				System.out.println(index+". "+account.getProduct().getProductCode()+"-"+account.getProduct().getProductName());
				index++;
			}
			int accountChoice = scanner.nextInt();
			Account selectedAccount = customer.getAccountList().get(accountChoice-1);
			ArrayList<Services> selectedServiceList = selectedAccount.getProduct().getServicesList();
			for(Services service : selectedServiceList) {
				System.out.println((selectedServiceList.indexOf(service)+1) +"." +service.getServiceName());
			}
			System.out.println("Enter the service you want to avail:");
			String choiceString = scanner.next();
			//String choiceString = selectedServiceList.get(choice-1).getServiceCode();
			if(choiceString.equalsIgnoreCase("CashDeposit"))
			{
				System.out.println("Selected:Cash Deposit");
				System.out.println("Enter the amount to deposit:");
				double deposit = scanner.nextDouble();
				selectedAccount.setBalance((selectedAccount.getBalance())+(deposit));
				System.out.println("Deposit successful. New Account Balance:"+selectedAccount.getBalance());
				
			}
			else if(choiceString.equalsIgnoreCase("ATMWithdrawal"))
			{
				System.out.println("Selected:ATM Withdrawal");
				System.out.println("Enter the amount to withdraw:");
				double withdraw = scanner.nextDouble();
				double balance = selectedAccount.getBalance() - withdraw ;
				if (selectedAccount.getProduct() instanceof SavingsAccount) {
				    SavingsAccount savingsMaxAccount = (SavingsAccount) selectedAccount.getProduct();
 
				    // Accessing minimumBalance using the getter method
				    double minimumBalance = savingsMaxAccount.getBalance();
 
				if(balance<minimumBalance)
					{
					System.out.println("Since you have SavingsMax Account balance should not stay above 1000");
					System.out.println("Withdraw Failed");
					}
					else {
					selectedAccount.setBalance(balance);
					System.out.println("Withdraw successful. New Account Balance:"+selectedAccount.getBalance());
					}
				}
				else if(balance<0)
				{
					System.out.println("Withdraw Failed - Insufficient Balance");
				}
				else {
					selectedAccount.setBalance(balance);
					System.out.println("Withdraw successfull. New Account Balance:"+selectedAccount.getBalance());
				}
				}
				
				
				
			else if(choiceString.equalsIgnoreCase("OnlineBanking"))
			{
				System.out.println("Selected:Online Banking");
			}
			else if(choiceString.equalsIgnoreCase("MobileBanking"))
			{
				System.out.println("Selected:Mobile Banking");
			}
			else if(choiceString.equalsIgnoreCase("ChequeDeposit"))
			{
				System.out.println("Selected:Cheque Deposit");
				System.out.println("Selected:Cash Deposit");
				System.out.println("Enter the amount to deposit:");
				double deposit = scanner.nextDouble();
				if (selectedAccount.getProduct() instanceof LoanAccount) {
				    LoanAccount loanAccount = (LoanAccount) selectedAccount.getProduct();
 
				    // Accessing minimumBalance using the getter method
				    double depositCharge = loanAccount.getCheckDeposit();
					System.out.println("Since you have Loan Account"+depositCharge+"% will be charged.");
					selectedAccount.setBalance((selectedAccount.getBalance())+(deposit - (depositCharge/100)*deposit));
				}
				else {
					selectedAccount.setBalance((selectedAccount.getBalance())+(deposit));
				}
				System.out.println("Deposit successful. New Account Balance:"+selectedAccount.getBalance());
				
			}
			}
		else {	
				
					System.out.println("Customer does not exist");
				}
	}
}

