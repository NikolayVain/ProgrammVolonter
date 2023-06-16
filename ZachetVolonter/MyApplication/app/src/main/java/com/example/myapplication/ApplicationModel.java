package com.example.myapplication;

public class ApplicationModel {
    private String title;
    private String department;
    private String date;
    private String type;

    public ApplicationModel(String title, String department, String date, String type) {
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
}

