package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestClass {
    public static List<Employee> getEmployeeList() {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Bala", "Nelavalli", "bala@gmail.com", 1000));
        empList.add(new Employee(2, "Rama", "surname1", "rala@gmail.com", 2000));
        empList.add(new Employee(3, "Krishna", "surname2", "krishna@gmail.com", 2000));
        empList.add(new Employee(4, "venkat", "surname3", "venkat@gmail.com", 1000));
        empList.add(new Employee(5, "anil", "surname4", "anil@gmail.com", 3000));
        empList.add(new Employee(6, "anilRaj", "Nelavalli2", "anilRaj@gmail.com", 3000));
        empList.add(new Employee(7, "anilRaj", "Nelavalli3", "anilRaj@gmail.com", 3000));
        empList.add(new Employee(20, "anilRaj", "", "anilRaj@gmail.com", 3000));
        empList.add(new Employee(21, "anilRaj", null, "anilRaj@gmail.com", 3000));
        return empList;
    }

    public static void main(String[] args) {


//        find highest salary
        Optional<Double> highestSal = TestClass.getEmployeeList().stream().map(Employee::getSalary).reduce(Double::max);
        highestSal.ifPresent(System.out::println);

        //employee list of highestSalary
        System.out.println(TestClass.getEmployeeList().stream().filter(i -> i.getSalary() == TestClass.getEmployeeList().stream().map(Employee::getSalary).reduce(Double::max).get()).toList());


    }
}
