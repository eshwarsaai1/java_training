package com.training.employee.repository;

import com.training.employee.exceptions.EmployeeNotFound;
import com.training.employee.models.Address;
import com.training.employee.models.Department;
import com.training.employee.models.Employee;
import com.training.employee.service.EmployeeService;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileSysEmpService implements EmployeeService {
    File file;
    Scanner sc=new Scanner(System.in);
    public FileSysEmpService(String path){
        try{
            file= new File(path);
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already Exist");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    @Override
    public Employee getEmpById(int id) {
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String[] data = fileReader.nextLine().split(",");
                if(Integer.parseInt(data[0]) == id) {
                    System.out.println(data[0]+data[1]);
                    Employee emp = new Employee(Integer.parseInt(data[0]), data[1]);
                    emp.setDept(new Department(Integer.parseInt(data[2]) , data[3] ));
                    emp.setAdd(new Address(data[4],Integer.parseInt(data[5])));
                    return emp;
                }
            }
            throw new EmployeeNotFound();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void addEmp() {
        if(file.canWrite()){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Employee name:");
            String name=sc.next();
            System.out.println("Enter Employee id:");
            int id=sc.nextInt();
            Employee emp=new Employee(id,name);
            System.out.println("Enter Employee dept_id:");
            int dept_id=sc.nextInt();
            System.out.println("Enter Employee dept_name:");
            String dept_name=sc.next();
            Department dept=new Department(dept_id,dept_name);
            emp.setDept(dept);
            System.out.println("Enter Employee location:");
            String location=sc.next();
            System.out.println("Enter Employee pincode:");
            int pincode=sc.nextInt();
            Address add=new Address(location,pincode);
            emp.setAdd(add);
            try {
                String data="";
                Scanner fileReader = new Scanner(file);
                while(fileReader.hasNextLine()){
                    data= data + fileReader.nextLine() + "\n";
                }
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(data + emp + "\n");
                fileWriter.close();
                System.out.println("Added successfully");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Cannot Write into this file");
        }
    }

    @Override
    public void getAllEmp() {
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String[] data = fileReader.nextLine().split(",");
                System.out.println("Employee { \n Employee Id: " + data[0] + "\n Employee Name: " + data[1] + "\n Department Id: " + data[2] + "\n Department Name: " + data[3] + "\n Location: " + data[4] + "\n Pincode: " + data[5] + "\n } \n");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void updateEmp(int id) {
        System.out.println("Started");
        try{
            String fileData="";
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String currentLine=fileReader.nextLine();
                String[] data = currentLine.split(",");
                if(Integer.parseInt(data[0]) == id) {
                    Employee emp=new Employee(Integer.parseInt(data[0]), data[1]);
                    emp.setDept(new Department(Integer.parseInt(data[2]),data[3]));
                    emp.setAdd(new Address(data[4],Integer.parseInt(data[5])));
                    System.out.println("Choose what you want to update: \n 1.name \n 2.id \n 3.department \n 4.address");
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("Enter new name: ");
                            emp.setEmp_name(sc.next());
                            break;
                        case 2:
                            System.out.print("Enter new id: ");
                            emp.setEmp_id(sc.nextInt());
                            break;
                        case 3:
                            System.out.print("Enter new dept_id: ");
                            int dept_id = sc.nextInt();
                            System.out.println("Enter new dept_name: ");
                            String dept_name = sc.next();
                            Department dept = new Department(dept_id, dept_name);
                            emp.setDept(dept);
                            break;
                        case 4:
                            System.out.println("Enter new location: ");
                            String location = sc.next();
                            System.out.println("Enter new pincode: ");
                            int pincode = sc.nextInt();
                            Address add = new Address(location, pincode);
                            emp.setAdd(add);
                            break;
                        default:
                            System.out.println("Nothing changed");
                            break;
                    }
                    fileData= fileData + emp + "\n";
                }
                else {
                    fileData= fileData + currentLine + "\n";
                }
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(fileData);
            fileWriter.close();
            System.out.println("Updated successfully");
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
    }

    @Override
    public void deleteEmp(int id) {
        try{
            String fileData="";
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String currentLine=fileReader.nextLine();
                String[] data = currentLine.split(",");
                if(Integer.parseInt(data[0]) != id) {
                    fileData= fileData + currentLine + "\n";
                }
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(fileData);
            fileWriter.close();
            System.out.println("Deleted successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
