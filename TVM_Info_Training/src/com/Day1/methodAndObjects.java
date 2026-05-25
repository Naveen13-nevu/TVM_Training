package com.Day1;

import java.util.Scanner;

class calculator{
	
	int add(int a, int b) {
		
		return a* b;
	}
}

public class methodAndObjects {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the number2: ");
		int b = sc.nextInt();
		
		calculator calc = new calculator();
		int result = calc.add(a, b);
		System.out.println("the result is : " +result);

	}

}
