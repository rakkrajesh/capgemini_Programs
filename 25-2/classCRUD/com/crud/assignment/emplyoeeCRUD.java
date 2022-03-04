package com.crud.assignment;

import java.text.ParseException;
import java.util.Scanner;

public class emplyoeeCRUD 
{
		// Array of Student Objects
		EmployeeDetails[] listOfEmployee = new EmployeeDetails[30];
		EmployeeDetails employee;
		int noOfEmployee;
		Scanner sc = new Scanner(System.in);
		char ch = 'y';

		public void menu() throws ParseException {

			while (ch == 'y') {

				System.out.println("Enter the choice .....");
				System.out.println("add : to add employee in the array");
				System.out.println("update:to update employee in the array");
				System.out.println("delete:to delete employee in the array");
				System.out.println("display: to display all employee");
				System.out.println("search: to search for a employee");
				sc.nextLine();
				String choice = sc.nextLine();
				switch (choice) {
				case "add":
					addEmployee();
					break;
				case "update":
					updateEmployee();
					break;
				case "delete":
					deleteEmployee();
					break;
				case "display":
					displayEmployee();
					break;
				case "search":
					searchEmployee();
					break;
				default:
					System.out.println("Not a proper choice");
					break;
				}

				System.out.println("do you want to continue....");
				System.out.println("Enter 'y' to continue ......");
				ch = sc.next().charAt(0);

			} // while close

		}

		int count = 0;
		int j=0;
		void searchEmployee() {
			System.out.println("Enter the  employee details to search");
			System.out.println("Enter the  employee id to search");
			int eId = sc.nextInt();
			for (int i = 0; i < noOfEmployee; i++) {
				if(listOfEmployee[i].employeeId == eId) {
					count++;
					j = i;
				}
			}

			if(count > 1) {
				System.out.println("Student Found..........");
				listOfEmployee[j].displayEmployeeDetails();
				
			}else {
				System.out.println("Student Not Found..........");
			}
		}

		void displayEmployee() {
			System.out.println("Enter the employee details to display");
			// display the student data

			for (int i = 0; i < noOfEmployee; i++) {
				if(listOfEmployee[i] == null) {
					continue;
				}
				listOfEmployee[i].displayEmployeeDetails();
			}
		}

		void deleteEmployee() {
			System.out.println("Enter the student details to delete");
			System.out.println("Enter the student id to delete");
			int eId = sc.nextInt();
			for (int i = 0; i < noOfEmployee; i++) {
				if(listOfEmployee[i].employeeId == eId) {
					listOfEmployee[i] = null;
					break;
				}else {
					System.out.println("Employee Not Found..........");
				}
			}
		}

		void updateEmployee() {
			System.out.println("Enter the employee details to update");
			int eId = sc.nextInt();
			for (int i = 0; i < noOfEmployee; i++) {
				if(listOfEmployee[i].employeeId == eId) {
					System.out.println("Enter the new details of employee to update");
					System.out.println("Enter the new email of employee.....");
					sc.nextLine();
					listOfEmployee[i].employeeEmail = sc.nextLine();
					break;
				}else {
					System.out.println("Employee Not Found..........");
				}
			}
		}

		void addEmployee() throws ParseException {
			System.out.println("Enter the employee details");
			// creating and adding employee objects in the above array
			System.out.println("Enter the number of employee");
			noOfEmployee = sc.nextInt();
			for (int i = 0; i < noOfEmployee; i++) {
				employee = new EmployeeDetails();
				employee.readEmployeeDetails();
				listOfEmployee[i] = employee;

			}
		}

	}
}
