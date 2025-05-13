## 🧑‍💻 **Java Console Project: Simulated Customer Support Portal (Text-Based)**  
> Level: Beginner | Language: Java | Topics Covered: Scanner, Loops, Switch, Methods, Operators

---

## 📝 **Background & Story**

Imagine you're working for a small startup that’s just launched a product 🧑‍💻. Since they can’t afford a fancy web-based customer support system yet, they ask **you** (a Java developer-in-training) to build a **simple terminal-based Customer Support Portal** to manage basic customer service actions:

- Allow users to submit one support request at a time
- Let them check the status of their ticket
- Allow them to close the ticket when resolved

This program should be fully text-based and work from the terminal using **menus**, **methods**, and **simple logic**.

You’ll build this step by step.

---

## 🚀 Project Overview

The user will interact with your program through a **menu** using numbers. For example:

```
=== Customer Support Portal ===
1. Submit New Request
2. View Request Status
3. Close Request
4. Exit
Enter your choice:
```

---

## 📚 What You'll Practice

✅ Using `Scanner` for input  
✅ Creating and calling methods  
✅ Using `switch`, `if-else`, `logical` and `ternary` operators  
✅ Using `while` and `do-while` loops  
✅ Method overloading  
✅ Applying control structures in a real-world context

---

## 🧭 **Step-by-Step Tasks (10 Total)**

---

### ✅ **Task 1: Welcome Message**
📌 *Goal: Create the structure and greet the user*

- Create a new file: `CustomerSupportPortal.java`
- In your `main()` method, print a welcome message like:

```text
Welcome to TechStart Customer Support Portal!
```

---

### ✅ **Task 2: Build a Menu (using do-while loop)**
📌 *Goal: Keep asking the user what they want to do until they exit*

- Show this menu in a loop using `do-while`:
```text
=== Customer Support Menu ===
1. Submit New Request
2. View Request Status
3. Close Request
4. Exit
```
- Use `Scanner` to get input from the user.
- Repeat the menu until the user chooses option 4.

📘 **Hint:** Create a `printMenu()` method to display the menu.

---

### ✅ **Task 3: Track Request Status**
📌 *Goal: Use variables to track whether a support request exists or not*

- Declare a boolean variable `hasOpenRequest = false`
- Declare an integer `requestId = 1001` to give each request a unique number.
- Update these variables based on the user's actions.

---

### ✅ **Task 4: Handle Choices using `switch`**
📌 *Goal: Use switch to handle what happens when the user chooses an option*

Inside your loop:

- Use a `switch` to check `userChoice`.
- Case 1 → Submit new request
- Case 2 → View status
- Case 3 → Close request
- Case 4 → Exit
- Default → Print “Invalid option, try again.”

---

### ✅ **Task 5: Submit a Request (Case 1)**
📌 *Goal: Ask the user for a problem description and show confirmation*

- Only allow one request at a time (if `hasOpenRequest == true`, show warning)
- Otherwise:
  - Ask: `Please describe your issue:`
  - Store request description in a `String`
  - Set `hasOpenRequest = true`
  - Increment `requestId`
  - Show message:  
    ```
    Request #1001 has been submitted.
    ```

---

### ✅ **Task 6: View Request Status (Case 2)**
📌 *Goal: Display info based on whether there's an active request*

- Use an `if` statement:
  - If `hasOpenRequest` is `true`, print:
    ```
    Your request (#1001): <description> — Status: Open
    ```
  - If not, print:
    ```
    No active support request found.
    ```

---

### ✅ **Task 7: Close Request (Case 3)**
📌 *Goal: Allow the user to close the request and update the status*

- If `hasOpenRequest == true`:
  - Set it to `false`
  - Print:
    ```
    Request #1001 has been marked as resolved. Thank you!
    ```
- If not, print:
  ```
  No request to close.
  ```

---

### ✅ **Task 8: Add Method with Return Value**
📌 *Goal: Create a method `boolean hasRequestOpen()` that returns the current status*

- This method should return the value of `hasOpenRequest`
- Use it inside the switch instead of directly checking the variable

---

### ✅ **Task 9: Add Overloaded Method `printStatus()`**
📌 *Goal: Practice method overloading*

- Create two methods:
  - `void printStatus()` → prints “No requests yet.”
  - `void printStatus(int id, String description)` → prints request info

- Use `if (hasRequestOpen())` to decide which version to call.

---

### ✅ **Task 10: Use a Ternary Operator**
📌 *Goal: Print a status message in one line using the ternary operator*

- Example:
```java
String status = hasRequestOpen() ? "Open" : "Closed";
System.out.println("Ticket status: " + status);
```

Use this when viewing the ticket in Case 2.

---

## ✅ Submission Checklist

- [ ] Used `Scanner` for all input
- [ ] Used a `do-while` loop for the menu
- [ ] Used `switch` and `if-else` to process logic
- [ ] Created at least 3 custom methods
- [ ] Used method overloading
- [ ] Used ternary operator at least once
- [ ] All 10 tasks are completed and working

---

## 📚 Resources

| Topic               | Resource Link |
|--------------------|----------------|
| Scanner             | [W3Schools: Scanner](https://www.w3schools.com/java/java_user_input.asp) |
| do-while Loops      | [Programiz: do-while](https://www.programiz.com/java-programming/do-while-loop) |
| Switch Statements   | [GeeksForGeeks: Switch](https://www.geeksforgeeks.org/switch-statement-in-java/) |
| Java Methods        | [W3Schools: Methods](https://www.w3schools.com/java/java_methods.asp) |
| Ternary Operators   | [W3Schools: Ternary](https://www.w3schools.com/java/java_conditions.asp) |

---

## 💬 Final Tip:

This isn't just about code — it's about simulating **real-life problem solving** using the tools you've learned. Be creative, handle edge cases, and test thoroughly! ✅
