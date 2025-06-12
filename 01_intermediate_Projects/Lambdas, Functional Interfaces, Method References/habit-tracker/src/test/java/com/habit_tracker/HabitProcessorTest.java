package com.habit_tracker;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************************************
 * Package: com.habit_tracker
 * File: HabitProcessorTest.java
 * Author: Ochwada
 * Date: Thursday, 12.Jun.2025, 3:13 PM
 * Description:
 * Objective:
 * *******************************************************
 */


public class HabitProcessorTest {
    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Stating HabitProcessor Tests...  ");
    }

    @BeforeEach
    void setUp() {
        System.out.println("\uD83D\uDD38 New Setup: Create a new object.");

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✔\uFE0FTest Passed: 📃 " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("✅  HabitProcessor ✨ Tests  Successfully Done ✨");
    }

// -----------------------------------------------------
// TESTS
// -----------------------------------------------------

    @Test
    @DisplayName("Test that the mapHabit() returns a list of names")
    public void mapHabitTest(){
        
    }
}
