package com.day2;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }
}


public class Asscociation {

	public static void main(String[] args) {
		
		Student s = new Student("Naveen");
		College c = new College("Muthukumaraswamy college");
		
		System.out.println(s.name + " "+ c.collegeName);
		

	}

}
