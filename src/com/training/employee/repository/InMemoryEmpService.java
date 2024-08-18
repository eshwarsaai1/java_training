package com.training.employee.repository;

import com.training.employee.exceptions.EmployeeNotFound;
import com.training.employee.exceptions.IDAlreadyExists;
import com.training.employee.models.*;
import com.training.employee.service.EmployeeService;

import java.util.*;

public class InMemoryEmpService implements EmployeeService {
    Map<Integer,Employee> employeeMap = new HashMap<>();
    Map<Integer,String> departmentMap = new HashMap<>();
    Scanner sc=new Scanner(System.in);
    @Override
    public Employee getEmpById(int id) {
        try {
            if(employeeMap.containsKey(id)) return employeeMap.get(id);
            throw new EmployeeNotFound();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void addEmp() {
        int id;
        while(true) {
            System.out.println("Enter Employee id:");
            id = sc.nextInt();
            if (employeeMap.containsKey(id)) {
                try {
                    throw new IDAlreadyExists();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else{
                break;
            }
        }
        System.out.println("Enter Employee name:");
        String name=sc.next();
        Employee emp=new Employee(id,name);
        Department dept;
        System.out.println("Enter Employee dept_id:");
        int dept_id=sc.nextInt();
        if(departmentMap.containsKey(dept_id)){
            dept= new Department(dept_id, departmentMap.get(dept_id));
        }
        else{
            System.out.println("Enter Employee dept_name:");
            String dept_name=sc.next();
            dept=new Department(dept_id,dept_name);
            departmentMap.put(dept_id,dept_name);
        }
        emp.setDept(dept);
        System.out.println("Enter Employee location:");
        String location=sc.next();
        System.out.println("Enter Employee pincode:");
        int pincode=sc.nextInt();
        Address add=new Address(location,pincode);
        emp.setAdd(add);
        employeeMap.put(id,emp);
    }

    @Override
    public void getAllEmp() {
        for (Employee employee : employeeMap.values()) {
            String[] data = employee.toString().split(",");
            System.out.println("Employee { \n Employee Id: " + data[0] + "\n Employee Name: " + data[1] + "\n Department Id: " + data[2] + "\n Department Name: " + data[3] + "\n Location: " + data[4] + "\n Pincode: " + data[5] + "\n }");
        }
    }

    @Override
    public void updateEmp(int id) {
        try {
            if (employeeMap.containsKey(id)){
                Employee emp = employeeMap.get(id);
                System.out.println("Choose what you want to update: \n 1.id \n 2.name \n 3.department \n 4.address");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.print("Enter new id: ");
                        int newID=sc.nextInt();
                        emp.setEmp_id(newID);
                        employeeMap.remove(id);
                        employeeMap.put(newID,emp);
                        break;
                    case 2:
                        System.out.print("Enter new name: ");
                        emp.setEmp_name(sc.next());
                        break;
                    case 3:
                        System.out.print("Enter new dept_id: ");
                        int dept_id = sc.nextInt();
                        if(departmentMap.containsKey(dept_id)){
                            emp.setDept(new Department(dept_id, departmentMap.get(dept_id)));
                        }
                        else {
                            System.out.print("Enter new dept_name: ");
                            String dept_name = sc.next();
                            Department dept = new Department(dept_id, dept_name);
                            emp.setDept(dept);
                            departmentMap.put(dept_id,dept_name);
                        }
                        break;
                    case 4:
                        System.out.print("Enter new location: ");
                        String location = sc.next();
                        System.out.print("Enter new pincode: ");
                        int pincode = sc.nextInt();
                        Address add = new Address(location, pincode);
                        emp.setAdd(add);
                        break;
                    default:
                        System.out.println("Nothing changed");
                        break;
                }
            }
            else throw new EmployeeNotFound();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteEmp(int id) {
        try {
            if(employeeMap.containsKey(id)) employeeMap.remove(id);
            throw new EmployeeNotFound();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
