package com.grocery_store;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * *******************************************************
 * Package: com.grocery_store
 * File: InventoryService.java
 * Author: Ochwada
 * Date: Friday, 13.Jun.2025, 9:38 AM
 * Description: Contains methods that demonstrate intermediate and terminal steam operations.
 * Objective: class with only methods
 * *******************************************************
 */


public class InventoryService {

    /**
     * Filters products that have stock quantity below the specified minimum.
     *
     * @param inventory the list of products to filter
     * @param minQty    the minimum quantity threshold
     * @return a list of products with quantity less than minQty
     */

    public List<Product> filterLowStock(List<Product> inventory, int minQty) {
        return inventory
                .stream() // Convert list into Stream
                .filter(p -> p.getQuantity() < minQty) // Intermediate: filter products by quantity
                .toList(); // Terminal: collect results into a List
    }

    /**
     * Retrieves a list of product names in uppercase, with duplicates removed and sorted alphabetically.
     *
     * @param inventory the list of products
     * @return a list of distinct, sorted, uppercase product names
     */

    public List<String> getProductNamesUpper(List<Product> inventory) {
        return inventory.stream()  // Convert list into Stream
                .map(p -> p.getName().toUpperCase()) // Intermediate: transform names to uppercase
                .distinct() // Intermediate: remove duplicates
                .sorted() // Intermediate: sort alphabetically
                .toList(); // Terminal: collect results into a List

    }


    /**
     * Groups products by their category.
     *
     * @param inventory the list of products to group
     * @return a Map where the key is the product category and the value is the list of products in that category
     */

    public Map<String, List<Product>> groupByCategory(List<Product> inventory) {
        return inventory.stream() // Convert list into Stream
                .collect(Collectors.groupingBy(Product::getCategory)); // Terminal: group and collect into Map
    }

    /**
     * Partitions products into two groups: perishable and non-perishable.
     *
     * @param inventory the list of products to partition
     * @return a Map where:
     * - key `true` contains all perishable products
     * - key `false` contains all non-perishable products
     */
    public Map<Boolean, List<Product>> partitionByPerishable(List<Product> inventory) {
        return inventory.stream() // Convert list into Stream
                .collect(Collectors.partitioningBy(Product::isPerishable)); // Terminal: partition into two lists
    }

    /**
     * Calculates the total inventory value using Stream's reduce operation.
     * The total value is computed as the sum of (price * quantity) for each product.
     *
     * @param inventory the list of products to calculate total value for
     * @return the total value of all products in the inventory
     */
    public double calculateTotalValue(List<Product> inventory) {
        return inventory.stream() // Convert list into Stream
                .map(p -> p.getPrice() * p.getQuantity()) // Intermediate: For each product, calculate how much money it's worth
                .reduce(0.0, Double::sum); // Terminal: sum all values, starting from 0.0

    }
}
