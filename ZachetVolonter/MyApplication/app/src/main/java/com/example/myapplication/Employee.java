package com.example.myapplication;

public class Employee {
    private int id;
    private String employeeId;
    private String name;
    private String department;

    public Employee(int id, String employeeId, String name, String department) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

