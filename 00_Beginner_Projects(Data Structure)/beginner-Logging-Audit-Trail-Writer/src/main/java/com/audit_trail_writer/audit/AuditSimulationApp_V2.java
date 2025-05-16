package com.audit_trail_writer.audit;


import java.util.*;

import static com.audit_trail_writer.audit.AuditLogger.loggingTime;

/**
 * *******************************************************
 * Package: com.audit_trail_writer.audit
 * File: AuditSimulationApp_V2.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 4:54 PM
 * Description: Other main
 * Objective:
 * *******************************************************
 */

public class AuditSimulationApp_V2 {
    public static void main(String[] args) {
        // Simulated user actions or audit log messages
        List<String> messages = Arrays.asList(
                "\"User login successful.\"",
                "\"File uploaded to server.\"",
                "\"Unauthorized access attempt detected.\"",
                "\"Database backup completed.\"",
                "\"System shutdown initiated by admin.\""
        );

        // Start each thread immediately — no array allocation
        for (int i = 0; i < messages.size(); i++) {
            String threadName = String.format("LogThread-%02d", i + 1);
            Thread thread = new Thread(new AuditLogger(messages.get(i)), threadName);

            thread.start();
            try {
                thread.join(); // Wait for it to finish
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + threadName);
                Thread.currentThread().interrupt();
            }
        }

        // Final confirmation
        System.out.println(loggingTime() + ": ✅ All audit log threads have been started");
    }

}
