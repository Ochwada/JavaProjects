## 🏷️ **Exercise Title:** “📢 Hashtag Formatter”

### 🧠 Theme: Social Media Post Formatting

> Imagine you're building a tool that formats hashtags for a social media platform. The platform requires hashtags to be:

* All lowercase
* Start with `#`
* Use hyphens (`-`) between words
* Max length: 50 characters (including the `#`)

---

## 🎯 Objective:

Create a method that takes a sentence and returns a properly formatted hashtag using `StringBuilder`.

---

## ✅ Example

```java
Input:  "  Java String Builder is Powerful  "
Output: "#java-string-builder-is-powerful"
```

---

## 📄 Starter Code

```java
package com.example.exercises;

/**
 * 📢 Hashtag Formatter using StringBuilder
 */
public class HashtagFormatter {

    /**
     * Converts a sentence to a hashtag-style string.
     *
     * @param sentence the original sentence
     * @return formatted hashtag or null if input is invalid
     */
    public static String formatHashtag(String sentence) {
        // Step 1: Trim the input
        sentence = sentence.trim();

        // Step 2: Split the sentence into words
        String[] words = sentence.split(" ");

        // Step 3: Use StringBuilder to build the result
        StringBuilder hashtag = new StringBuilder("#");

        // Step 4: Loop through each word
        for (String word : words) {
            if (!word.isEmpty()) {
                hashtag.append(word.toLowerCase()).append("-");
            }
        }

        // Step 5: Remove trailing hyphen if present
        if (hashtag.charAt(hashtag.length() - 1) == '-') {
            hashtag.deleteCharAt(hashtag.length() - 1);
        }

        // Step 6: Check for max length
        if (hashtag.length() > 50) {
            return null; // Hashtag too long
        }

        return hashtag.toString();
    }
}
```

---

## 🧪 Sample Test

```java
@Test
void testFormatHashtag() {
    assertEquals("#hello-world", HashtagFormatter.formatHashtag("Hello World"));
    assertEquals("#java", HashtagFormatter.formatHashtag("  Java   "));
    assertNull(HashtagFormatter.formatHashtag("This is a very long sentence that should go over the character limit for a hashtag"));
}
```

---

## 🔁 What Students Practice

* `StringBuilder.append()`
* `.toLowerCase()`
* `.trim()`, `.split()`
* `.deleteCharAt()`
* Conditional logic

