package com.Java17;

sealed class Animal permits dog,cat{
	void sound() {
		System.out.println("sound");
	}
}

final class dog extends Animal{
	void bark() {
		System.out.println("The dog is barking");
	}
}

final class cat extends Animal{
	void meow() {
		System.out.println("The cat is Meowing ");
	}
}

public class SealedClass {

	public static void main(String[] args) {

		dog d = new dog();
		cat c = new cat();
		d.sound();
		d.bark();
		c.sound();
		c.meow();
		
	

	}

}
