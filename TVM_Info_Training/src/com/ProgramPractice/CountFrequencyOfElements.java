package com.ProgramPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfElements {

	public static void main(String[] args) {
		
		String [] words = {"Apple", "Banana","Mango","Apple","Apple","Tree"};
		
		Map<String,Long> freq = Arrays.stream(words)
				.collect(Collectors.groupingBy(word -> word,Collectors.counting()));
		System.out.println(freq);

	}

}
