package programs;

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) 
	{
		int GCD =0;
		
		Scanner h =new Scanner (System.in);
		System.out.println("Enter the value of p");
		int p = h.nextInt();
		
		System.out.println("Enter the value of q");
		int q =h.nextInt();
	
		for(int i=1; i<p+1 && i<q+1; i++ )
		{
			if(p%i==0 && q%i==0)
			{
				GCD=i;
			}
		}
		System.out.println("Greatest Common Divisor of "+p + " & " + q + " is "+GCD);
	}
}
