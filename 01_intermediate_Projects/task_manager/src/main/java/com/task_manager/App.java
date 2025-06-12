package com.task_manager;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Demo Class
 */
public class App {
    public static void main(String[] args) {
        // Create an instance of TaskProcessor to access filtering functionality.
        TaskProcessor processor = new TaskProcessor();

        /**
         * 1️⃣
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

        // Printing all tasks using a stream
        pendingTasks
                .stream() // this is optional to put, not bad nor good
                .forEach(
                        task -> System.out.println("Task -> " + task.getDescription())
                        // or System.out::println
                );

        /**
         * 2️⃣ Mapping tasks to extract descriptions
         *
         * <p>
         * The mapTasks() method transforms each {@link Task} object in the list into its corresponding description.
         * The transformation is done using a {@link Function} interface, which takes a {@code Task} and returns its description ({@code String}).
         * </p>
         *
         * <p>
         * Here, we are using a method reference {@code Task::getDescription} as the mapping function,
         * which is equivalent to {@code task -> task.getDescription()}.
         * </p>
         *
         * <p>Result:</p>
         * <pre>{@code
         * Input: List of Task objects
         * Output: List of Strings containing task descriptions
         * }</pre>
         */
        System.out.println();
        List<String> descriptions = processor.mapTasks(
                pendingTasks,
                Task::getDescription  // tasks -> task.description

        );
        // Printing all tasks using a stream
        descriptions
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Concert Int to String - An example explanation");
        // Conversing numbers to Strings
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<String> asStrings = nums
                .stream()
                .map(number -> "Number: " + number )
                .collect(Collectors.toList());

        System.out.println(asStrings);
    }
}
