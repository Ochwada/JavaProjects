package com.hashtag;

import com.hashtag.exercises.HashtagFormatter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *******************************************************
 * Package: com.hashtag
 * File: HashtagFormatterTest.java
 * Author: Ochwada
 * Date: Wednesday, 14.May.2025, 10:25 AM
 * Description:
 * Objective:
 * *******************************************************
 */

public class HashtagFormatterTest {

    @BeforeAll // JUnit runs this once before any test method in this class.
    static void beforeAllTests() {
        System.out.println("\uD83E\uDDFF Stating HashtagFormatter Tests...  ");
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
        System.out.println("✅  HashtagFormatter ✨ Tests  Successfully Done ✨");
    }

    // -----------------------------------------------------
    // TESTS
    // -----------------------------------------------------

    @Test
    @DisplayName("Give Sample Test")
    void testFormatHashtag() {
        assertEquals("#hello-world", HashtagFormatter.formatHashtag("Hello World"));
        assertEquals("#java", HashtagFormatter.formatHashtag("  Java   "));
        assertNull(HashtagFormatter.formatHashtag("This is a very long sentence that should go over the character limit for a hashtag"));
    }

    @Test
    @DisplayName("Formats basic two-word sentence")
    void testFormatHashtagBasic() {
        assertEquals("#hello-world", HashtagFormatter.formatHashtag("Hello World"));
    }

    @Test
    @DisplayName("Formats single word with extra spaces")
    void testFormatHashtagSingleWord() {
        assertEquals("#java", HashtagFormatter.formatHashtag("  Java   "));
    }

    @Test
    @DisplayName("❌ Returns null for overly long sentence")
    void testFormatHashtagTooLong() {
        String longSentence = "This is a very long sentence that should go over the character limit for a hashtag";
        assertNull(HashtagFormatter.formatHashtag(longSentence));
    }

    @Test
    @DisplayName("❌ Returns null for empty or null input")
    void testFormatHashtagEmptyInput() {
        assertNull(HashtagFormatter.formatHashtag("     "));
        assertNull(HashtagFormatter.formatHashtag(""));
        assertNull(HashtagFormatter.formatHashtag(null));
    }

//    @Test
//    @DisplayName("✅ Handles sentence at the 50-character limit")
//    void testFormatHashtagEdgeLength() {
//        String input = "This input is exactly within the max hashtag limit";
//        String output = HashtagFormatter.formatHashtag(input);
//        assertNotNull(output);
//        assertTrue(output.length() <= 50);
//    }



}
