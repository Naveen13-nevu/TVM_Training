package com.day2;
import java.util.*;

class Student1 implements Comparable<Student1> {

    int id;

    Student1(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student1 s) {

        return this.id - s.id;
    }

    public String toString() {
        return "" + id;
    }
}

public class Comparable_Syntax {

	public static void main(String[] args) {

		 List<Student1> list = new ArrayList<>();

	        list.add(new Student1(3));
	        list.add(new Student1(1));
	        list.add(new Student1(2));

	        Collections.sort(list);

	        System.out.println(list);
	}

}
