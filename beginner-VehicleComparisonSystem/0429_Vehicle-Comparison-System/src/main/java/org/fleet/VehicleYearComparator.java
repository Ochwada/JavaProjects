package org.fleet;


import java.util.Comparator;

/**
 * *******************************************************
 * Package: org.fleet
 * File: VehicleYearComparator.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 1:51 PM
 * Description:  multi-level comparator
 * Objective:
 * *******************************************************
 */

public class VehicleYearComparator implements Comparator<Vehicle> {


 @Override
 public int compare(Vehicle v1, Vehicle v2) {

  int yearComparison = Integer.compare(v1.getYear(), v2.getYear());
  if (yearComparison != 0) {
   return yearComparison; // sort by year first
  }
  return v1.getBrand().compareToIgnoreCase(v2.getBrand()); // sort by brand if years are equal
 }

}
