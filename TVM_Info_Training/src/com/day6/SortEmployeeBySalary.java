package com.day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
}

public class SortEmployeeBySalary {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee("Naveen",10000),
				new Employee("praveen",30000),
				new Employee("prem",20000)
				);
		
		List<Employee> sorted = list.stream()
				.sorted(Comparator.comparingDouble(e-> e.salary))
				.collect(Collectors.toList());
		sorted.forEach(e-> System.out.println(e.name +" "+e.salary));

	}

}
