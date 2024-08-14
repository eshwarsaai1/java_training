package com.training.assignment2;

public class ElectricCar extends ElectricVehicle {

    public ElectricCar() {
        super(4);
    }

    @Override
    public void drive() {
        System.out.println("Driving Electric car...");
    }

    @Override
    public void horn() {
        System.out.println("horn... horn...");
    }

    public void horn(String sound){
        System.out.println(sound);
    }

}
