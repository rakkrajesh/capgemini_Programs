package com.cap.exception;
/*Write a Java Program to create a file data.txt and store the following text

What is Lorem Ipsum?
Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.

count number of vowels after reading the data from the above file
Handle the exception if there is an special symbol in the text*/
import java.io.*;

public class ExcepHandExam1{
public static String str="";
{
writeIntoFile();
String str=readIntoFile();
str=str.toLowerCase();
System.out.println(str);

int vcount=0;

for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='u'||
str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='e')
{
vcount++;
}

}

System.out.println("vowel count is : " +vcount);





}




public static String readIntoFile()
{
try
{
BufferedReader br=new BufferedReader(new FileReader("data.txt"));

int i;
while((i = br.read()) != -1)
{
str+=(char)i;
}
br.close();
return str;
}
catch(Exception e)
{
System.out.println("file not found");
}
return str;

}



public static void writeIntoFile()
{
try
{
BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
bw.write("What is Lorem Ipsum?\r\n"
+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
+ " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"
+ " when an unknown printer took a galley of type and scrambled it to make a type "
+ "specimen book.\r\n"
+ " ");
bw.close();
}
catch(Exception e)
{
System.out.println("file not found");
}

}
}