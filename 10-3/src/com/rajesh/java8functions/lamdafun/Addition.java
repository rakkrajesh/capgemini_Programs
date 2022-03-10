package com.rajesh.java8functions.lamdafun;

import com.rajesh.java8functions.*;

public class Addition implements Add{

	@Override
	public void add() {
		System.out.println("addition of two numbers using addition class which is implementing Add interface");
		
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add();
	}

}