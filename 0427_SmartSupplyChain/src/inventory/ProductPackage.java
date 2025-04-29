package inventory;


import items.Perishable;
import items.Product;

import java.util.*;

/**
 * *******************************************************
 * Package: inventory
 * File: Package.java
 * Author: Ochwada
 * Date: Friday, 25.Apr.2025, 2:32 PM
 * Description: Holds a collection of products.
 * Objective: generic class practice
 * *******************************************************
 */

public class ProductPackage<T extends Product>  {

    private List<T> products = new ArrayList<>();

    /**
     * T inside Package<T> is bounded to Product, if you want to enforce that all items inside
     * the package are products.
     * .
     * The Package class can work with any subtype of Product (like Perishable, Document, etc.)
     * But it ensures that only Product types go in — no String, Integer, or anything else.
     * **/

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    /**
     * 'instanceof' checks whether the object --product-- is an instance of the --Perishable class--.
     * Is the product an object belonnging to the class or subclass
     * **/
    public void validateProducts(int today) {
        for (T product : products) {
            if (product instanceof Perishable) {
                ((Perishable) product).validateExpiration(today);
            }
        }
    }







}
