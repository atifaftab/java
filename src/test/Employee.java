package test;
public class Employee {
    private long empId;
    private String name;
    private String surName;
    private String emailId;
    private double salary;

    public Employee(long empId, String name, String surName, String emailId, double salary) {
        this.empId = empId;
        this.name = name;
        this.surName = surName;
        this.emailId = emailId;
        this.salary = salary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", salary=" + salary +
                '}';
    }
}