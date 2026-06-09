package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("naveen","praveen","arjun");
		
		List<String> result = list.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(result);

	}

}
