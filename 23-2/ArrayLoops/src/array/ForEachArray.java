package array;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachArray {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int[] ar1 = new int[3];
		
		for (int i=0; i<ar1.length; i++) {
			ar1[i]=s1.nextInt();
		}
			for (int wordsly : ar1) {
				System.out.println(wordsly);
			}
	}
}
