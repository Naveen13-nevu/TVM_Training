package com.validationTopics;

class Animal{
	void sound() {
		System.out.println("Animal Sound ");
	}
}

class Dog extends Animal{
	
	void hor() {
		System.out.println("Bark sound");
	}
}

public class ClassCastException {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = (Dog)a;
		
	}
}
