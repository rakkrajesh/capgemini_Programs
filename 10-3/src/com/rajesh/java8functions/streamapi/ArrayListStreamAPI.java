package com.rajesh.java8functions.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListStreamAPI {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rama");
		names.add("Raja");
		names.add("Raja");
		names.add("Rani");
		names.add("Dharma");
		names.add("Krishna");
		names.add("Mehrun");
		
		for (String string : names) {
			System.out.println(string);
		}
		
		System.out.println("Filetered names .........");
		//foreach using stream
		List<String> filteredNames = names.stream().sorted().filter(name -> name.startsWith("R")).collect(Collectors.toList());
		for (String string : filteredNames) {
			System.out.println(string);
		}
		
		
		System.out.println("Filetered names in Set Collection.........");
		//foreach using stream
		Set<String> filteredNamesInSet = names.stream().sorted().filter(name -> name.startsWith("R")).collect(Collectors.toSet());
		for (String string : filteredNamesInSet) {
			System.out.println(string);
		}
		
		System.out.println("concat Mr to names .........");
		//foreach using stream
		List<String> concatMrNames = 
				names.stream().map(name -> "Mr. ".concat(name)).collect(Collectors.toList());
		for (String string : concatMrNames) {
			System.out.println(string);
		}
	}

}