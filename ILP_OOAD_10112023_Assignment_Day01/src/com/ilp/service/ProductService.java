package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Product;

public class ProductService {

	public static Product createProduct() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product number");
		String productNo = scanner.nextLine();
		System.out.println("Enter product name");
		String productName = scanner.nextLine();
		System.out.println("Enter product price");
		double productPrice = scanner.nextDouble();
		Product product = new Product(productNo,productName,productPrice); //constructors are used to initialize member variables
		return product;
	}

	public static void displayProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Product No"+"    "+"Product Name"+"     "+"Product Price");
		System.out.println(product.getProductNo()+"      "+product.getProductName()+"     "+product.getProductPrice());
		
	}
}
