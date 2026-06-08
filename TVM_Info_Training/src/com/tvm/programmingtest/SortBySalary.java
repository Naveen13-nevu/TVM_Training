package com.tvm.programmingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salry;
	
	public Employee(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salry = salary;
	}
	

}

public class SortBySalary {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
							new Employee(1,"Naveen",20000),
							new Employee(3,"Praveen",50000),
							new Employee(2,"Arun",30000)
				);
		
		    
			List<Employee> sorted = list.stream()
					.sorted(Comparator.comparing(e-> e.salry))
					.collect(Collectors.toList());
			
			sorted.forEach(e -> System.out.println(e.name + " "+e.salry));
				
	}

}
