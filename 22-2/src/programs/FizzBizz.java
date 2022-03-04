package programs;

import java.util.Scanner;

public class FizzBizz 
{
	private static int k;

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int k = s.nextInt();
		if (k%3==0 && k %5==0)
		{
			System.out.println("FizzBizz");
		}
		if (k%3==0)
		{
			System.out.println("Fizz");
		}
		if (k%5==0)
		{
			System.out.println("Bizz");
		}
	if(k%3!=0 && k%5!=0)
	{
		System.out.println("not divisable of 5 or 3");
	}
	}
}
