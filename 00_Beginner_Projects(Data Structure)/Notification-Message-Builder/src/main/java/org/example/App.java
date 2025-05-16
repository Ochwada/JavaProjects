package org.example;


import org.example.assignments.NotificationBuilder;

/**
 * *******************************************************
 * Package: org.example
 * File: App.java
 * Author: Ochwada
 * Date: Wednesday, 14.May.2025, 10:36 AM
 * Description:
 * Objective:
 * *******************************************************
 */

public class App {
    public static void main(String[] args) {
        System.out.println(NotificationBuilder.buildNotificationSingleThreaded("Linda", "login"));
        System.out.println(NotificationBuilder.buildNotificationThreadSafe("Alex", "payment"));


    }
}
