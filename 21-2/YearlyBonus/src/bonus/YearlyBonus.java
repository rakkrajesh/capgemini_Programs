package bonus;

import java.util.Scanner;

public class YearlyBonus 
{
	static String empName;
	static int EmpSer;
	static String dept="";
	static String rating;
	static int sal;
	static double YearlyBonus;

	public static void main(String[] args)
	{
		System.out.println(" PROGRAM STARTED ");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name");
		empName = s1.next();
		System.out.println("Enter sevice years");
		EmpSer = s1.nextInt();
		System.out.println("Enter dept");
		dept = s1.next();
		System.out.println("Enter rating");
		rating = s1.next();
		System.out.println("Enter sal");
		sal = s1.nextInt();
		
		if(EmpSer <3) 
		{
			System.out.println("have not completed 2 years in company");
		}
		else if(rating == "BelowAverage") 
		{
			System.out.println("YearlyBonus not available");
		}
		else {
			switch (dept) 
			{
				case "HR": YearlyBonus = sal*0.02;
				System.out.println("YearlyBonus of "+ empName +" is "+ YearlyBonus );
				break;
				
				case "Accounting": YearlyBonus = sal*0.03;
				System.out.println("YearlyBonus of "+ empName +" is "+ YearlyBonus );
				break;
				
				case "IT": YearlyBonus = sal*0.05;
				System.out.println("YearlyBonus of "+ empName +" is "+ YearlyBonus );
				break;
				
				case "Sales": YearlyBonus = sal*0.08;
				System.out.println("YearlyBonus of "+ empName +" is "+ YearlyBonus );
				break;

				default: System.out.println("YearlyBonus not available"); 
					break;
				}
			}
		System.out.println("PROGRAM ENDED");
	}
}