package com.Day4;

class MathOperation {

    int add(int a, int b) {

        return a + b;
    }

    int add(int a, int b, int c) {

        return a + b + c;
    }

    double add(double a, double b) {

        return a + b;
    }
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		MathOperation m = new MathOperation();
		System.out.println(m.add(10.5, 20.55 ));
		
		
	}
	
}
