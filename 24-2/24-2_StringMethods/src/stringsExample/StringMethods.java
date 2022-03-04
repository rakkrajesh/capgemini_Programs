package stringsExample;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello! planet earth";
		String s1 = new String("oops this is mars");
		String[] s2 = s.split(" ");
		
		System.out.println("spliited s2 array is ");
		for (String x : s2) {
			System.out.println(x);
		}
			String ss;
			Scanner sc = new Scanner(System.in);
			ss = sc.nextLine();
			System.out.println(ss);
		
	}

}