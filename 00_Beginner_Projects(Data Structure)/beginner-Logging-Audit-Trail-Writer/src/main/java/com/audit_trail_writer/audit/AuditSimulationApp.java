package com.audit_trail_writer.audit;


import java.util.Arrays;
import java.util.List;

import static com.audit_trail_writer.audit.AuditLogger.loggingTime;

/**
 * *******************************************************
 * Package: com.audit_trail_writer.audit
 * File: AuditSimulationApp.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 3:14 PM
 * Description: (Theory) In real systems, audit logs are often handled by a logging framework
 *  or background thread to avoid blocking user-facing processes.
 * Objective:
 * *******************************************************
 */

public class AuditSimulationApp {
    public static void main(String[] args) {

        // List of Strings to represent simulated user actions or audit log messages
        List<String> messages = Arrays.asList(
                "\"User login successful.\"",
                "\"File uploaded to server.\"",
                "\"Unauthorized access attempt detected.\"",
                "\"Database backup completed.\"",
                "\"System shutdown initiated by admin.\""
        );

        // Creating an array of threads, empty but same size of messages List
        Thread[]  threads = new Thread[messages.size()];

        // Loop through each action in the list
        for (int i = 0; i < messages.size(); i++){

            //  For each action, create an instance of AuditLogger with the action as the message
            AuditLogger auditLogger = new AuditLogger(messages.get(i)); // Not needed coz it assigns new memory

            // Creates a new Thread using the AuditLogger instance and give it a unique name using hashCode
            threads[i] = new Thread(auditLogger, "LogThread-00-"+ (i+1));

            threads[i].start();

        }

        // Starts the thread to simulate asynchronous logging
//        for (Thread thread : threads){
//            thread.start();
//        }

        // Uses join() to wait for the thread to finish (uncomment block to enable)
        for (Thread thread: threads){
            //thread.start();
            try {
                thread.join();
            }catch ( InterruptedException e){

                // If interrupted, print error and reset thread's interrupt flag
                System.err.println("Thread interrupted: " + thread.getName());
                Thread.currentThread().interrupt();
            }
        }
        // Final message
        System.out.println(loggingTime() + ": ✅ All audit log threads have been started"); // final confirmation
    }
}
