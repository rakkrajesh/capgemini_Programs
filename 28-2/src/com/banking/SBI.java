package com.banking;

import java.util.Scanner;

public class SBI extends Bank {
	Scanner sc= new Scanner(System.in);
	
	
	 void readSbi() {
		System.out.println("SBI Bank----");
		System.out.println("Enter Sbi Pincipal Amount :");
		principalAmount = sc.nextFloat();
		System.out.println("Enter time : ");
		time = sc.nextFloat();
		System.out.println("Enter rate :");		
		rate = sc.nextFloat();
	}


}