package com.product;

import java.util.Scanner;

public class Seller {
	int SellerID;
	String SellerName;
	
	Scanner sc = new Scanner(System.in);
	
	void readSellerMethod() {
		SellerID = sc.nextInt();
		sc.nextLine();
		SellerName = sc.nextLine();
	}
	
	void displaySellerDetails() {
		System.out.println(SellerID);
		System.out.println(SellerName);
		
	}
}
