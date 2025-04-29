package main;


import exception.*;
import inventory.*;
import items.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * *******************************************************
 * Package: main
 * File: SmartSupplyChainApp.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:47 PM
 * Description: Entry point: simulation, flow orchestration
 * Objective: Glue everything together, simulate operations, and catch exceptions gracefully.
 * *******************************************************
 */

public class SmartSupplyChainApp {
    public static void main(String[] args) {

        /**  Task 1: Model the Core Product Hierarchy **/

        System.out.println(" ****  Product **** ");

        Product doc = new Document("PRO1", "Passport Form");
        Product phone = new Electronic("PRO2", "Smartphone");
        Perishable milk = new Perishable("PRO3", "Milk", 120);

        System.out.println("Type: " + doc.getType() + " -->  Name: " + doc.getName());
        System.out.println("Type: " + phone.getType() + " -->  Name: " + phone.getName());
        System.out.println("ID: " + milk.getId() + " --> Type: " + milk.getType() + " -->  Name: " + milk.getName());
        System.out.println(milk.isExpired(100));

        System.out.println();
        /** Task 2: Build a Generic Storage Unit **/


        StorageUnit<String> shelf = new StorageUnit<>();

        try {
            System.out.println(" ****  Storage **** ");
            // Add items
            try {
                shelf.addItem("Laptop");
                shelf.addItem("Watch ");
                shelf.addItem("Phone");

                // Add multiple items
                shelf.addItems(Arrays.asList("Desktop", "Phone Charger", "  Keyboard  "));

            } catch (InvalidInputException e) {
                System.out.println("[Error]: " + e.getMessage());
            }

            //  Print items BEFORE handling errors or clearing
            try {
                System.out.println("\n📦 ----- Items on the shelf ----- ");
                for (String item : shelf.getItems()) {
                    System.out.println("🔸 " + item);
                }
            } catch (EmptyStorageException e) {
                System.out.println("[Error]: " + e.getMessage());
            }
            System.out.println();

            // --- Dealing with NULL adds
            try {
                shelf.addItem(null);
            } catch (InvalidInputException e) {
                System.out.println("[Error]: " + e.getMessage());
            }

            // --- Dealing with EMPTY adds
            try {
                shelf.addItem("");
            } catch (InvalidInputException e) {
                System.out.println("[Error]: " + e.getMessage());
            }

            // Clear the shelf
            shelf.clearShelf();

            System.out.println();


        } finally {
            System.out.println("===== Thanks for using ⛓\uFE0F XmartChain ===== ");
        }
        /** Task 3: Create Packages and Inventory System **/

        System.out.println();
        // Create Products
        Document doc1 = new Document("D1", "User Manual");
        Electronic phone1 = new Electronic("E1", "Smartphone");
        Perishable milk1 = new Perishable("P1", "Milk", 5); // expires on day 5
        Perishable bread = new Perishable("P2", "Bread", 10); // expires on day 10

        // Create Package<Product> and add products
        ProductPackage<Product> mixedPackage = new ProductPackage<>();
        mixedPackage.addProduct(doc1);
        mixedPackage.addProduct(doc);
        mixedPackage.addProduct(phone1);
        mixedPackage.addProduct(phone);
        mixedPackage.addProduct(milk1);
        mixedPackage.addProduct(bread);

        System.out.println("📦 Package contents:");
        for (Product p : mixedPackage.getProducts()) {
            System.out.println(" - " + p);

        }

    }

}
