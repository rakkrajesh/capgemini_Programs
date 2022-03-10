package com.rajesh.java8functions.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDoubleStream {
	private static int doubNum;

	public static void main(String[] args) {
		
		ArrayList<Integer> intNum = new ArrayList<Integer>();
		intNum.add(10);
		intNum.add(20);
		intNum.add(25);
		
		for (Integer int1 : intNum) {
			System.out.println(int1);
//			int1 = int1*2;
		}
		
		System.out.println("doubling the Number..");
		List<Integer> doubNum = intNum.stream().sorted().collect(Collectors.toList());
		for (Integer i : doubNum) {
			System.out.println(i*2);
		}
	}
}
