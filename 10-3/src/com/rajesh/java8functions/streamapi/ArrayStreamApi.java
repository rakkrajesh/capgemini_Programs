package com.rajesh.java8functions.streamapi;

import java.util.Arrays;

public class ArrayStreamApi {
	public static void main(String[] args) {
		int[] value = new int[] {10, 9, 8, 7, 5};
		Arrays.sort(value);
		Arrays.stream(value).forEach(System.out::println);
		Arrays.stream(value).filter(v -> (v > 5)).forEach(System.out::println);
	}
}