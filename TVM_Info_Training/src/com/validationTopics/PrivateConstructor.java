package com.validationTopics;

//class Demo{
//	
//	private Demo() {
//		System.out.println("bye");
//	}
//}

public class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		PrivateConstructor p = new PrivateConstructor();
//		Demo d = new Demo();
	

	}

}
