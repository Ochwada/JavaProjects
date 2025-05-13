package org.fleet;


import java.util.*;

/**
 * *******************************************************
 * Package: org.fleet
 * File: VehicleBrandComparator.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 12:43 PM
 * Description:
 * Objective: Custom comparator to sort by brand
 * *******************************************************
 */

public class VehicleBrandComparator implements Comparator<Vehicle> {


 @Override
 public int compare(Vehicle v1, Vehicle v2){
  return v1.getBrand().compareToIgnoreCase(v2.getBrand());
 }






}
