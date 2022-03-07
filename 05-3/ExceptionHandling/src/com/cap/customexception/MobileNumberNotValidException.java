package com.cap.customexception;

public class MobileNumberNotValidException extends Exception {
	String mobExMsg;

	public MobileNumberNotValidException(String mobExMsg) {
		super(mobExMsg);
		this.mobExMsg = mobExMsg;
	}
	
	
}
