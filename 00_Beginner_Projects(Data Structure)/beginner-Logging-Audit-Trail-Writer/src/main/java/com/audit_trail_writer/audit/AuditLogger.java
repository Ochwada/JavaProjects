package com.audit_trail_writer.audit;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * *******************************************************
 * Package: com.audit_trail_writer.audit
 * File: AuditLogger.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 2:37 PM
 * Description:  The {@code AuditLogger} class is a task that simulates writing a log entry asynchronously.
 * It implements Runnable so it can be executed by a Thread.
 * Objective:
 * *******************************************************
 */


public class AuditLogger implements Runnable {
    /**
     * Threads are ideal here because we want to simulate concurrent logging without blocking the main execution flow.
     */

    /**
     * A final field that stores the log message.
     * This message cannot be changed once the object is created.
     */
    private final String message;

    /**
     * Constructs an {@code AuditLogger} instance with the specified log message.
     *
     * @param message the log message to store; cannot be modified after construction
     */
    public AuditLogger(String message) {
        this.message = message;
    }

    /**
     * Returns the current date and time as a formatted string.
     * <p>
     * The format used is {@code "yyyy-MM-dd HH:mm:ss"}.
     * For example: {@code "2025-05-15 14:42:00"}.
     *
     * @return a string representing the current timestamp
     */
    public static String loggingTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return  "["+ now.format(formatter) + "]";
    }

    /**
     * The run method contains the logic for logging.
     * We simulate a delay using Thread.sleep() to mimic real-world logging latency.
     */
    @Override
    public void run() {

        // Simulates "logging is starting" by printing to console, along with the thread's name (for clarity in multithreaded runs).
        System.out.println(loggingTime() + " - Logging STARTED: " + message + " by " + Thread.currentThread().getName());

        // Catch an exception

        try {
            // Uses Thread.sleep() to simulate a delay in logging (1000 milliseconds)
            Thread.sleep(1000);
        }catch (InterruptedException e){

            // Prints an error message indicating the logging was interrupted
            System.err.println( loggingTime() + " - Logging of " + message + " interrupted at: " + loggingTime());

            // Resets the thread's interrupted status using Thread.currentThread().interrupt()
            Thread.currentThread().interrupt();
        }

        // Continues the simulation
        //System.out.println("Logging Finished:  {Created at: " + loggingTime() + "}, {User Action: " + message  + "}" + Thread.currentThread().getName());
        System.out.println(  loggingTime() + " - Logging FINISHED:  {User Action: " + message  + "} " + Thread.currentThread().getName() );

    }
}
