package com.example.model;


import com.example.service.IdGenerator;

import java.util.List;

/**
 * *******************************************************
 * Package: com.example.model
 * File: Employee.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 5:31 PM
 * Description: Represents an employee within the organization, including their personal information, job details, and assigned projects.
 * Objective:
 * *******************************************************
 */


public class Employee {
    // Fields
    private final String id;
    private final String name;
    private final String email;
    private final String position;
    private final String department;
    private final List<Project> projects;

    /**
     * Constructs a new {@code Employee} instance.
     * The employee ID is auto-generated.
     *
     * @param name       the employee's full name
     * @param email      the employee's email address
     * @param position   the employee's job position (e.g. "Software Engineer")
     * @param department the department the employee belongs to (e.g. "IT")
     * @param projects   the list of projects assigned to this employee
     */
    public Employee(String name, String email, String position, String department, List<Project> projects) {
        this.id = IdGenerator.generateEmployeeId();
        this.name = name;
        this.email = email;
        this.position = position;
        this.department = department;
        this.projects = projects;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    /**
     * Returns a string representation of the employee.
     *
     * @return formatted string with employee details.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", Projects =" + projects +
                '}';
    }
}
