package com.example.myapplication;

public class CustomApplication {
    private String title;
    private String department;
    private String date;
    private String type;

    public CustomApplication(String title, String department, String date, String type) {
        this.title = title;
        this.department = department;
        this.date = date;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return title;
    }
}



