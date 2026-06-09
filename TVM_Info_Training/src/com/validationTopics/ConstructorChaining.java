package com.validationTopics;

class College{
	int id;
	String name;
	
	College(){
		this(101,"Naveen");
		System.out.println("Default");
	}
	
	College(int id,String name){
		this.id=id;
		this.name = name;
		System.out.println(id+" "+ name);
		
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {


		College c = new College();

	}

}
