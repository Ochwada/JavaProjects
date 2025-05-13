package items;


/**
 * *******************************************************
 * Package: items
 * File: Electronics.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:33 PM
 * Description: Subclass representing electronic products
 * Objective:
 * *******************************************************
 */

public class Electronic extends Product{

 public Electronic(String id, String name) {
  super(id, name);
 }

 @Override
 public String getType() {
  return "Electronic";
 }
}
