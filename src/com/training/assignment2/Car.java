package com.training.assignment2;

public class Car implements Vehicle {

    private final int wheels=2;
    private final String fuel;
    public Car(String fuel) {
        this.fuel=fuel;
    }

    public int getWheels(){
        return this.wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving car...");
    }

    @Override
    public void horn() {
        System.out.println("horn... horn...");
    }

}
