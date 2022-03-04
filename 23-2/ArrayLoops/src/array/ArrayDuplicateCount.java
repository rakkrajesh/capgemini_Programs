package array;

import java.util.Scanner;

public class ArrayDuplicateCount {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
		int count = 0;
	int[] o = {10, 20, 55, 40, 20, 10, 55, 40};
	char[] p = {'a', 'b', 'c', 'e'};
	
	for(int z=0;z<o.length;z++){
        for(int j=0;j<=z;j++){
            if(o[z]==o[j] & j!=z) {
            	count+=1;
            }
           
        }
	}
	 System.out.println(count);
//	 s.close();
}
}
