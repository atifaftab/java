package com.test.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employeeList;

    public EmployeeManager(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public double calculateSalary(){
        return 0.0;
    }
}
