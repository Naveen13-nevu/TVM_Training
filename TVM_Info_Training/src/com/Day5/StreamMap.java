package com.Day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Naveen","Arun");
		
//		Mapping
		
//		list.stream()
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
		
//		Sorting
		
		list.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);

	}

}
