package com.training.employee.models;

public class Employee {
    private int emp_id;
    private String emp_name;
    private Department dept;
    private Address add;

    public Employee(int id, String name){
        emp_id=id;
        emp_name=name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return emp_id +
            "," + emp_name +
            "," + dept +
            "," + add ;
    }
}
