package com.training.assignment2;

public class ElectricBike extends ElectricVehicle {

    public ElectricBike(int wheels) {
        super(2);
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
