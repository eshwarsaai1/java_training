package com.training;

import pojo.Employee;

public class ExEmployee extends Employee {
    public ExEmployee(int ExEmpID, String name){
        super(ExEmpID,name);
        super.printthis("Super class method invoked from sub class constructor");
    }
    @Override
    public void printthis(){
        System.out.println("Overridden");
    }
}
