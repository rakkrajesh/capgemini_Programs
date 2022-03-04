package stringsExample;

import java.util.Scanner;

/**
 * Write a program to accept string from the keyboad and split the entered string in to words and count number of words in the string?
 *
 */
public class StringWordCount {

	private static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ..");
		String st1 =sc.nextLine();
//		for (int i=0; i<st1.length()-1;i++) {
//			if((st1.charAt(i)==' ') && (st1.charAt(i+1)!=' ')) {
//				count++;
//			}
		String[] sa = st1.split(" ");
		
		for (String sp : sa) 
		{ 
			System.out.println(sp);
			count++;
		}
		System.out.println(count);
		
	}

}
