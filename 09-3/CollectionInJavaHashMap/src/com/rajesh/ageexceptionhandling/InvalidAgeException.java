package com.rajesh.ageexceptionhandling;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{
	static String message;

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	
	}
	
	
	
}
