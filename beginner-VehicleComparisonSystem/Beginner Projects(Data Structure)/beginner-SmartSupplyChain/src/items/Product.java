package items;


/**
 * *******************************************************
 * Package: items
 * File: Product.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:10 PM
 * Description: A base abstract class, core product hierarchy
 * Objective: Modeling diverse types of products.
 * *******************************************************
 */

public abstract class Product {
 private String id;
 private String name;

 // --- Constructor ---
 public Product(String id, String name) {
  this.id = id;
  this.name = name;
 }

 // --- Abstract method  to get Type ---
 public abstract String getType();

 @Override
 public String toString() {
  return "Product{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          '}';
 }

 // --- Getter and Setters---
 public String getId() {
  return id;
 }
 public void setId(String id) { this.id = id; }

 public String getName() {
  return name;
 }
 public void setName(String name) { this.name = name; }
}
