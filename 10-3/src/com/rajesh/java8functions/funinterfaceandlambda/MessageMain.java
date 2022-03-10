package com.rajesh.java8functions.funinterfaceandlambda;

public class MessageMain {
	public static void main(String[] args) {
		
		Message msg = (String Quote) -> System.out.println("Quote of the day is : "+Quote);
		msg.QuoteOfTheDay("You Get What You Focus On, So Focus On What you Want..");
	}
}
