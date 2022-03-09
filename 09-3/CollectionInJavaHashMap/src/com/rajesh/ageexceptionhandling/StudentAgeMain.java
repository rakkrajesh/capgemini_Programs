package com.rajesh.ageexceptionhandling;

public class StudentAgeMain {
	public static void main(String[] args) {
		StudentAge std1 = new StudentAge("Sachin", 2);
		StudentAge std2 = new StudentAge("RAkk", 25);
		System.out.println(std1.getStuName());
		System.out.println(std1.getStuAge());
		System.out.println(std2.getStuName());
		System.out.println(std2.getStuAge());
		
		
	}
}
