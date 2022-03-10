package com.rajesh.java8functions.lamdafun;


public class LambdaExample {

	public static void main(String[] args) {
		
		Add ad = () -> System.out.println("addition of two numbers from lambda expressions");
		ad.add();
		
		Sub sb = (x,y) -> System.out.println("Substraction = " + (x -y));
		sb.substraction(15, 10);
		
		Sub sb1 = (x,y) -> {
			if(x > y) {
			System.out.println("Substraction = " + (x -y));
			}else {
				System.out.println("else block Substraction = " + (y - x));
			}
		};
		
		sb1.substraction(5, 10);
		
		Div div1 = (x,y) -> {
			if(x > y) {
			return x/y;
			}else {
				return y/x;
			}
			
		};
		
		int result = div1.div(10, 5);
		System.out.println("Result = " + result);
		
	}

}
