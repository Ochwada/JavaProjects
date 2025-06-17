package com.example.model;


import com.example.service.IdGenerator;

/**
 * *******************************************************
 * Package: com.example
 * File: Task.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 11:27 AM
 * Description: Model class (POJO) - Represents a task with a title and status
 * Objective:
 * *******************************************************
 */


public class Task {
    // Field
    private final String id;
    private final String title;
    private final Status Status;

    /**
     * Constructs a Task with the given title and status.
     *
     * @param title  the title of the task
     * @param status the status of the task (e.g. "Pending", "In Progress", "Completed" )
     */
    public Task(String title, Status status) {
        this.id = IdGenerator.generateTaskId();
        this.title = title;
        Status = status;
    }

    /**
     * Returns the title of the task.
     *
     * @return the task title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the status of the task.
     *
     * @return the task status
     */
    public Status getStatus() {
        return Status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                ", Status=" + Status +
                '}';
    }
}
