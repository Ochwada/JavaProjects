package com.example.model;


import com.example.service.IdGenerator;

import java.time.LocalDate;
import java.util.*;

/**
 * *******************************************************
 * Package: com.example.model
 * File: Project.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 5:34 PM
 * Description:
 * Objective:
 * *******************************************************
 */


public class Project {
    private final String id;
    private final String name;
    private final String description;
    private final ProjectStatus status;
    private final double budget;
    private final List<Employee> members;

    //private final String client;
    //private final List<String> technologies;
    //private final LocalDate startDate;
    //private final LocalDate endDate;

    /**
     * Constructs a new {@code Project} instance with the specified details.
     * <p>
     * Each project includes an ID, name, description, current status, allocated budget,
     * and a list of assigned employees (members).
     *
     * @param name        the name or title of the project
     * @param description a brief description outlining the project's purpose or scope
     * @param status      the current {@link ProjectStatus} of the project (e.g., PLANNED, IN_PROGRESS, COMPLETED)
     * @param budget      the total budget allocated for the project (in currency units)
     * @param members     the list of {@link Employee} instances assigned to work on this project
     */
    public Project(String name,
                   String description,
                   ProjectStatus status,
                   double budget,
                   List<Employee> members) {
        this.id = IdGenerator.generateProjectId();
        this.name = name;
        this.description = description;
        this.status = status;
        this.budget = budget;
        this.members = members;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public double getBudget() {
        return budget;
    }

    public List<Employee> getMembers() {
        return members;
    }

    /**
     * Returns a string representation of the {@code Project} object.
     * This method is typically used for debugging, logging, or printing object contents.
     *
     * @return a formatted string containing all project information
     */
    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", budget=" + budget +
                ", members=" + members +
                '}';
    }
}
