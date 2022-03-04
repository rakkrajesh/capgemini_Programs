package stringassignment;

public class StringReplace  {
public static void main(String[] args) 
{
String MyString = "i love java but java doesn't love me"; 
System.out.println("The string before removing character: " + MyString); 
MyString = MyString.replace("j", "l"); 
System.out.println("The string after removing character: " + MyString); 
} 
} 