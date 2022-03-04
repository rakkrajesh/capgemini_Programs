package stringassignment;

import java.util.Arrays;

public class StringAnagram {
//	public static void main(String[] args) {
//		String[] s1 = new String[6];
//		String[] s2 = new String[6];
//		
//		char[] c1 =s1;
//		char[] c2 =new char[s1];
//		
//		for (int i=0; i<6; i++)
//		if ((c1[i+1])<c1[i]){
//			c1[i]=c1[i+1];
//		}
//		System.out.println(c1);
//				
//	}
//}


static void Anagram(String str1, String str2) {  
String s1 = str1.replaceAll("\\s", "");  
String s2 = str2.replaceAll("\\s", "");  
boolean status = true;  
if (s1.length() != s2.length()) {  
status = false;  
} else {  
char[] ArrayS1 = s1.toLowerCase().toCharArray();  
char[] ArrayS2 = s2.toLowerCase().toCharArray();  
Arrays.sort(ArrayS1);  
Arrays.sort(ArrayS2);  
status = Arrays.equals(ArrayS1, ArrayS2);  
}  
if (status) {  
System.out.println(s1 + " and " + s2 + " are anagrams");  
} else {  
System.out.println(s1 + " and " + s2 + " are not anagrams");  
}  
}  

public static void main(String[] args) {  
Anagram("Keep", "Peek");  
Anagram("Mother In Law", "Hitler Woman");  
}  
}