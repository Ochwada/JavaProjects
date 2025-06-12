package com.task_manager;


/**
 * *******************************************************
 * Package: com.task_manager
 * File: Task.java
 * Author: Ochwada
 * Date: Thursday, 12.Jun.2025, 9:38 AM
 * Description: Represents a Task in a task management system
 * Objective:
 * *******************************************************
 */


public class Task {
    private final String description;
    private final boolean isCompleted;
    private final int priority;

    public Task(String description, boolean isCompleted, int priority) {
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    // Getters

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task {" +
                "description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", priority=" + priority +
                '}';
    }
}
