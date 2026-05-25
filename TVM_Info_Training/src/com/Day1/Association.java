package com.Day1;

class Teacher{
	
	private String name;
	
	Teacher(String name){
		this.name = name;
	}
	
	public void tech(Prof student) {
		System.out.println(name + " "+ student.getName());
	}

}

class Prof{
	
private String name;
	
	Prof(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;	}
	
}
public class Association {

	public static void main(String[] args) {

		Teacher t = new Teacher("Naveen");
		Prof s = new Prof("ravi");
		
		t.tech(s);
		
		

	}

}
