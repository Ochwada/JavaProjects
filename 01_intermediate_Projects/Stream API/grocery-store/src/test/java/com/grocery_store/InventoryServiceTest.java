package com.grocery_store;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

/**
 * *******************************************************
 * Package: com.grocery_store
 * File: InventoryServiceTest.java
 * Author: Ochwada
 * Date: Friday, 13.Jun.2025, 12:06 PM
 * Description:
 * Objective:
 * *******************************************************
 */


public class InventoryServiceTest {
    private InventoryService service;
    private List<Product> sampleInventory;

    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Stating ... Tests...  ");
    }

    @BeforeEach
    void setUp() {
        System.out.println("\uD83D\uDD38 New Setup: Create a new object.");
        service = new InventoryService();

        sampleInventory = List.of(
                new Product("Milk", "Dairy", 1.50, 100, true),
                new Product("Bread", "Bakery", 2.00, 150, true),
                new Product("Apple", "Fruit", 0.80, 200, true),
                new Product("Rice", "Grains", 5.00, 50, false),
                new Product("Chicken", "Meat", 8.50, 80, true),
                new Product("Soap", "Household", 3.20, 120, false),
                new Product("TV", "Electronics", 450.00, 20, false)
        );

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✔\uFE0FTest Passed: 📃 " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("✅  .... ✨ Tests  Successfully Done ✨");
    }

    // -----------------------------------------------------
    // TESTS
    // -----------------------------------------------------

    @Test
    void testFilterLowStock() {
        List<Product> lowStock = service.filterLowStock(sampleInventory, 60);
        assertEquals(2, lowStock.size());
    }

    @Test
    void testCalculateTotalValue() {

        double expectedValue =
                1.50 * 100 +  // Milk
                        2.00 * 150 +  // Bread
                        0.80 * 200 +  // Apple
                        5.00 * 50 +   // Rice
                        8.50 * 80 +   // Chicken
                        3.20 * 120 +  // Soap
                        450.00 * 20;  // TV


        double totalValue = service.calculateTotalValue(sampleInventory);
        assertEquals(expectedValue, totalValue, 0.001);
    }

    @Test
    void testFindMostExpensive() {
        assertTrue(service.findMostExpensive(sampleInventory).isPresent());
        assertEquals("TV", service.findMostExpensive(sampleInventory).get().getName());
    }
}
