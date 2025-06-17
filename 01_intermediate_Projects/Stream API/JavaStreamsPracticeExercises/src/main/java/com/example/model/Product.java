package com.example.model;


import com.example.service.IdGenerator;

/**
 * *******************************************************
 * Package: com.example
 * File: Product.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 10:20 AM
 * Description: Model class (POJO) - Represents a product with a name, category, and price.
 * * This class provides information about a product, including its name, the category it belongs to, and its price.
 * * It is an immutable class — once a Product instance is created, its fields cannot be changed.
 * Objective:
 * *******************************************************
 */


public class Product {

    // Fields
    private final String id;
    private final String name;
    private final String category;
    private final double price;

    /**
     * Constructs a new Product instance with the given name, category, and price.
     *
     * @param name     the name of the product
     * @param category the category of the product
     * @param price    the price of the product
     */
    public Product(String name, String category, double price) {
        this.id = IdGenerator.generateProductId();
        this.name = name;
        this.category = category;
        this.price = price;
    }

    /**
     * Returns the id of the product.
     *
     * @return the product id
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the name of the product.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the category of the product.
     *
     * @return the product category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Returns the price of the product.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the product.
     *
     * @return a string describing the product
     */
    @Override
    public String toString() {
        return "\n[" +
                "id ='" + id + '\n' +
                "name='" + name + '\n' +
                "category='" + category + '\n' +
                "price=" + price
                + "]\n";
    }
}
