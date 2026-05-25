package com.Day1;

import java.util.Arrays;
import java.util.List;

public class JavaEightFeaturesMethodReference {

	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		
//		numbers.stream()
//		.map(Math::sqrt)
//		.forEach(System.out::println);
		
		List<String> list = Arrays.asList("naveen","Arun","praveen");
		
		list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
	}

}
