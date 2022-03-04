package com.banking;

import java.util.Scanner;

public class Axis extends Bank{
	Scanner sc= new Scanner(System.in);
	
	
	 void readAxis() {
		System.out.println("Axis Bank----");
		System.out.println("Enter Axis Pincipal Amount :");
		principalAmount = sc.nextFloat();
		System.out.println("Enter period : ");
		time = sc.nextFloat();
		System.out.println("Enter simpleInterest :");	
		rate = sc.nextFloat();

}
}