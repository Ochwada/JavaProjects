## 🛒 **Java Console Project: Simulated Online Shop – Packaging & Checkout**

> Level: Beginner | Language: Java | Topics Covered: Scanner, Loops, Switch, Methods, Operators

---

## 📝 **Background & Story**

You’ve been hired by a small local business that’s starting an **online shop** 💻📦. They’re asking you to build a *
*terminal-based shopping assistant** that helps:

- Show a product list with prices
- Calculate total cost
- Apply discounts to expensive items
- Allow customers to skip items or cancel at any time
- Display final packing list and total after checkout

You're building a simple system that mimics an online store — using a **menu and `for` loops** to simulate adding items,
calculating totals, applying discounts, and showing summaries.

---

## 🚀 Project Overview

The user interacts with the program through a menu. Example:

```
=== TechStore Online Shop ===
1. View Available Items
2. Add Items to Cart
3. Checkout
4. Exit
Enter your choice:
```

---

## 📚 What You'll Practice

✅ Using `Scanner` to read user input  
✅ Building a menu using loops  
✅ Using `for` loops to iterate over items  
✅ Using `continue`, `break`, and `return`  
✅ Building and calling methods  
✅ Using switch-case logic  
✅ Simple price/discount calculations

---

## 🧭 **Step-by-Step Tasks (10 Total)**

---

### ✅ **Task 1: Welcome Message**

📌 *Goal: Create the main structure and greet the user*

- Create a new file: `OnlineShop.java`
- In your `main()` method, print a welcome message like:

```
Welcome to TechStore Online Shopping Assistant!
```

---

### ✅ **Task 2: Build a printMainMenu (do-while loop)**

📌 *Goal: Show the main menu using a loop until user exits*

- Use a `do-while` loop to repeatedly show this menu:
  ```
  === TechStore Online Shop ===
  1. View Available Items
  2. Add Items to Cart
  3. Checkout
  4. Exit
  ```
- Use `Scanner` to read user input (`int choice = scanner.nextInt();`)
- Loop continues until user selects option `4 (Exit)`
- Create a method `printMainMenu()` to keep the main method clean

🧠 **Where are the items stored?**

In this project, items and their prices are stored using **two parallel arrays**:

```java
String[] items = {"Mouse", "Keyboard", "Monitor", "Headphones", "Laptop"};
double[] prices = {15.99, 25.50, 149.99, 45.00, 850.00};
```

Each product's **name** and **price** share the **same index** in both arrays:

- `items[0]` is `"Mouse"` and `prices[0]` is `15.99`
- `items[4]` is `"Laptop"` and `prices[4]` is `850.00`

These arrays are declared at the top of the `main()` method (or globally if you need to reuse them). You will loop over
them using a `for` loop in future tasks to display or work with the products.


---

### ✅ **Task 3: Show Product List**

📌 *Goal: Use a `for` loop to display items with prices*

- Create two arrays:
  ```java
  String[] items = {"Mouse", "Keyboard", "Monitor", "Headphones", "Laptop"};
  double[] prices = {15.99, 25.50, 149.99, 45.00, 850.00};
  ```
- In option 1 (View Available Items), use a `for` loop to display:
  ```
  1. Mouse - $15.99
  2. Keyboard - $25.50
  ...
  ```

---

### ✅ **Task 4: Add Items to Cart with Loop**

📌 *Goal: Let user choose 3 items to add to cart*

- In option 2, ask the user 3 times:
  ```
  Select an item number (1-5) to add to cart:
  ```
- Use a `for` loop to process selections
- Track total cost in a `double total = 0.0` variable

---

### ✅ **Task 5: Use `continue` to Skip Items**

📌 *Goal: Skip adding item if price > $500 (too expensive)*

- Inside the `for` loop in Task 4:
    - If the selected item costs more than $500, print:
      ```
      ⚠️ Item too expensive. Skipping...
      ```
    - Use `continue;` to skip that item and go to the next selection

---

### ✅ **Task 6: Use `break` to Allow Exit During Loop**

📌 *Goal: Let user cancel adding items at any time*

- Before adding each item, ask:
  ```
  Do you want to cancel? (yes/no)
  ```
- If the user enters "yes", use `break;` to exit the loop early

---

### ✅ **Task 7: Add a Method to Show Cart Summary**

📌 *Goal: Use a method to print a summary after cart is filled*

- After adding items, call a method:
  ```java
  void showCartSummary(double total)
  ```
- Inside it, print:
  ```
  ✅ Your cart total is: $[total]
  ```

---

### ✅ **Task 8: Checkout (With `return`)**

📌 *Goal: Let user confirm checkout or cancel*

- In option 3 (Checkout):
    - If total = 0, print:
      ```
      🛒 Your cart is empty!
      ```
      Use `return;` to exit the method early.
    - If total > 0, ask:
      ```
      Confirm checkout? (yes/no)
      ```
        - If yes, print "🎉 Thank you for your purchase!"
        - If no, return to the menu

---

### ✅ **Task 9: Add Discounts in a Loop**

📌 *Goal: Apply 10% discount to items that cost more than $100*

- Modify the item-add loop:
    - If price > 100 → apply a 10% discount
  ```java
  double finalPrice = price;
  if (price > 100) {
      finalPrice = price * 0.9;
      System.out.println("💸 10% discount applied!");
  }
  total += finalPrice;
  ```

---

### ✅ **Task 10: Use Method Overloading for Cart Summary**

📌 *Goal: Add two versions of `showCartSummary()`*

- Version 1: `void showCartSummary(double total)`
- Version 2 (overloaded):
  ```java
  void showCartSummary(double total, int itemCount)
  ```
    - Print both total and number of items in cart.

- Bonus: use `ternary` to print:
  ```java
  String status = itemCount > 0 ? "Ready for checkout!" : "Cart is empty.";
  ```

---

## ✅ Submission Checklist

- [ ] Used `Scanner` for all input
- [ ] Built the menu using a `do-while` loop
- [ ] Used at least one `for` loop
- [ ] Used `continue;` to skip expensive items
- [ ] Used `break;` to cancel during loop
- [ ] Used `return;` to exit methods early
- [ ] Created at least 3 custom methods
- [ ] Used method overloading
- [ ] All 10 tasks are completed and working

---

## 📚 Resources

| Topic              | Resource Link                                                                    |
|--------------------|----------------------------------------------------------------------------------|
| Java Scanner Input | [W3Schools: Scanner](https://www.w3schools.com/java/java_user_input.asp)         |
| Java for Loops     | [Programiz: for loop](https://www.programiz.com/java-programming/for-loop)       |
| break / continue   | [Java Break & Continue](https://www.w3schools.com/java/java_break.asp)           |
| Java Methods       | [W3Schools: Methods](https://www.w3schools.com/java/java_methods.asp)            |
| Java Switch        | [GeeksForGeeks: Switch](https://www.geeksforgeeks.org/switch-statement-in-java/) |
| Ternary Operator   | [W3Schools: Ternary](https://www.w3schools.com/java/java_conditions.asp)         |

---

## 💬 Final Tip

This assignment simulates a **real-life e-commerce scenario**, and tests your ability to **use control structures to
guide user experience**, process input, and organize logic clearly.

Be creative. Handle invalid input. Add your personality to the messages. You’re building your first CLI online shop! 🛒
