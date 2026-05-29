package com.Java17;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 2;

		String result = switch(day) {

		    case 1 -> "Monday";
		    case 2 -> "Tuesday";
		    default -> "Invalid";
		};

		System.out.println(result);

	}

}
