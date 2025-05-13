package items;


/**
 * *******************************************************
 * Package: items
 * File: Document.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:21 PM
 * Description: Concrete non-perishable product
 * Objective:
 * *******************************************************
 */

public class Document extends Product {

 public Document(String id, String name) {
  super(id, name);
 }

 @Override
 public String getType() {
  return  "Document";
 }

}
