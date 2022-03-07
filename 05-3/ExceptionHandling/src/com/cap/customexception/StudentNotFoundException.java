package com.cap.customexception;

public class StudentNotFoundException extends Exception {
	
	String exMessage;

	public StudentNotFoundException(String exMessage) {
		super(exMessage);
		this.exMessage = exMessage;
	}

}