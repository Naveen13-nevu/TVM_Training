package com.Day1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Object obj = new Object();
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Cannot divided by Zero");
		}
		finally {
			System.out.println("Program Ends....");
		}
	}
}
