package com.banking;

public class Bank {
	float principalAmount;
	float time;
	float rate;
	float rateOfInterest;
	
	
	public void getRateOfInterest() {
		rateOfInterest= (principalAmount * time * rate) / 100;
		System.out.println("Rate of Interest is : "+rateOfInterest);
	}

}	
