package com.validationTopics;

import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		
		Consumer<String> c = name -> System.out.println("My Name is :  "+ name);
		Consumer<Integer> c1 = id -> System.out.println("My roll number is :  "+ id);
	
		c.accept("Naveen");		
		c1.accept(10);
	}
}
