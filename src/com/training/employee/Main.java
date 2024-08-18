package com.training.employee;

import com.training.employee.repository.FileSysEmpService;
import com.training.employee.repository.InMemoryEmpService;


import com.training.employee.models.Employee;
import pojo.Emp;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        InMemoryEmpService service=new InMemoryEmpService();

//        FileSysEmpService service=new FileSysEmpService("C:\\Users\\eshwarg_700053\\Desktop\\Employee.txt");
        while(true) {
            System.out.println("Choose operation to perform on Employees: \n 1.Get employee by id \n 2.Add employee \n 3.Delete Employee \n 4.Update employee \n 5.Show all employees \n 6.Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter Employee id: ");
                    Employee returnedEmployee=service.getEmpById(sc.nextInt());
                    if(returnedEmployee!=null) {
                        String[] data = returnedEmployee.toString().split(",");
                        System.out.println("Employee { \n Employee Id: " + data[0] + "\n Employee Name: " + data[1] + "\n Department Id: " + data[2] + "\n Department Name: " + data[3] + "\n Location: " + data[4] + "\n Pincode: " + data[5] + "\n }");
                    }
                    break;
                case 2:
                    service.addEmp();
                    break;
                case 3:
                    System.out.print("Enter Employee id: ");
                    service.deleteEmp(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Employee id: ");
                    service.updateEmp(sc.nextInt());
                    break;
                case 5:
                    service.getAllEmp();
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.out.println("choose valid Operation");
                    break;
            }
        }
    }
}
