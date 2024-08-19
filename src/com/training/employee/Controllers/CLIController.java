package com.training.employee.Controllers;

import com.training.employee.models.Employee;
import com.training.employee.repository.FileSysEmpService;
import com.training.employee.repository.InMemoryEmpService;
import com.training.employee.service.EmployeeService;

import java.util.Scanner;

public class CLIController {
    public static void start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose: \n 1.InMemoryOperations \n 2.FileSystemOperations");
        EmployeeService service = switch (sc.nextInt()) {
            case 1 -> new InMemoryEmpService();
            case 2 -> new FileSysEmpService("C:\\Users\\eshwarg_700053\\Desktop\\Employee.txt");
            default -> null;
        };
        if(service == null) return;
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
