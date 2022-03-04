package array;

import java.util.Scanner;

public class ArrayRemove {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = {10, 30, 55, 6};
		System.out.println("enter the index value to be removed ");
		int y = sc.nextInt();
		for (int i=0; i<x.length; i++) {
			if(i==y) {
				continue;
			}
			System.out.println(x[i]);
			sc.close();
		}
		
		
	}
}
