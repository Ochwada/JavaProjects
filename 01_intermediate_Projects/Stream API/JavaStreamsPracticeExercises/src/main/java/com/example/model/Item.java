package com.example.model;


/**
 * *******************************************************
 * Package: com.example.model
 * File: Item.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 4:40 PM
 * Description:  Represents a shopping item with a name and price.
 * Objective:
 * *******************************************************
 */


public class Item {
    private final String name;
    private final double price;

    /**
     * Constructs a new {@code Item} instance with the provided name and price.
     *
     * @param name  the name of the item (e.g. "Laptop")
     * @param price the price of the item (e.g. 1200.0)
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the item, including its name and price.
     *
     * @return formatted string of item details
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

