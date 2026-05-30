package com.Java17;

record Employee(int id,String name) {
	
}

public class RecordUpdate {

	public static void main(String[] args) {
	
		Employee e = new Employee(1,"Naveen");
		
		System.out.println(e.id() + " "+e.name());
		

	}

}
