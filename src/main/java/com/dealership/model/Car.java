
package com.dealership.model;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting car...");
        engine.start();
    }

}
