package com.training.assignment2;

public class ElectricBike extends ElectricVehicle {
    private final int wheels=2;
    private final String fuel;
    public ElectricBike(String fuel) {
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
