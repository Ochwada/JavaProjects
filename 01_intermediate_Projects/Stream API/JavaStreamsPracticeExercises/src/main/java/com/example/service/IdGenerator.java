package com.example.service;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * *******************************************************
 * Package: com.example.service
 * File: IdGenerator.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 2:21 PM
 * Description: Utility class for generating unique IDs with prefixes.
 * Objective:
 * *******************************************************
 */


public class IdGenerator {

    private static final AtomicInteger projectCounter = new AtomicInteger(1);
    private static final AtomicInteger employeeCounter = new AtomicInteger(1);
    private static final AtomicInteger eventsCounter = new AtomicInteger(1);
    private static final AtomicInteger taskCounter = new AtomicInteger(1);
    private static final AtomicInteger movieCounter = new AtomicInteger(1);
    private static final AtomicInteger productCounter = new AtomicInteger(1);
    private static final AtomicInteger authorCounter = new AtomicInteger(1);
    private static final AtomicInteger bookCounter = new AtomicInteger(1);


    /**
     * Generates a new Event ID in format EM-xxxxx
     */
    public static String generateProjectId(){
        return String.format("PROJ-%05d", projectCounter.getAndIncrement());
    }

    /**
     * Generates a new Event ID in format EM-xxxxx
     */
    public static String generateEmployeeId(){
        return String.format("EM-%05d", employeeCounter.getAndIncrement());
    }

    /**
     * Generates a new Event ID in format EVENTxxx
     */
    public static String generateEventsId(){
        return String.format("EVENT%03d", eventsCounter.getAndIncrement());
    }

    /**
     * Generates a new task ID in format TASK-xxx
     */
    public static String generateTaskId(){
        return String.format("TASK-%03d", taskCounter.getAndIncrement());
    }

    /**
     * Generates a new movie ID in format MOV-xxx
     */
    public static String generateMovieId(){
        return String.format("MOV-%03d", movieCounter.getAndIncrement());
    }

    /**
     * Generates a new Product ID in format PRO-xxxxx
     */
    public static String generateProductId(){
        return String.format("PRO-%05d", productCounter.getAndIncrement());
    }


    /**
     * Generates a new Author ID in format AUT-xxxxx
     */
    public static String generateAuthorId() {
        return String.format("AUT-%05d", authorCounter.getAndIncrement());
    }

    /**
     * Generates a new Book ID in format BOOK-xxxxx
     */
    public static String generateBookId() {
        return String.format("BOOK-%05d", bookCounter.getAndIncrement());
    }

}
