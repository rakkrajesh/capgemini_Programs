package Solution;

import java.util.Scanner;

import mathematics.Addition;
import mathematics.Subtraction;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b =sc.nextInt();
		Addition add = new Addition(a, b);
		int c = 0;
		int d = 0;
		Subtraction sub = new Subtraction(c,d);
//		System.out.println("then the total would be ");
		add.MathAdd();
		sub.MathSub();
	}
}
