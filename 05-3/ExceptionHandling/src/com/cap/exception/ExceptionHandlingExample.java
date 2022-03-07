package com.cap.exception;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ExceptionHandlingExample 
{	
	public String s;
	public static void main(String[] args) throws Exception {
	try {
		FileWriter fw = new FileWriter("C:\\Drive D\\CAPGEMINI\\Training\\Core Java\\05-3\\data.txt");
//		fw.write("Asbestos is a group of naturally occurring fibrous minerals with current or historical commercial usefulness due to their extraordinary tensile strength, poor heat conduction, and relative resistance to chemical attack. For these reasons, asbestos is used for insulation in buildings and as an ingredient in a number of products, such as roofing shingles, water supply lines, and fire blankets, as well as clutches and brake linings, gaskets, and pads for automobiles."); 
//		fw.close();
//		writeIntoFile();
//		String s = readIntoFile().toLowerCase();
		System.out.println("hello");
		int count =0;
		for (int i =0; i<s.length() ;i++) 
		{
			if (s.charAt(i)=='a' || s.charAt(i) =='e'){
				count++;
		}else
		{
			System.out.println(s.charAt(i));
		}
			System.out.println("vowels count is " +count);
	catch (Exception e) {
		System.out.println("hey");
	}
//		public void inputFromUser() {
//		FileReader f = new FileReader("data.txt"); 
//	}
	System.out.println("hello");
	
}	
}
