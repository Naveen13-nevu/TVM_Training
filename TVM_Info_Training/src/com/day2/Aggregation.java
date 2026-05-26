package com.day2;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {

    String deptName;

    Employee emp;

    Department(String deptName, Employee emp) {

        this.deptName = deptName;
        this.emp = emp;
    }

    void show() {

        System.out.println(
            emp.name + " works in " + deptName
        );
    }
}

public class Aggregation {

	public static void main(String[] args) {
		
		Employee e = new Employee("Naveen");
		Department d = new Department("Sotware Engineer",e);
		d.show();
	}
	
}
