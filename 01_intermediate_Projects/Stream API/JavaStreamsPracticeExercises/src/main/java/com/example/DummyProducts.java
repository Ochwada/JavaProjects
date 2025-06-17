package com.example;


import java.util.*;

/**
 * *******************************************************
 * Package: com.example
 * File: DummyProducts.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 10:33 AM
 * Description: Dummy Products
 * Objective:
 * *******************************************************
 */


public class DummyProducts {

    public static List<Product> getSampleProducts() {
        return List.of(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Smartphone", "Electronics", 800.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Table", "Furniture", 300.0),
                new Product("Chair", "Furniture", 120.0),
                new Product("Sofa", "Furniture", 700.0),
                new Product("Refrigerator", "Appliances", 900.0),
                new Product("Microwave", "Appliances", 200.0),
                new Product("T-shirt", "Clothing", 25.0),
                new Product("Jeans", "Clothing", 50.0)
        );
    }

}
