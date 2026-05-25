package com.Day1;

import java.util.Scanner;

class Student{
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class examplesOfEncapsulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		
		System.out.println("Student details: ");
		System.out.println("Id : " + s.getId());
		System.out.println("Name : " + s.getName());
		
		
		


		

	}

}
