package com.rajesh.collections.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashMapStudent {
	float sum = 0;
	int count = 0;
	float max = 0;
	Scanner sc = new Scanner(System.in);
	{
//	System.out.println("Enter the choice");
		char ch = 'y';
		while (ch != 'n') {
			HashMap<String, Float> hm = new HashMap<String, Float>();
			System.out.println("Enter Student Details..");
			hm.put(sc.next(), sc.nextFloat());
			System.out.println("Enter next Student Details..");
			hm.put(sc.next(), sc.nextFloat());
			System.out.println(hm);

			System.out.println("===============");

			// Retrieving key of hashmap
			Set<String> stuName = hm.keySet();
			System.out.println("Student Names are..");
			for (String i : stuName) {
				System.out.println(i + "\t");
			}

			System.out.println("=================");

			// Retrieving value of hashmap
			Collection<Float> stuMarks = hm.values();
			System.out.println("Student Marks are..");
			for (Float f : stuMarks) {
				System.out.println(f);
				sum = sum + f;
				count++;
				if (f > max) {
					max = f;
				}
			}
			System.out.println("================");

			System.out.println("maximum Marks is " + max);

			float average = sum / count;
			System.out.println("Average of student Marks is : " + average);

			System.out.println("=================");

			TreeSet<String> ts = new TreeSet<String>();
			ts.addAll(stuName);
			System.out.println(ts);
			System.out.println("=================");

			ArrayList<String> al = new ArrayList<String>();
			al.addAll(stuName);
			al.sort(null);
			System.out.println("Sorted STUDENT NAME is " + al);
			System.out.println("Enter the Next Choice");
			ch = sc.next().charAt(0);

		}
	}
}