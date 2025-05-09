package inventory;


import items.Perishable;
import items.Product;

import java.util.*;


/**
 * *******************************************************
 * Package: inventory
 * File: Inventory.java
 * Author: Ochwada
 * Date: Friday, 25.Apr.2025, 2:36 PM
 * Description: Inventory<T> class containing a Map<String, Package<T>> to associate package IDs to their contents.
 * Objective: Generic class and Maps
 * *******************************************************
 */

public class Inventory <T extends Product>{

    private final Map <String, ProductPackage<T>> database = new HashMap<>();


    public void addPackage(String packageId, ProductPackage<T> productPackage) {
        database.put(packageId, productPackage);
    }

    public ProductPackage<T> getPackage(String packageId) {
        return database.get(packageId);
    }


    /***
     *  A way to create a method argument that
     * can accept an ArrayList of any subtype of types
     * .
     * .
     * // Print inventory using a method that accepts 'wildcards'
     * */

    // Print a list of products (accepts any subtype of Product)
    public void printInventory(int today){
        // Go through each package in the inventory
        for (String packageId : database.keySet()){
            System.out.println("Package ID. " + packageId);

            ProductPackage<T> pkg = database.get(packageId);
            List<T> products = pkg.getProducts();

            for (T product : products){
                // Check if the product is perishable and validate
                if ( product instanceof Perishable){
                    ((Perishable) product).validateExpiration(today);
                }
                System.out.println("-" + product);
            }


        }

    }



}
