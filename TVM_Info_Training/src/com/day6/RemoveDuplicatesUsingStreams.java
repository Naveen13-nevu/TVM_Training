package com.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicatesUsingStreams {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Naveen","Naveen","Hari","Prem");
		
		List<String> result = list.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
