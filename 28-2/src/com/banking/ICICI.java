package com.banking;

import java.util.Scanner;

public class ICICI extends Bank{
	Scanner sc= new Scanner(System.in);
	
	
	 void readIcici() {
		System.out.println("ICICI Bank----");
		System.out.println("Enter ICICI Pincipal Amount :");
		principalAmount = sc.nextFloat();
		System.out.println("Enter time : ");
		time = sc.nextFloat();
		System.out.println("Enter rate :");		
		rate = sc.nextFloat();

}
}