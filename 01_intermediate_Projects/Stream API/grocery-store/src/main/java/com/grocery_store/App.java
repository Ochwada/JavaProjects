package com.grocery_store;

import java.util.List;

/**
 * Demo class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InventoryService service = new InventoryService();

        List<Product> inventory = List.of(
                new Product("Milk", "Dairy", 1.50, 100, true),
                new Product("Bread", "Bakery", 2.00, 150, true),
                new Product("Apple", "Fruit", 0.80, 200, true),
                new Product("Rice", "Grains", 5.00, 50, false),
                new Product("Chicken", "Meat", 8.50, 80, true),
                new Product("Soap", "Household", 3.20, 120, false),
                new Product("TV", "Electronics", 450.00, 20, false)
        );

        System.out.println("\nLow Stock (<60)");
        service.filterLowStock(inventory, 60).forEach(System.out::println);

        System.out.println("\nProduct Names (Uppercase, sorted)");
        service.getProductNamesUpper(inventory).forEach(System.out::println);

        System.out.println("\nGroup by Category");
        service.partitionByPerishable(inventory).forEach((k,v) -> {
            System.out.println(( k ? "Perishable " : "Non-Perishable") + " => " + v);
        });

        System.out.println("\nTotal Inventory Value");
        System.out.println("€ "  + service.calculateTotalValue(inventory));

        System.out.println("\nMost Expensive Product");
        System.out.println(service.findMostExpensive(inventory));


    }
}
