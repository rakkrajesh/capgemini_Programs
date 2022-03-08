package com.rajesh.collections.hashmapemployee;

import java.util.concurrent.Delayed;

public class EmployeeMainClass {
	public static void main(String[] args) {
		HashMapEmployee empDetails = new HashMapEmployee();
		empDetails.averageAgeOfAllEmployee();
		empDetails.averageSalOfAllEmployee();
		empDetails.highestAge();
		empDetails.highestSal();
		empDetails.sortEmployeeDepartment();
		empDetails.sortEmployeeName();
		System.out.println("");
		empDetails.searchInDesig();
	}
}
