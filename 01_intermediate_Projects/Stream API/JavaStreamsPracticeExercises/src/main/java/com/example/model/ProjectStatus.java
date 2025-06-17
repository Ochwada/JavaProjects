package com.example.model;


/**
 * *******************************************************
 * Package: com.example.model
 * File: ProjectStatus.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 5:39 PM
 * Description: Enumeration representing the status of a project.
 * * Each project can be in one of several states during its lifecycle.
 * * This enum is typically used to track and filter projects based on their progress.
 * Objective:
 * *******************************************************
 */

/**
 * Possible statuses:
 * <p>
 * {@code PLANNED} - The project has been planned but has not started yet.
 * {@code IN_PROGRESS} - The project is currently being executed.
 * {@code COMPLETED} - The project has been finished successfully.
 * {@code ON_HOLD} - The project is temporarily paused or delayed.
 * {@code CANCELLED} - The project has been terminated before completion.
 */

public enum ProjectStatus {
    PLANNED,
    ACTIVE,
    COMPLETED,
    ON_HOLD,
    CANCELLED
}
