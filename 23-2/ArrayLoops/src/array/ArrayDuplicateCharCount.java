package array;

import java.util.Scanner;

public class ArrayDuplicateCharCount {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
		int count = 0;
		char[] p = {'a', 'b', 'c', 'e', 'b', 'e'};
	
	for(int z=0;z<p.length;z++){
        for(int j=0;j<=z;j++){
            if(p[z]==p[j] & j!=z) {
            	count+=1;
            }
           
        }
	}
	 System.out.println(count);
//	 s.close();
}
}
