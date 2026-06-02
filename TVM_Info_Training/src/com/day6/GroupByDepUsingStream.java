package com.day6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Zoho{
	
	String name;
	String dept;
	double salary;
	
	
	public Zoho(String name, String dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name+" "+ salary+" "+dept;
	}
	
}


public class GroupByDepUsingStream {

	public static void main(String[] args) {

		List<Zoho> list = Arrays.asList(
				
				 new Zoho("Naveen", "software developer",100000),
				 new Zoho("Arun", "HR",30000),
				 new Zoho("Prem", "Technical support",40000),
				 new Zoho("Kevin", "software developer",12000)
								
				);
		
		Map<String,List<Zoho>> grouped = list.stream()
				.collect(Collectors.groupingBy(Zoho::getDept));
		System.out.println(grouped);
				
		

	}

}
