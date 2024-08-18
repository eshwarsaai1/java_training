package com.training.employee.models;

public class Address {
    private String location;
    private int pinCode;
    public Address(String location, int pinCode){
        this.location=location;
        this.pinCode=pinCode;
    }

    @Override
    public String toString() {
        return location +
                "," + pinCode;
    }
}
