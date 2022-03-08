package com.rajesh.collections.hashmapemployee;

public class EmployeeMainClass {
	public static void main(String[] args) {
		HashMapEmployee empDetails = new HashMapEmployee();
		empDetails.averageAgeOfAllEmployee();
		empDetails.averageSalOfAllEmployee();
		empDetails.highestAge();
		empDetails.highestSal();
		empDetails.sortEmployeeDepartment();
		empDetails.sortEmployeeName();
		empDetails.searchInDesig();
	}
}
