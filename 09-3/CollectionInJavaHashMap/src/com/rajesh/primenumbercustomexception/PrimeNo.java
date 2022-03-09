package com.rajesh.primenumbercustomexception;

import java.util.ArrayList;

public class PrimeNo 
{
	private static int count=0;

	public static void main(String[] args) {
		
	ArrayList<Integer> pal = new ArrayList<Integer>();
	pal.add(15);
	pal.add(2);
	pal.add(3);
	pal.add(4);
	pal.add(5);
	
	try {
		for (int pal2 : pal) {
		for (int i=1; i<=pal2; i++) {
		if (pal2%i==0)
			count++;
			if (count>1)
				throw new NotAPrimeNoException(pal2 + " is not a prime number");
		}
		}
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
				e.getStackTrace();
		}
	}
}