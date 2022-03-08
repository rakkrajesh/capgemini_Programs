package com.rajesh.collections.hashmapemployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMapEmployee 
{
	Scanner sc = new Scanner(System.in);
	double totsal = 0.0;
	HashMap<Integer, Employee> empHM = null ; // new HashMap<Integer, Employee>();
	
	
	public HashMapEmployee() {
		empHM = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(001, "Rakk", 1000.00, 25, "Financing", "ChiefManager" );
		Employee e2 = new Employee(002, "Raj", 1500.00, 28, "Maintenance", "chairman" );
		Employee e3 = new Employee(003, "Ram", 2000.00, 35, "Main", "CEO" );
		
		
		empHM.put(1,e1);
		empHM.put(2, e3);
		empHM.put(3, e2);
	}
	
	Collection<Employee> empDetails = null;
	
	public void averageAgeOfAllEmployee() {
//		System.out.println("===============================================");
		empDetails = empHM.values();
		System.out.println(empDetails);
		int sum = 0;
		
		for (Employee emp : empDetails) {
			sum = sum + emp.getEmpAge();
			totsal = totsal +emp.getEmpSal();
		}
		int averageAge = sum/empDetails.size();
		System.out.println("Average age of All the Employee is  " +averageAge);
		System.out.println("================================================");
	}
	
	public void averageSalOfAllEmployee() {
		double averageSal = totsal/empDetails.size();
		System.out.println("Average Salary of all Employee is "+averageSal);
		System.out.println("================================================");
	}
	
	public void highestAge() {
		TreeSet<Integer> highAge = new TreeSet<Integer>();
		for (Employee emp : empDetails) {
			highAge.add(emp.getEmpAge());
		}
		System.out.println("Highest Age among all the Employee is "+highAge.last());
		System.out.println("===============================================");
	}
	
	public void highestSal() {
		TreeSet<Double> highSal = new TreeSet<Double>();
		for (Employee emp : empDetails) {
			highSal.add(emp.getEmpSal());
		}
		System.out.println("Highest Salary of all the Employee is "+highSal.last());
		System.out.println("===============================================");
	}
	
	public void sortEmployeeName() {
		System.out.println("sorting the list according to name : ");
		TreeSet<String> empName = new TreeSet<String>();
		for (Employee emp : empDetails) {
			empName.add(emp.getEmpName());
		}
		for (String emp : empName) {
			System.err.println(emp);
		}
		System.out.println("================================================");
	}
	
	public void sortEmployeeDepartment() {
		System.out.println("sorting the list accoridng to department Name :");
		System.out.println("");
		TreeSet<String> empDept = new TreeSet <String>();
		for (Employee emp : empDetails) {
			empDept.add(emp.getEmpDept());
		}
		for (String emp : empDept) {
			System.out.println(emp);
		}
		System.out.println("===============================================");
	}
	
	public void searchInDesig() {
		System.out.println("Enter the Designation to be found..");
		String Dept = sc.nextLine().toUpperCase();
		ArrayList<String> desigName = new ArrayList<String>();
		for (Employee emp : empDetails) {
			desigName.add(emp.getEmpDesig());
		}
		System.out.println(desigName);
			if (desigName.contains(Dept)) 
			{
				System.out.println(Dept + " found in the DataBase");
			}
				else {
					System.out.println("no person with that designation found in the DataBase");
					}
		System.out.println("================================================");
		System.out.println("This is the end of the program");
	}
	
	
}
