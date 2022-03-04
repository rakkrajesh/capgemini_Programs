package com.oops.classexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Emplyoee 
{
	Scanner sc = new Scanner(System.in);
	int employeeId;
	String employeeMail;
	String employeeName;
	Date employDOJ;
	Date employDOB;
	long employNo;
	
	void EmployData() throws ParseException {
		System.out.println("Enter the following data");
		System.out.print("Enter the Employ Id: ");
		employeeId = sc.nextInt();
		System.out.print("Enter the Employ Name: ");
		sc.nextLine();
		employeeName = sc.nextLine();
		System.out.print("Enter the Employ No: ");
		employNo = sc.nextLong();
		System.out.print("Enter the Employ Mail: ");
		sc.nextLine();
		employeeMail = sc.nextLine();
		System.out.print("Enter the Employ DOB: ");
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		employDOB = sdf.parse(dob);
		System.out.print("Enter the Employ DOJ: ");
		String doj = sc.nextLine();
		employDOJ = sdf.parse(doj);
	}
	
	void EmployDataDisplay() 
	{
		System.out.println("Displaying Employ data");
		System.out.println("employeeId of employee is " + employeeId);
		System.out.println("employeeName employee is " + employeeName);
		System.out.println("employeeNo of employee is " + employNo);
		System.out.println("employeeMail of employee is " + employeeMail);
		System.out.println("employeeDOJ of employee is " + employDOJ);
		System.out.println("employeeDOB of employee is " + employDOB);
	}
}