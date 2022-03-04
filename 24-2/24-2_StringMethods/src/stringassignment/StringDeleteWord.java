package stringassignment;
import java.util.Scanner;

public class StringDeleteWord{
public static void main(String[] args)
{
String str, word;
int strLen, wordLen, i, temp, j, k=0;
Scanner scan = new Scanner(System.in);

System.out.print("Enter the String: ");
str = scan.nextLine();
System.out.print("Enter the Word to Remove: ");
word = scan.nextLine();

strLen = str.length();
wordLen = word.length();

char[] strChars = new char[strLen];
char[] wordChars = new char[wordLen];

strChars = str.toCharArray();
wordChars = word.toCharArray();
for(i=0; i<strLen; i++)
{
temp = i;
for(j=0; j<wordLen; j++)
{
if(strChars[i]==wordChars[j])
i++;
}
k = i-temp;
if(k==wordLen)
{
for(j=temp; j<(strLen-wordLen); j++)
strChars[j] = strChars[j+wordLen];
strLen = strLen-wordLen;
}
}

System.out.print("\nThe new string is: ");
for(i=0; i<strLen; i++)
System.out.print(strChars[i]);
}
}
