//package array;
//
//public class SwappingIntArray {
//	public static void main(String[] args) {
//		int[] x = {10, 32, 34, 543, 53 };
//		
//		for(int i=0; i<x.length; i++) {
//			System.out.println(x[i]);
//		}
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		
//		for(int i=x.length-1; i>=0; i--) {
//			System.out.println(x[i]);
//		}
//	}
//}


                                                      package array;
                                                      import java.util.Scanner;
                                                      public class SwappingIntArray {
	
		

			 public static void main(String[] args) 
			 {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the size of the array:");
			     int size;
			     size=sc.nextInt();
			     int arr[ ]=new int[size];
			     int j=0,i,temp,k,temp2;
			  System.out.println("Enter the Element of the array:");
			      while(j<size)
			     {
			         arr[j]=sc.nextInt();
			         j++;
			     }
			      temp=size;
			         while(temp>=0)
			         {
			             for(k=0;k<temp-1;k++)
			             {
			                 temp2=arr[k];
			                 arr[k]=arr[k+1];
			                 arr[k+1]=temp2;
			             }
			             temp--;
			         }
			         System.out.println("After reversing array is :");
			         for(i=0;i<size;i++)
			        {
			          System.out.print(arr[i]+" ");
			         }
                                                               sc.close();
                                                               }
                                                               }
