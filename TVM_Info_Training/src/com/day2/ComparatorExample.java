package com.day2;
import java.util.*;

class Employee1 {

    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparatorExample {

	public static void main(String[] args) {

		List<Employee1> list = new ArrayList<>();
		
		   	list.add(new Employee1(3, "Ram"));
	        list.add(new Employee1(1, "Amit"));
	        list.add(new Employee1(2, "John"));
	        
	        Comparator<Employee1> c = (a,b) -> a.name.compareTo(b.name);
	        
	        Collections.sort(list,c);
	        System.out.println(list);
	}

}
