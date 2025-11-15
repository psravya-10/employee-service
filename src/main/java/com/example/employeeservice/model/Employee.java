package com.example.employeeservice.model;

public class Employee {

    private Integer id;
    private String employeeName;
    private Integer salary;

    public Employee() {}

    public Employee(Integer id, String employeeName, Integer salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
