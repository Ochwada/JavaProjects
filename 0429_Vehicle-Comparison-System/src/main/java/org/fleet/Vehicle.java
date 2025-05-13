package org.fleet;


/**
 * *******************************************************
 * Package: org.fleet
 * File: Vehicle.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 12:43 PM
 * Description:
 * Objective: Vehicle class implementing Comparable
 * *******************************************************
 */

public class Vehicle implements Comparable<Vehicle>{

    private final String brand;
    private final int year;
    private  final double price;

    public  Vehicle(String brand,  int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;

    }

    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return  price;
    }


    /**
     * Natural order: sort by year (newest to oldest).
     */

    @Override
    public int compareTo(Vehicle other) {

        return Integer.compare(other.year, this.year); // Newest first
    }

    @Override
    public String toString() {
        return brand + " (" + year + "), Price: € " + price;
    }
}
