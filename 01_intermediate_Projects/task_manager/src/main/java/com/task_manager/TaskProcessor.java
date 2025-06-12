package com.task_manager;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * *******************************************************
 * Package: com.task_manager
 * File: TaskProcessor.java
 * Author: Ochwada
 * Date: Thursday, 12.Jun.2025, 9:47 AM
 * Description: (Functional Engine) Processes a list of tasks using functional programming constructs.
 * Objective: Function class (functional Programming)
 * *******************************************************
 */


public class TaskProcessor {
    /**
     * Filters a list of tasks based on a provided condition.
     *
     * <p>This method takes a list of {@link Task} objects and a filtering condition represented by a {@link Predicate}.
     * It uses Java Stream API to process the list in a functional style.</p>
     *
     * <p>The {@code Predicate<Task>} parameter represents a condition that evaluates each task. If the condition returns
     * {@code true}, the task will be included in the final result; if {@code false}, the task will be excluded.</p>
     *
     * <p>Examples of possible conditions you can pass:</p>
     * <pre>{@code
     * // Filter completed tasks
     * filterTasks(taskList, task -> task.isCompleted());
     *
     * // Filter tasks with high priority
     * filterTasks(taskList, task -> task.getPriority() > 5);
     *
     * // Filter tasks due today
     * filterTasks(taskList, task -> task.isDueToday());
     * }</pre>
     *
     * @param tasks     the full list of tasks to be filtered. Must not be {@code null}.
     * @param condition the filtering condition applied to each task. Must not be {@code null}.
     * @return a list containing only tasks that match the given condition. Never {@code null}.
     * @throws NullPointerException if either {@code tasks} or {@code condition} is {@code null}.
     */
    public List<Task> filterTasks(List<Task> tasks, Predicate<Task> condition) {

        /**
         * Stream processing steps:
         *
         * 1️⃣ Convert the list into a Stream:
         *    tasks.stream()
         *    → Allows functional-style processing.
         * 2️⃣ Apply filtering operation:
         *    .filter(condition)
         *    → Only elements matching the predicate are allowed through.
         * 3️⃣ Collect the results into a new List:
         *    .collect(Collectors.toList())
         *    → Convert the Stream back to a List.
         */

        if (condition == null) {
            throw new NullPointerException("Tasks list and condition predicate must not be null");
        } else if (tasks == null) {
            System.out.println("No tasks in the List");
        }

        assert tasks != null;

        return tasks.stream()
                .filter(condition)
                .collect(Collectors.toList());


    }

    /**
     * Transforms a list of tasks into a list of strings using a provided mapping function.
     *
     * <p>
     * This method applies the provided {@link Function} to each {@link Task} object in the input list,
     * producing a new list containing the resulting string values.
     * </p>
     *
     * <p>
     * The mapping function defines how each {@code Task} should be transformed into a {@code String}.
     * This allows for flexible extraction of different task properties such as:
     * </p>
     *
     * <ul>
     *   <li>Task descriptions: {@code Task::getDescription}</li>
     *   <li>Task priorities as string: {@code task -> String.valueOf(task.getPriority())}</li>
     *   <li>Custom string formats: {@code task -> task.getDescription() + " (Priority: " + task.getPriority() + ")"}</li>
     * </ul>
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>{@code
     * List<String> descriptions = processor.mapTasks(tasks, Task::getDescription);
     * }</pre>
     *
     * @param tasks  the list of tasks to be transformed; must not be {@code null}.
     * @param mapper the mapping function that converts each task into a string; must not be {@code null}.
     * @return a list of strings produced by applying the mapper to each task in the input list.
     * @throws NullPointerException if {@code tasks} or {@code mapper} is {@code null}.
     */

    public List<String> mapTasks(List<Task> tasks, Function<Task, String> mapper) {
        return tasks
                .stream()
                .map(mapper)
                .collect(Collectors.toList());

    }


}

