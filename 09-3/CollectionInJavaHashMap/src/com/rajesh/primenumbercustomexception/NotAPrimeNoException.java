package com.rajesh.primenumbercustomexception;

public class NotAPrimeNoException extends Exception {
	private String message;

	public NotAPrimeNoException(String message) {
		super();
		this.setMessage(message);
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
