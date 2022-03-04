package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
//	private static int i1;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Float[] score = new Float[4];
		
//		array input
		System.out.println("Enter the values of " );
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextFloat();
		}
			
//			values of array 
			for(int i1=0; i1<score.length; i1++) {
				System.out.println(score[i1]);
			}
			
//			sorted array
			Arrays.sort(score);
			System.out.println("sorted array is as follow");
			for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			}
			
			
		}
	}

