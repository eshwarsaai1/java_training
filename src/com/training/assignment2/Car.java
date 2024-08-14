package com.training.assignment2;

import pojo.Vehicle;

public class Car extends Vehicle {

    public Car(String fuel) {
        super(4, fuel);
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
