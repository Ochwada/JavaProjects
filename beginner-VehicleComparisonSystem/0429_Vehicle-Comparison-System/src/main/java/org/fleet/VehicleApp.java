package org.fleet;


import java.util.*;

/**
 * *******************************************************
 * Package: org.fleet
 * File: App.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 12:35 PM
 * Description: Creating a Vehicle class, sort vehicles naturally by year (newest first)
 * and by brand name alphabetically using a custom comparator. Printing the
 * vehicles nicely using forEach(System.out::println), and test sorting with JUnit 5.
 * Objective: Manage a fleet of vehicles and sort them
 * *******************************************************
 */

public class VehicleApp {
    public static void main(String[] args) {

     List<Vehicle> fleet = new ArrayList<>();
     fleet.add(new Vehicle("Toyota", 2021, 20499.50));
     fleet.add(new Vehicle("Ford", 2018, 50000.00));
     fleet.add(new Vehicle("BMW", 2022, 56500.00));
     fleet.add(new Vehicle("Ford", 2022, 56500.00));
     fleet.add(new Vehicle("Honda", 2020, 47999.99));

     System.out.println(" \uD83D\uDE97 === Original Fleet === ");
     fleet.forEach(System.out::println);

     // Sort by year (natural)
     Collections.sort(fleet);
     System.out.println("\n⬇\uFE0F Sorted by Year (Newest First):");
     fleet.forEach(System.out::println);

     // Sort by brand name
     fleet.sort(new VehicleBrandComparator());
     System.out.println("\n⬇\uFE0F Sorted by Brand (Alphabetical):");
     fleet.forEach(System.out::println);

     // Sort by year and brand name
     fleet.sort(new VehicleYearComparator());
     System.out.println("\n⬇\uFE0F Sorted by Year then Brand (Alphabetical):");
     fleet.forEach(System.out::println);

    }
}
