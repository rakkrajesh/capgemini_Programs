package programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int sum = 0, m=n;
		while (n!=0) {
			int rem=n%10;
			int fact =1;
			for (int i=1;i<=rem;i++)
				fact=fact*i;
			sum=sum+fact;
			n=n/10;
		}
		System.out.println(m==sum?m+" is strong number":m+" is not a strong number");
	}
	

}
