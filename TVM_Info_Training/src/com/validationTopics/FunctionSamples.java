package com.validationTopics;

import java.util.function.Function;

public class FunctionSamples {

	public static void main(String[] args) {
		
		Function<Integer,String> f = num -> " Number : "+num;
		System.out.println(f.apply(20));
		
		
		Function<Integer, Integer> f1 = num -> num* num;
		System.out.println(f1.apply(100));
		
	}
	
}
