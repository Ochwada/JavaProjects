package org.fleet;


import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * *******************************************************
 * Package: org.fleet
 * File: VehicleTest.java
 * Author: Ochwada
 * Date: Tuesday, 29.Apr.2025, 12:52 PM
 * Description:
 * Objective:
 * *******************************************************
 */

public class VehicleTest {

    private List<Vehicle> fleet;

    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Starting Vehicle Test...  ");
    }

    @BeforeEach
    void setUp() {
        fleet = new ArrayList<>();
        fleet.add(new Vehicle("Toyota", 2021, 20499.50));
        fleet.add(new Vehicle("Ford", 2018, 50000.00));
        fleet.add(new Vehicle("BMW", 2022, 56500.00));
        fleet.add(new Vehicle("Ford", 2022, 56500.00));
        fleet.add(new Vehicle("Honda", 2020, 47999.99));
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✔\uFE0FTest Passed: " + testInfo.getDisplayName());
    }
    // -----------------------------------------------------

    @Test
    @DisplayName("Vehicles should sort by year (newest first)")
    void testSortByYear() {
        Collections.sort(fleet);

        assertEquals("BMW", fleet.get(0).getBrand());
        assertEquals("Ford", fleet.get(1).getBrand());
        assertEquals("Toyota", fleet.get(2).getBrand());
        assertEquals("Honda", fleet.get(3).getBrand());
        assertEquals("Ford", fleet.get(4).getBrand());
    }

    @Test
    @DisplayName("Vehicles should sort by brand name alphabetically")
    void testSortByBrand() {
        fleet.sort(new VehicleBrandComparator());

        assertEquals("BMW", fleet.get(0).getBrand());
        assertEquals("Ford", fleet.get(1).getBrand());
        assertEquals("Ford", fleet.get(2).getBrand());
        assertEquals("Honda", fleet.get(3).getBrand());
        assertEquals("Toyota", fleet.get(4).getBrand());
    }


    @Test
    @DisplayName("Vehicles should sort by year and name if results == 0")
    void testSortByYearThenBrand(){
        fleet.sort(new VehicleYearComparator());
        assertEquals("Ford", fleet.get(0).getBrand());
        assertEquals("Honda", fleet.get(1).getBrand());
        assertEquals("Toyota", fleet.get(2).getBrand());
        assertEquals("BMW", fleet.get(3).getBrand());
        assertEquals("Ford", fleet.get(4).getBrand());

    }
    // -----------------------------------------------------

    @AfterAll
    static void afterAllTests(){
        System.out.println("✅ Vehicle Test Completed Successfully!");
    }

}
