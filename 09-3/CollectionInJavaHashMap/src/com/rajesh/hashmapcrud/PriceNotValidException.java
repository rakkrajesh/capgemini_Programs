package com.rajesh.hashmapcrud;

public class PriceNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public PriceNotValidException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
