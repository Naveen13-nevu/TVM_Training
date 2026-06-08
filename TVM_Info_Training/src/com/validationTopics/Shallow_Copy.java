package com.validationTopics;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id+" "+ name;
	}
	
}

public class Shallow_Copy {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Naveen");
		Employee e2 = e1;
		e2.id=2;
		e2.name="Arun";
		
		System.out.println(e1);

	}

}
