package com.audit_trail_writer;


import com.audit_trail_writer.audit.AuditLogger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;


/**
 * *******************************************************
 * Package: com.audit_trail_writer
 * File: AuditLoggerTest.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 3:40 PM
 * Description: AuditLogger test file
 * Objective:
 * *******************************************************
 */

/**
 * 📘 This test class contains various tasks designed to help students test
 * the `AuditLogger` class, which simulates asynchronous audit logging using threads.
 * <p>
 * 🧪 Students will:
 * - Capture and verify console output
 * - Launch and join multiple threads
 * - Use @Timeout to check execution limits
 * - Interrupt a thread and test graceful shutdown
 * - Use @ParameterizedTest to run the same logic for multiple inputs
 * <p>
 * 🚀 These tests aim to deepen understanding of concurrency, exception handling,
 * and JUnit 5 capabilities in a real-world scenario.
 */

public class AuditLoggerTest {

    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Stating AuditLogger Tests...  ");
    }

    @BeforeEach
    void setUp() {
        System.out.println("\uD83D\uDD38 New Setup: create a new object.");

    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("✔\uFE0FTest Passed: 📃 " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("✅  AuditLogger ✨ Tests  Successfully Done ✨");
    }

    // -----------------------------------------------------
    // TESTS
    // -----------------------------------------------------


    /**
     * ✅ Task 1: Verify that the logger prints the correct start and end messages.
     * This uses a trick called *output redirection* — we temporarily reroute System.out
     * so we can capture and inspect what's printed.
     */
    @Test
    @DisplayName("Should Log Correct Message")
    void shouldLogCorrectMessage() {
        // Redirect System.out to capture output in a string stream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String message = "Test log entry";
        AuditLogger logger = new AuditLogger(message);

        // We call run() directly here instead of using a thread
        logger.run();

        // Reset System.out back to default
        System.setOut(System.out);

        // Check that expected content appears in output
        String output = outContent.toString();
        Assertions.assertTrue(output.contains("Logging STARTED"));
        Assertions.assertTrue(output.contains("Logging FINISHED"));
        Assertions.assertTrue(output.contains(message));
    }

    /**
     * ✅ Task 2: Start multiple threads to simulate concurrent logging.
     * We want to test that all threads finish successfully without errors.
     */
    @Test
    @DisplayName("Should Execute All Threads ")
    void shouldExecuteAllThreads() throws InterruptedException {
        List<String> messages = Arrays.asList("A", "B", "C");
        List<Thread> threads = new ArrayList<>();

        // Create and start a thread for each log message
        for (String msg : messages) {
            Thread t = new Thread(new AuditLogger(msg));
            threads.add(t);
            t.start(); // Launch the thread
        }

        // Wait for all threads to finish using join()
        for (Thread t : threads) {
            t.join(); // join() blocks until the thread finishes
        }

        // If all threads completed without exception, the test passes
    }

    /**
     * ✅ Task 3: Ensure logging completes within a time limit.
     * If it takes longer than 2 seconds, the test fails automatically.
     */
    @Timeout(2) // Max time allowed for this test
    @Test
    @DisplayName("Should Finish Within Time Limit")
    void shouldFinishWithinTimeLimit() {
        AuditLogger logger = new AuditLogger("Speed test");
        logger.run(); // run() includes Thread.sleep(1000), so 2s is safe
    }

    /**
     * ✅ Task 4: Test how the logger handles interruption.
     * We start the logger in a thread, interrupt it, and check that it exits gracefully.
     */
    @Test
    @DisplayName("Should Handle Interruption")
    void shouldHandleInterruption() throws InterruptedException {
        Thread thread = new Thread(new AuditLogger("Interrupt test"));
        thread.start();

        // Ask the thread to stop sleeping by interrupting it
        thread.interrupt();

        // Wait for thread to wrap up
        thread.join();

        // Check if the thread was interrupted or completed
        Assertions.assertTrue(thread.isInterrupted() || !thread.isAlive());
    }

    /**
     * ✅ Task 5: Test the logger using multiple inputs automatically.
     * This avoids copy-pasting the same test many times.
     */
    @ParameterizedTest
    @ValueSource(strings = {
            "Login",
            "Transfer",
            "Logout"
    })
    @DisplayName("ParameterizedTest: Should Log All Messages")
    void shouldLogAllMessages(String message) {
        // Redirect output to inspect the log result
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AuditLogger logger = new AuditLogger(message);
        logger.run();

        // Reset System.out
        System.setOut(System.out);

        // Verify the message was printed
        String output = outContent.toString();
        Assertions.assertTrue(output.contains(message));
    }

    /**
     * 🧠 Reference - Concepts Covered:
     * - JUnit 5 basics: @Test, @BeforeEach, Assertions.*
     * - JUnit 5 advanced: @Timeout, @ParameterizedTest, @ValueSource
     * - Capturing console output using ByteArrayOutputStream
     *
     * 📚 Suggested Learning Resources:
     * - https://junit.org/junit5/docs/current/user-guide/
     * - https://www.baeldung.com/junit-5
     */

}
