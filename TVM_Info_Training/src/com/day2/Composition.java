package com.day2;


class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    private Engine engine;

    Car() {

        engine = new Engine();
    }

    void drive() {

        engine.start();

        System.out.println("Car running");
    }
}


public class Composition {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.drive();

	}

}
