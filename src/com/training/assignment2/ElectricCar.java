package com.training.assignment2;

public class ElectricCar extends ElectricVehicle {

    private int wheels=4;
    private final String fuel;
    public ElectricCar(String fuel) {
        this.fuel=fuel;
    }

    public int getWheels(){
        return this.wheels;
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
