package stringsExample;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String message;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the message..");
		message =sc.nextLine();
		System.out.println(message);
		
		char index = sc.next().charAt(0);
		int charIndex = message.indexOf(index);
		System.out.println("index value of "+ index + " is "+ charIndex);			 
		
		
	}
}
