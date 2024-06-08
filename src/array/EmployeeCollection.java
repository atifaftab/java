package array;

import atif.dsa.doublyLinkedList.insert.Insert;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "bob", 25, 25000);
        Employee employee2 = new Employee(2, "mark", 35, 35000);
        Employee employee3 = new Employee(3, "jon", 30, 30000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println(employeeList.stream().filter(employee -> employee.getAge() > 30).toList());
        //sum all salary,
        System.out.println(employeeList.stream().map(Employee::getSalary).mapToDouble(Double::doubleValue).sum());
    }
}
