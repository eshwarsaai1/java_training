package com.training.employee.service;

import com.training.employee.models.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
    public Employee getEmpById(int id);
    public void addEmp();
    public void getAllEmp();
    public void updateEmp(int id);
    public void deleteEmp(int id);
}
