package org.example.assignments;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * *******************************************************
 * Package: org.example.assignments
 * File: NotificationBuilder.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 8:58 AM
 * Description:  NotificationBuilder Assignment
 * Objective:  In real-world systems like notifications, we often need to build dynamic, formatted messages.
 *  You'll use StringBuilder and StringBuffer to do that efficiently.
 * *******************************************************
 */

public class NotificationBuilder
{
    /**
     * ✅ Task 1: Build a notification using StringBuilder (not thread-safe, but fast).
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "payment", "login", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationSingleThreaded(String recipient, String event) {
        StringBuilder builder = new StringBuilder();

        builder.append("Hi ").append(recipient).append(", ");
        builder.append("your ").append(event).append(" was successful. ");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        builder.append("Timestamp: ").append(timestamp).append(".");

        return builder.toString();
    }
    /**
     * ✅ Task 2: Build a thread-safe notification using StringBuffer.
     *
     * @param recipient the name of the user receiving the message
     * @param event     the type of event (e.g., "password reset", "signup", etc.)
     * @return formatted notification string
     */
    public static String buildNotificationThreadSafe(String recipient, String event) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Hello ").append(recipient).append(", ");
        buffer.append("this is to inform you that your ").append(event).append(" has been completed. ");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss");
        String timestamp = now.format(formatter);

        buffer.append("Generated at: ").append(timestamp).append(".");

        return buffer.toString();
    }

}
