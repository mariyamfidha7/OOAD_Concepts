package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Service;

public class ServiceService {

	public static Service createService() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter service number");
		String serviceNo = scanner.nextLine();
		System.out.println("Enter service name");
		String serviceName = scanner.nextLine();
		System.out.println("Enter service price");
		double servicePrice = scanner.nextDouble();
		Service service = new Service(serviceNo,serviceName,servicePrice); //constructors are used to initialize member variables
		return service;
	}

	public static void displayService(Service service) {
		// TODO Auto-generated method stub
		System.out.println("Service No"+"    "+"Service Name"+"     "+"Service Price");
		System.out.println(service.getServiceNo()+"      "+service.getServiceName()+"     "+service.getServicePrice());
		
	}
}
