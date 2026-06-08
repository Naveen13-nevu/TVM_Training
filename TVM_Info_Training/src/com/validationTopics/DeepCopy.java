package com.validationTopics;

class Address {
    String address;

    public Address(String address) {
        this.address = address;
    }

    // Copy Constructor
    public Address(Address other) {
        this.address = other.address;
    }
}

class Employee1 {

    int id;
    String name;
    Address address;

    public Employee1(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Deep Copy Constructor
    public Employee1(Employee1 other) {
        this.id = other.id;
        this.name = other.name;
        this.address = new Address(other.address);
    }
}

public class DeepCopy {

    public static void main(String[] args) {
    	
    	Address a1 = new Address("Chennai");

        Employee1 e1 = new Employee1(
                1,
                "Naveen",
                a1
        );

        Employee1 e2 = new Employee1(e1);

        e2.address.address = "Bangalore";

        System.out.println("Employee 1 Address : " + e1.address.address);
        System.out.println("Employee 2 Address : " + e2.address.address);
    }
}