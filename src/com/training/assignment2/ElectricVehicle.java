package com.training.assignment2;
import pojo.Vehicle;

public abstract class ElectricVehicle implements Vehicle {

    @Override
    public void horn(){
        System.out.println("horning...");
    }
}
