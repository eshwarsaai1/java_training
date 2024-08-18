package pojo;

import java.util.Objects;

public class Emp {
    private int employee_id;
    private String employee_name;
    public String dept;
    private int salary;
    private float experience;
    int k=5;
    String s="pavan";
    {
        System.out.println("hello instance");
    }
    static{
        System.out.println("hii static");
    }
    {
        System.out.println(s+" "+k);
    }
    public Emp(String employee_name) {
        this.employee_name = employee_name;
    }

    public Emp() {
        this("Chakree");
        this.employee_id=0;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    @Override
    public boolean equals(Object e){
        Emp emp=(Emp)e;
        return this.employee_name == emp.employee_name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.employee_name, this.employee_id);
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}

