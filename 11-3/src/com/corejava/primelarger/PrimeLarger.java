package com.corejava.primelarger;

import java.util.Scanner;

public class PrimeLarger {
//	private static int count=0;
//	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the first No..");
//			int a = sc.nextInt();
//			System.out.println("Enter the second No..");	
//			int b = sc.nextInt();
//			
//			if (a==b) {
//				System.out.println("0");
//			}
//			else if (a!=b) {
//			for (int i=2;i<((a>b)?b:a);i++) {
//				if (a%i==0 && b%i==0)
//					count++;
//			}
//				if(count==0 && a>b) 
//					System.out.println(a);
//				else
//					System.out.println(b);
//			}
//			if(a>b)
//					System.out.println(b);
//				else
//					System.out.println(a);
//			sc.close();
//	}
	Scanner sc = new Scanner(System.in);
	public void readValues() {
		System.out.println("Enter the first Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
	}
	
	public void findPrimeNumber() {
		System.out.println("Finding max value for a prime and non prime");
		readValues();
		int result =-1;
		
		if (a==b) {
			result = 0;
		}
		else if (isPrime(a) && isPrime(b)) {
			if(a>b)
				result =a;
		}
	}
	
	
	public static boolean isPrime() {
		return false;
		
	}
	
}
