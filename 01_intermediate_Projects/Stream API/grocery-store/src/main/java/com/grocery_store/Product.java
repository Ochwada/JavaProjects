package com.grocery_store;


import java.util.Objects;

/**
 * *******************************************************
 * Package: com.grocery_store
 * File: Product.java
 * Author: Ochwada
 * Date: Friday, 13.Jun.2025, 9:38 AM
 * Description: It represents a product in the grocery store
 * Objective: POJO
 * *******************************************************
 */


public class Product {

    private  String name;
    private String category;
    private double price;
    private  int quantity;
    private boolean perishable;

    // Constructor
    public Product(String name,
                   String category,
                   double price,
                   int quantity,
                   boolean perishable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.perishable = perishable;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isPerishable() {
        return perishable;
    }

    /**
     * Returns a string representation of the product.
     *
     * @return a formatted string containing the product name, price in euros, and quantity.
     */
    @Override
    public  String toString(){
        return name + ": €" + price + " (Qty: " + quantity +")";
    }

    /**
     * Compares this product to the specified object.
     * Two products are considered equal if they have the same name.
     *
     * @param o the object to compare with.
     * @return true if the specified object is equal to this product; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // Only two Product objects of exactly the same class are allowed to be compared as equal
        if (o == null || getClass() != o.getClass()) return false;  // This ensures that o is exactly the same class as this.
        Product product = (Product) o;
        return  Objects.equals(name, product.name);
    }

}
