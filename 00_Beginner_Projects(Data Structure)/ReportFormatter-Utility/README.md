# 📝 Assignment: **🗃️ ReportFormatter Utility**

## 🧩 Problem Background

You're working on a backend module that processes reports submitted by users or services. Each report contains:

* A **title** (may have inconsistent casing or spaces)
* A **body** (long text to format)
* An optional **tagline** or **footer**

Your task is to clean and structure this content using both:

* ✂️ `String` methods → for cleaning and validation
* 🧱 `StringBuilder` → to efficiently format the body
* 🧱 `StringBuffer` → to safely append footers when used concurrently

This simulates a backend utility in a report generation pipeline or logging system.

---

## 💬 Algorithmic Thinking Prompt

Ask yourself:

* Can I reuse cleaned content across multiple operations?
* What is best done using immutable vs mutable approaches?
* When do I need to preserve formatting, and when to standardize?

---

## ✅ Assignment Goals

Implement a utility class `ReportFormatter` with:

### 1. `cleanTitle(String rawTitle)`

→ Uses `String` methods only

🧪 Makes the title lowercase, trims spaces, replaces internal spaces with `-`

📘 Example: `"  Monthly Sales Report "` → `"monthly-sales-report"`


---

### 2. `formatBody(String[] paragraphs)`

→ Uses `StringBuilder`

🧪 Joins an array of paragraphs with spacing between

📘 Example:

```java
["Sales are strong.", "Marketing needs support."]
→ "Sales are strong.\n\nMarketing needs support."
```

---

### 3. `appendFooterThreadSafe(String reportBody, String footer)`

→ Uses `StringBuffer`

🧪 Appends footer safely to a body (multi-thread simulation friendly)

📘 Example:

```java
Original: "Final Q2 numbers submitted."  
Footer: "--- Confidential ---"  
→ "Final Q2 numbers submitted.\n--- Confidential ---"
```

---

## 🔧 Starter Code with Inline Guidance

```java
package com.example.assignment;

/**
 * 🧱 ReportFormatter combines String methods with StringBuilder & StringBuffer.
 */
public class ReportFormatter {

    /**
     * Cleans the report title using String methods only.
     *
     * - Remove leading/trailing whitespace
     * - Replace spaces with hyphens
     * - Convert to lowercase
     *
     * @param rawTitle the original, unformatted title
     * @return formatted title string
     */
    public static String cleanTitle(String rawTitle) {
        // TODO: Trim the title
        // TODO: Replace all internal spaces with "-"
        // TODO: Convert to lowercase
        return null;
    }

    /**
     * Combines multiple paragraphs into a single formatted report body.
     * Uses StringBuilder for efficient joining.
     *
     * - Paragraphs separated by two new lines (\n\n)
     *
     * @param paragraphs array of paragraph strings
     * @return single formatted body string
     */
    public static String formatBody(String[] paragraphs) {
        // TODO: Create StringBuilder
        // TODO: Loop through each paragraph
        // TODO: Append paragraph and two newlines if not last
        return null;
    }

    /**
     * Appends a footer to a report using StringBuffer for thread safety.
     *
     * @param reportBody the original report content
     * @param footer additional text to append (e.g., disclaimer)
     * @return full report with footer appended
     */
    public static String appendFooterThreadSafe(String reportBody, String footer) {
        // TODO: Create StringBuffer with reportBody
        // TODO: Append newline + footer
        // TODO: Return the string result
        return null;
    }
}
```

---

## 📂 Deliverables

* `ReportFormatter.java` with all three methods implemented
* Sample inputs/output can be printed in a `main()` method or tested via JUnit
* Use comments to explain your reasoning in each method

---

## 🔁 Sample Usage (in Demo or Tests)

```java
String title = ReportFormatter.cleanTitle("  Quarterly Inventory Review  ");
String body = ReportFormatter.formatBody(new String[] {
    "Warehouse stock has improved.",
    "Surplus expected in next month."
});
String report = ReportFormatter.appendFooterThreadSafe(body, "--- Reviewed by Ops ---");
```

---

## 📚 What You Practice

| Concept                  | Method                     |
| ------------------------ | -------------------------- |
| `trim()`, `replace()`    | `cleanTitle()`             |
| `StringBuilder.append()` | `formatBody()`             |
| `StringBuffer.append()`  | `appendFooterThreadSafe()` |

