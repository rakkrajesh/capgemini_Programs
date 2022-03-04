package com.oops.classexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class xty {
	int emplyoeeid;
	String emplyoeename;
	String emplyoeemail1;
	long emplyoeemobnumber;
	Date emplyoeeDob;
	Date emplyoeeDoj;
	
	Scanner sc1=new Scanner(System.in);;
	
	void reademplyoeeDetails() throws ParseException {
		System.out.println("Enter the emplyoee id: ");
		emplyoeeid=sc1.nextInt();
		System.out.println("Enter the emplyoe name:");
		sc1.nextLine();
		emplyoeename=sc1.nextLine();
		System.out.println("Enter the emplyoee mail:");
			sc1.nextLine();
	    emplyoeemail1=sc1.nextLine();
	    System.out.println("Enter the emplyoee Dob: ");
	   String Dob= sc1.nextLine();
	   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	   emplyoeeDob = sdf.parse(Dob);
		System.out.println("Enter the emplyoee mob no: ");
		 emplyoeemobnumber=sc1.nextLong();
		 System.out.println("Enter the emplyoee Doj: ");
		 String doj =sc1.nextLine();
		 sc1.next();
		 SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		 emplyoeeDoj = sdf1.parse(doj);
		 System.out.println(emplyoeeDoj);
	}
		 
		
		
			
	   void displayemplyoeeDetails() 
	   {
		System.out.println("emplyoee id = "+ emplyoeeid);
		System.out.println("emplyoee name = "+ emplyoeename);
		System.out.println("emplyoee mail = "+ emplyoeemail1);
		System.out.println("emplyoee mob no = "+ emplyoeemobnumber);
		System.out.println("em" + emplyoeeDoj);
		
	   }
		
	   

		
	}