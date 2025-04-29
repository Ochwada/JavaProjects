package items;


import exception.ExpiredProductException;

/**
 * *******************************************************
 * Package: items
 * File: Perishable.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:36 PM
 * Description: Products that expire
 * Objective:
 * *******************************************************
 */

public class Perishable extends Product{
 private int expirationDay;

 public Perishable(String id, String name, int expirationDay){

  super(id, name);
  this.expirationDay = expirationDay;
 }

 @Override
 public String getType() {
  return "Perishable";
 }

 public boolean isExpired(int today) {
  System.out.print("Expired: ");
  return today > getExpirationDay();
 }

 public void validateExpiration(int today) {
  if (isExpired(today)) {
   throw new ExpiredProductException("Product expired: " + toString());
  }
 }

 // --- Getter ---
 public int getExpirationDay() {
  return expirationDay;
 }

 public void setExpirationDay(int expirationDay) {
  this.expirationDay = expirationDay;
 }

}
