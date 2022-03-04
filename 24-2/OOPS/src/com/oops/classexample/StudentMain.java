package com.oops.classexample;

import java.text.ParseException;

public class StudentMain {

	public static void main(String[] args) throws ParseException {
		
		//following statement creates an object
		Student st = new Student();
		st.readStudentDetails();
		st.displayStudentDetails();
		
		/*
		 * Student st1 = new Student(); st1.readStudentDetails();
		 * st1.displayStudentDetails();
		 */
	}

}