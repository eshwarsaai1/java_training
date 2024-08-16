package com.training.assignment2;
import pojo.Vehicle;

public class Bike implements Vehicle {
    private final int wheels=2;
    private final String fuel;
    public Bike(String fuel) {
        this.fuel=fuel;
    }

    public int getWheels(){
        return this.wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving bike...");
    }

    @Override
    public void horn() {
        System.out.println("horn... horn...");
    }
}
