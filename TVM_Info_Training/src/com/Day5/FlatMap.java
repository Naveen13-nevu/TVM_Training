package com.Day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(10,20),
				Arrays.asList(30,40),
				Arrays.asList(50,60),
				Arrays.asList(70,80)
				
				);
		
		List<Integer> result =list.stream()
		.flatMap(li -> li.stream())
				.collect(Collectors.toList());
		
		result.forEach(s-> System.out.print(s+" "));
	}

}
