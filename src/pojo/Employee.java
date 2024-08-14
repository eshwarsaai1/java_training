package pojo;

public class Employee {
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
    public Employee(int employee_id, String employee_name) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
    }

    public Employee() {
        this(10001, "Chakree");
        this.employee_id=0;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void printthis(String s){
        System.out.println(s);
    }

    public void printthis(){
        this.printthis("Give some parameters");
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

