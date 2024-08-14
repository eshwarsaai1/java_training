package com.training.assignment2;
import pojo.Vehicle;

public class Bike extends Vehicle {

    public Bike(String fuel) {
        super(2, fuel);
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
