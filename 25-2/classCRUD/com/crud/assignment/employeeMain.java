package com.crud.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class employeeMain {
		//variables
		int employeeId;
		String employeeName;
		Float employeeSalary;
		String employeeMobile;
		String employeeEmail;
		//String employeeDob;
		//String employeeJoining;
		
		Scanner sc = new Scanner(System.in);

		void readEmployeeDetails() throws ParseException {
			System.out.println("Enter the Employee Details---");
			
			System.out.println("Enter the Employee ID: ");
			employeeId=sc.nextInt();
			
			System.out.println("Enter the Employee Name: ");
			sc.nextLine();
			employeeName = sc.nextLine();
			
			System.out.println("Enter the Employee salary: ");
			employeeSalary = sc.nextFloat();
		
			
//			  System.out.println("Enter the Employee Date of Birth 'dd/MM/yyyy' : ");
//			  String dob = sc.nextLine();
//			  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
//			  employeeDob = sdf.format(dob);
			 
			
			
//			  System.out.println("Enter the Employee Joining Date 'dd/MM/yyyy' :");
//			  SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
//			  String doj=sc.nextLine();
//			  employeeJoining = sdf2.format(doj);
			 
			
			System.out.println("Enter the Employee Mobile number: ");
			sc.nextLine();
			employeeMobile = sc.nextLine();
			
			if(employeeMobile.matches("\\d{10}")) {
				System.out.println("Mobile Number is valid");
			}
			if(checkMobileNumber(employeeMobile)) {
				System.out.println("Mobile Number is valid");
			}else {
				System.out.println("Entered Mobile number is not valid ....");
				System.out.println("Do you want Enter Mobile number which is  valid (y/n)....");
				char ch = sc.next().charAt(0);
				if(ch== 'y') {
					System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
					sc.nextLine();
					employeeMobile =  sc.nextLine();
				}else {
					System.out.println("Thank you for providing your details.....");
				}
			}
			
			System.out.println("Enter the  Employee Email......");
			employeeEmail =  sc.nextLine();
			if(validate(employeeEmail)) {
				System.out.println("Thank you for providing correct email.....");
			}else {
				System.out.println("Enter email in specified format (ex:- sunil@gmail.com)");
			}
			
		}
		void displayEmployeeDetails() {
			System.out.println("Enter the Employee data...........");
			System.out.println("Employee id = " + employeeId );
			System.out.println("Employee name = " + employeeName);
			System.out.println("Employee salary = " + employeeSalary);
			System.out.println("Employee Mobile number = " + employeeMobile);
			System.out.println("Employee Email = " + employeeEmail);
//			System.out.println("Employee dob = " + employeeDob);
//			System.out.println("Employee doj = " + employeeJoining);
			
		}

		boolean checkMobileNumber(String mobNo) {
			Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
			Matcher match = ptrn.matcher(mobNo);
			return (match.find() && match.group().equals(mobNo));
		}
		public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

			public static boolean validate(String emailStr) {
			        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
			        return matcher.find();
			}

}
