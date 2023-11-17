package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.CurrentAccount;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsAccount;
import com.ilp.entity.Services;

public class ProductConfiguration {
	
	
public static ArrayList<Services> addServices() {
		
		char moreServices;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Services> servicesList = new  ArrayList<Services>();
		do {
			System.out.print("Enter service code : ");
			String serviceCode= scanner.next();
			System.out.print("Enter name of service : ");
			String serviceName= scanner.next();
			System.out.print("Enter rate of service : ");
			double serviceRate= scanner.nextDouble();
			Services services =new Services(serviceCode,serviceName,serviceRate);
			servicesList.add(services);
			System.out.print("Add more services (y/n): ");
			moreServices = scanner.next().charAt(0);
		}while(moreServices == 'y');
		
		System.out.println();
		System.out.println("******************Service-Info**********************\r\n"
				+ "\r\n"
				+ "Service Code"+"\t"+"Service Name"+"\t"+"Rate\r\n"
				+ "\r\n"
				+ "***************************************************************");
		for(Services services: servicesList)
		{
			System.out.println(services.getServiceCode()+"\t\t"+services.getServiceName()+"\t\t"+services.getRate());
		}
		
		return servicesList ;
		
	}

 	static ArrayList<Product> productList = new  ArrayList<Product>();
 	static ArrayList<Services> selectedServicesList = new  ArrayList<Services>();
	 
	public static ArrayList<Product> addProduct(ArrayList<Services> serviceList) {
					
					String productName, productCode;
					char productContinue,continueAddService;
					do {
						Scanner scanner = new Scanner(System.in);
						System.out.print("Enter product code : ");
						productCode = scanner.nextLine();
						
						System.out.print("Enter product name : ");
						productName = scanner.nextLine();
						
						do {
							
							System.out.println("Service Code"+"\t"+"Service Name"+"\t"+"Service Rate");
							for(Services service:serviceList)
							{
								System.out.println(service.getServiceCode()+"\t\t"+service.getServiceName()+"\t\t"+service.getRate());
							}
							System.out.print("Select the service to be added : ");
							String selectService=scanner.next();
							for(Services service:serviceList)
							{
								if(selectService.equals(service.getServiceCode()))
								{
									selectedServicesList.add(service);
								}
							}
						System.out.print("Do you want to add another service :(y/n)? ");
						continueAddService=scanner.next().charAt(0);
						}while(continueAddService=='y');
						
					System.out.print("Do you want to add another product(y/n)? ");
					productContinue=scanner.next().charAt(0);
					
					if (productName.equalsIgnoreCase("Savings Account")) {
					    Product product = new SavingsAccount(productCode, productName, serviceList, 1000);
					    productList.add(product);

					    System.out.println("Entered Product information:");
					    System.out.println();
					    System.out.println("************Product-Info**********************\r\n"
					            + "\r\n"
					            + "Product Code" + "\t" + "Product Name\r\n"
					            + "\r\n"
					            + "*************************************************");

					    for (Product eachProduct : productList) {
					        System.out.println(eachProduct.getProductCode() + "\t\t" + eachProduct.getProductName());

					        if (eachProduct instanceof SavingsAccount) {
					            SavingsAccount savingAccount = (SavingsAccount) eachProduct;
					            System.out.println("Balance: " + savingAccount.getBalance());
					            // Print other SavingsAccount specific attributes if needed
					        }
					    }
					}
					else if(productName.equalsIgnoreCase("Loan Account")) {
						Product product= new LoanAccount(productCode, productName,serviceList,0.3);
	
						productList.add(product);
						
						System.out.println("Entered Product information:");
						System.out.println();
						System.out.println("************Product-Info**********************\r\n"
						        + "\r\n"
						        + "Product Code"+"\t"+"Product Name\r\n"
						        + "\r\n"
						        + "*************************************************");

						for(Product eachProduct: productList) {
						    System.out.println(eachProduct.getProductCode()+"\t\t"+eachProduct.getProductName());
						    
						    if (eachProduct instanceof LoanAccount) {
						    	LoanAccount savingAccount = (LoanAccount) eachProduct;
					            System.out.println("Balance: " + savingAccount.getCheckDeposit());
					            // Print other SavingsAccount specific attributes if needed
					        }
						}
					}
					else if(productName.equalsIgnoreCase("CurrentAccount")) {
						Product product = new CurrentAccount(productCode, productName,serviceList);

						productList.add(product);
						
						System.out.println("Entered Product information:");
						System.out.println();
						System.out.println("************Product-Info**********************\r\n"
						        + "\r\n"
						        + "Product Code"+"\t"+"Product Name\r\n"
						        + "\r\n"
						        + "*************************************************");

						for (Product eachProduct : productList) {
					        System.out.println(eachProduct.getProductCode() + "\t\t" + eachProduct.getProductName());
					    }
					}
					
					}while(productContinue=='y');
					
					return productList;
	          }
	
	
	
}
				
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		Product product = null;
//		Product product1 = new Product("PRO100", "Savings Max Account", null);
//		Product product2 = new Product("PRO200", "Current Account", null);
//		Product product3 = new Product("PRO300", "Rural Account", null);
// 
//		System.out.println("1. " + product1.getProductName() + "\n2. " + product2.getProductName() + "\n3. "
//				+ product3.getProductName());
//		int productChoice = scanner.nextInt();
// 
//		ArrayList<Services> serviceList = ServicesService.createServices();
//		switch (mainChoice) {
//		case 1:
//			product = product1;
//			product1.setServicesList(serviceList);
//			break;
//		case 2:
//			product = product2;
//			product1.setServicesList(serviceList);
//			break;
//		case 3:
//			product = product3;
//			product1.setServicesList(serviceList);
//			break;
//		}
// 
//		return product;
 
