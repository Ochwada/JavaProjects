package com.task_manager;

import java.util.*;

/**
 * Demo Class
 */
public class App {
    public static void main(String[] args) {
        // Create an instance of TaskProcessor to access filtering functionality.
        TaskProcessor processor = new TaskProcessor();

        /**
         * Create a list of Task objects.
         *
         * Each Task contains:
         * - a description (String),
         * - a completion status (boolean),
         * - and a priority (int).
         */
        List<Task> tasks = List.of(
                new Task("Buy computer", true, 1),
                new Task("Buy a bike", false, 2),
                new Task("Pay for Bafog", false, 3)
        );

        /**
         * 3️Use TaskProcessor's filterTasks() method to filter tasks that are not completed.
         * The lambda expression: task -> !task.isCompleted()
         * - Reads as: "Keep tasks where isCompleted() returns false."
         * The method returns a new list of pending tasks.
         */

        List<Task> pendingTasks = processor.filterTasks(
                tasks,
                task -> !task.isCompleted());
        // Or
        //        {
        //            // other logics
        //            return !task.isCompleted());
        //        }

        // Printing all tasks using a stream
        pendingTasks
                .stream()
                .forEach(
                        // System.out::println
                        task -> System.out.println("Task -> " + task.getDescription()) // or System.out::println
                );

    }
}
