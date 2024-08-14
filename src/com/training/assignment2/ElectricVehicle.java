package com.training.assignment2;
import pojo.Vehicle;

public abstract class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int wheels) {
        super(wheels,"Electricity");
    }

    @Override
    public void horn(){
        System.out.println("horning...");
    }
}
