package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) {
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		
		arrl.add(10);
		arrl.add(20);
		arrl.add(44);
		arrl.add(05);
		
		System.out.println(arrl);
		arrl.sort(null);
		System.out.println(arrl);
		for (int i :arrl) {
			System.out.println(i);
		}
		System.out.println("======================");
		System.out.println(arrl.size());
		
		System.out.println(arrl.get(2));	
	}

	@Override
	public String toString() {
		return "ArrayListExample [toString()=" + super.toString() + "]";
	}
}
