package com.banking;

public class BankMain {

	public static void main(String[] args) {
		SBI sbi=new SBI ();
		sbi.readSbi();
		sbi.getRateOfInterest();
		
		ICICI icici =new ICICI();
		icici.readIcici();
		icici.getRateOfInterest();
		
		Axis axis =new Axis();
		axis.readAxis();
		axis.getRateOfInterest();
		
		

	}

}