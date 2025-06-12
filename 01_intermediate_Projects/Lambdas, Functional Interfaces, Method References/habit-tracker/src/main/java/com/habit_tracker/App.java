package com.habit_tracker;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Create an instance of HabitProcessor to access filtering functionality.
        HabitProcessor processor = new HabitProcessor();

        /**
         * Create a list of Habit objects
         * Each Habit contains
         * - a name (String)
         * - a completedToday status (boolean)
         * - a category (String)
         * */
        List<Habit> habits = List.of(
                new Habit("Drink water", true, "Health"),
                new Habit("Morning run", false, "Fitness"),
                new Habit("Meditation", false, "Mindfulness"),
                new Habit("Sleep 8 hours", true, "Health")
        );

        /**
         * Use HabitProcessor's filterHabits() method to filter habits that are not done.
         * The lambda expression: habit -> !habit.isCompletedToday().
         * - Reads as: "Keep habits where isCompletedToday() returns false".
         * The method returns a new list of pending habits
         * */
        List<Habit> pendingHabits = processor.filterHabits(
                habits, habit -> !habit.isCompletedToday()
        );

        // Option 1: Print all habits using stream
        processor.processHabits(pendingHabits,
                habit -> System.out.println("Don't forget: " + habit ));

        // Option 2: Print all habits using stream
        System.out.println();
        processor.processHabits(pendingHabits,
                habit -> System.out.println("Don't forget: [" + habit.getName() + "]"));
    }
}
