# 🧠 Java String Methods Drill Sheet

## 📘 Overview

This exercise focuses on applying **core Java String methods** in realistic, algorithmic scenarios. Each task is a micro-problem that mimics challenges found in backend development, form validation, and natural language processing.

You'll use methods like `.toLowerCase()`, `.replaceAll()`, `.split()`, `.substring()`, `.equalsIgnoreCase()` and others — all while reinforcing clean logic and comments.

---

## 🧩 Problem Background

When processing user input, reports, or search queries, we often need to:
- Clean up or normalize text
- Format strings consistently
- Extract or detect specific patterns

This drill simulates these common challenges.

---

## 🎯 Goals

- Practice **basic and intermediate string manipulation**
- Use **multiple String methods in a meaningful context**
- Reinforce JavaDoc writing, inline documentation, and readable logic

---

## 🛠️ Tasks & Hints
[_first please use the starter code shared with you here_](https://github.com/FW-Zalando-Java-Backend-Engineer/Java-String-Methods-Drill-Sheet/blob/main/StringDrill.java)
### 1. `isPalindrome(String input)`
🧪 **Goal:** Check if the input is a palindrome.

🧠 **Algorithm Help:**
- Normalize the input: lowercase, remove spaces.
- Reverse the string using a loop or `StringBuilder`.
- Compare reversed with original.

📦 **Use Case:** Token validation, symmetry checks.

---

### 2. `replaceVowels(String input)`
🧪 **Goal:** Replace all vowels with `*`.

🧠 **Hint:** Use `String.replaceAll("[aeiouAEIOU]", "*")`

📦 **Use Case:** Content filtering, UI obfuscation.

---

### 3. `capitalizeWords(String sentence)`
🧪 **Goal:** Capitalize the first letter of each word.

🧠 **Steps:**
- Use `.split(" ")` to get words.
- Capitalize first character of each.
- Re-join using `StringBuilder`.

📦 **Use Case:** Title formatting, name normalization.

---

### 4. `countWordOccurrences(String sentence, String word)`
🧪 **Goal:** Count how many times a word appears (case-insensitive).

🧠 **Steps:**
- Normalize both sentence and word to lowercase.
- Use `.split(" ")` and loop to count exact matches.

📦 **Use Case:** Keyword analytics, sentiment scoring.

---

## ✅ Checklist Before Submission

- [ ] All methods are implemented.
- [ ] Each method includes inline comments.
- [ ] JavaDoc is complete and meaningful.
- [ ] Code is clean, readable, and builds successfully.
- [ ] Optional: Add unit tests to verify your methods.

---

## 🔗 References

- [Baeldung - Java String API](https://www.baeldung.com/java-string-api)
- [W3Schools - Java Strings](https://www.w3schools.com/java/java_strings.asp)
- [Oracle Java Docs - String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html)

---


Happy String wrangling! 🎯
