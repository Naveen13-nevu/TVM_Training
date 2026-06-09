package com.validationTopics;

class Singleton{
	
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Helloo world ");
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
		instance = new Singleton();	
		}
		return instance;
	}
}

public class SingletonDesign {

	public static void main(String[] args) {
		
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
	
		  System.out.println(s1);
	      System.out.println(s2);
	}

}
