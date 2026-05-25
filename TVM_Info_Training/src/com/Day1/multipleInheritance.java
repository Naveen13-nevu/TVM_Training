package com.Day1;

interface Flyable {
	  void fly();
	}
	interface Swimmable {
	  void swim();
	}
	interface Runnable {
	  void run();
	}

	
	class Duck implements Flyable, Swimmable, Runnable {
	  public void fly() {
		  System.out.println("Duck flies");
		  }
	  public void swim() { 
		  System.out.println("Duck swims"); 
		  }
	  public void run() {
		  System.out.println("Duck runs"); 
		  }
	}

public class multipleInheritance {

	public static void main(String[] args) {
		
		Duck d = new Duck();
		d.fly();
		d.swim();
		d.run();
		

	}

}
