package inventory;


import exception.*;

import java.util.*;

/**
 * *******************************************************
 * Package: inventory
 * File: StorageUnit.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 4:06 PM
 * Description: Containers for storing different item types
 * Objective: Working with Generic Classes
 * *******************************************************
 */

public class StorageUnit<T> {


    private final List<T> items;

    public StorageUnit() {
        this.items = new ArrayList<>();
    }


    /**
     * Adds a single item to the storage unit.
     *
     * @param item the item to add
     * @throws InvalidInputException if item is null or blank (for Strings)
     */

    public void addItem(T item) throws InvalidInputException {
        if (item == null) {
            throw new InvalidInputException("Forgot to add an Item? Please add one.");
        }

        if (item instanceof String) {
            String stringItem = ((String) item).trim();
            if (stringItem.isEmpty()) {
                throw new InvalidInputException("Blank string is not a valid item.");
            }
            items.add((T) stringItem); // Safe cast after trimming
        } else {
            items.add(item);
        }

        System.out.println(item + ": ✅ successfully added.");
    }

    /**
     * Adds a list of items to the storage unit.
     *
     * @param itemsToAdd list of items to add
     * @throws InvalidInputException if the list is null, empty, or contains invalid items
     */

    public void addItems(List<T> itemsToAdd) throws InvalidInputException {
        if (itemsToAdd == null || itemsToAdd.isEmpty()) {
            throw new InvalidInputException("The provided list is null or empty.");
        }

        for (T item : itemsToAdd) {
            addItem(item);
        }
    }


    /**
     * Returns all stored items.
     *
     * @return list of stored items
     * @throws EmptyStorageException if storage is empty
     */

    public List<T> getItems() throws EmptyStorageException {
        if (items.isEmpty()) {
            throw new EmptyStorageException("The shelf is empty.");
        }
        return new ArrayList<>(items); // Return a copy for safety
    }

    /**
     * Clears all items from the storage.
     */
    public void clearShelf() {
        items.clear();
        System.out.println("🧹 Shelf has been cleared.");
    }

    /**
     * Checks whether the storage is empty.
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Checks if a specific item exists in the storage.
     *
     * @param item item to check
     * @return true if found
     */
    public boolean containsItem(T item) {
        return items.contains(item);
    }

    /**
     * Gets an item at a specific index.
     *
     * @param index index of item
     * @return item at index
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public T getItem(int index) {
        return items.get(index);
    }

}
