package com.oops.classarray;

import java.util.Scanner;

public class StudentDetail {
	
	private static int StdNo;
	private static int sum =0;
	private static int average;

	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter sub1 marks for students");
	int[] sub2 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
	System.out.println("Enter sub2 marks for students");
	int[] sub1 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
	System.out.println("Enter sub3 marks for students");
	int[] sub3 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
	
	for (int i=0; i<sub1.length; i++) {
		int average = (sub1[i]+sub2[i]+sub3[i])/3;
		System.out.println("Average of all students per subject is " +average);
		}
	
	System.out.println("Enter number of students");
	StdNo = sc.nextInt();
	int[] hgt = new int[StdNo];
	
	System.out.println("Enter the height of each student");
	for (int i=0; i<StdNo; i++) {
		hgt[i]=sc.nextInt();
	}
	
	for (int x:hgt) {
		System.out.println(x);
	}
	
	for (int j=0;j<hgt.length; j++) {
		sum  = sum+hgt[j];
	}
	average = sum/hgt.length;
	System.out.println("average of heights is " +average);
	
}
}
