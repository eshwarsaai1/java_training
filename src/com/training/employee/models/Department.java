package com.training.employee.models;

public class Department {
    private int dept_id;
    private String dept_name;

    public Department(int id, String name){
        dept_id=id;
        dept_name=name;
    }

    @Override
    public String toString() {
        return dept_id + "," + dept_name;
    }
}
