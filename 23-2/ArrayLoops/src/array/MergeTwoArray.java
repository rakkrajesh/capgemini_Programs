package array;
import java.util.Scanner;

//package array;
//
//import java.util.Scanner;
//
//public class ArrayMerge {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s1 = new Scanner(System.in);
//		
////		int[] a = new int[3];
////		int[] b = new int[3];
////		int[] ab = new int[a.length+b.length];
////		
////		for (int i=0; i<a.length; i++) {
////			a[i]=s1.nextInt();
////		}
////		
////		for (int i=0;i<b.length; i++) {
////			b[i] = s1.nextInt();
//		int[] a = {1,2,3,4};
//		int[] b = {5,6,7,8};
//		int[] ab = new int [a.length+b.length];
//		
//		
//		int i = 0;
//		while (a[i]<a.length) {
//			ab[i] = a[i];
//			i++;
//			System.out.println(ab[i]);
//		}
//		int i1 = 4;
//		while (b[i1]<b.length-1) {
//			ab[i1] = b[i1];
//			i1++;
//			System.out.println(ab[i1]);
//		}
//		
//		for (int i11=0; i11<ab.length; i11++) {
//			System.out.println(ab[i11]);
//		}
//	}
//}

public class MergeTwoArray {
	static void Merge_Array(int arr[],int arr2[],int size,int size2)
	{
	    int m_size=size+size2;
	    int merge_arr[ ]=new int[m_size];
	    int i=0,k=0,j=0;
	    while(k<m_size)
	    {
	    if(i<size)
	    {
	        merge_arr[k]=arr[i];
	        i++;
	        k++;
	    }
	    if(j<size2)
	    {
	        merge_arr[k]=arr2[j];
	        j++;
	        k++;
	    }
	}
	int p;
	System.out.print("After Merge two Array element are:");
	for(p=0;p<m_size;p++)
	       {
		System.out.print(merge_arr[p]+" ");
	       }
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of the array:");
	     int size,j=0;
	     size=sc.nextInt();
	     System.out.println("Enter the size of the 2nd array:");
	     int size2=sc.nextInt();

	     int arr[ ]=new int[size];
	     int arr2[ ]=new int[size2];
	  System.out.println("Enter the Element of the array:");
	      for(j=0;j<size;j++)
	     {
	         arr[j]=sc.nextInt();
	     }
	      
	      System.out.println("Enter the Element of the array:");
	      for(j=0;j<size2;j++)
	     {
	         arr2[j]=sc.nextInt();
	     }
	     
	      Merge_Array(arr,arr2,size,size2);
	     sc.close();
	 }
	}
