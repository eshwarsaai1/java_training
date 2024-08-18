package com.training.employee.exceptions;

public class IDAlreadyExists extends Exception{
    public IDAlreadyExists(){
        super("Employee ID Already Exists!!");
    }
}
