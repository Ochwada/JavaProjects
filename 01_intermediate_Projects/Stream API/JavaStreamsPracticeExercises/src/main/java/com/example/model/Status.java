package com.example.model;


/**
 * *******************************************************
 * Package: com.example
 * File: Status.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 11:29 AM
 * Description: Represents the status of a task.
 * Objective:
 * *******************************************************
 */

/**
 * The status can be one of the following:
 * <p>
 * {@link #PENDING} - The task has not yet started.
 * {@link #IN_PROGRESS} - The task is currently in progress.
 * {@link #COMPLETED} - The task has been finished.
 */
public enum Status {
    PENDING,
    IN_PROGRESS,
    COMPLETED;
}
