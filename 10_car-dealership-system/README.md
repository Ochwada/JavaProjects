# 📘 **Assignment: Mastering Instance and Static Variables in Java**

---

## 🧱 **🧠 Background**

In this assignment, you’ll design a mini Java project to **simulate a car dealership system**. You’ll be practicing how to manage:

- 🔹 **Instance variables**: data unique to each car (like brand, model, price)
- 🔹 **Static variables**: data shared across all cars (like dealership name or counters)
- 🔹 **Static methods and blocks**
- 🔹 Object memory concepts and class structure

By completing this exercise, you'll solidify your understanding of **object-oriented design**, and learn when and why to use static vs instance variables.

---

## 📂 **Project Structure**

```
car-dealership/
├── src/
│   ├── Car.java                 # The main Car class
│   ├── DealershipApp.java       # The main application runner
│   ├── DealerStats.java         # (Later task) Tracks dealership-wide stats using static members
│   └── README.md                # Assignment instructions and overview
```

---

## ✅ **Assignment Tasks**

---

### 🔧 **Task 1: Define the `Car` class with Instance Variables**

> 🎯 Create a `Car` class with instance variables: `brand`, `model`, `year`, and `price`.

- Use a constructor to initialize all fields.
- Add a `displayInfo()` method to print details of a car.

---

### 🔧 **Task 2: Create Car Objects in `DealershipApp`**

> 🎯 Create at least 3 `Car` objects with different data in the main app, and print their info.

- Observe how each object has **its own state** (brand, model, etc.).

---

### 🔧 **Task 3: Add Static Variable for Dealer Name**

> 🎯 Add a static variable `dealerName` in the `Car` class. Initialize it with `"Global Motors"`.

- Print the dealer name in the `displayInfo()` method.
- Change it from the main method and print it again from multiple objects.

---

### 🔧 **Task 4: Track Total Cars Created with Static Counter**

> 🎯 Add a static variable `totalCarsCreated` that increments in the constructor.

- Add a static method `getTotalCarsCreated()` and print the total after creating several cars.

---

### 🔧 **Task 5: Add Static Block to Initialize Dealer**

> 🎯 Use a static block to initialize `dealerName` and print a message when it runs.

- Demonstrate how it executes **only once** when the class is loaded.

---

### 🔧 **Task 6: Modify Car Price Using Instance Method**

> 🎯 Add a method `setPrice(double newPrice)` that updates the price if it’s greater than zero.

- Use this method in the main class to simulate a price update.

---

### 🔧 **Task 7: Add Discount Feature**

> 🎯 Add a method `applyDiscount(double percent)` to reduce price based on percentage.

- Example: 10% discount on $20,000 → new price = $18,000.

---

### 🔧 **Task 8: Add Depreciation Calculation**

> 🎯 Add a method `depreciate(int currentYear)` that decreases the price by 10% for every year of age.

- Calculate how old the car is and apply the depreciation.

---

### 🔧 **Task 9: Create `DealerStats` Utility Class with Static Methods**

> 🎯 Create a class `DealerStats` with static methods like `printWelcomeMessage()` and `printSummary()`.

- This class should not require instantiation.
- Show how static methods can be accessed without an object.

---

### 🔧 **Task 10: Advanced – Change Dealer Name via Static Method**

> 🎯 Add a static method `setDealerName(String name)` in the `Car` class to update the dealer name.

- Show that changing it updates the value for all existing objects.

---

## 📚 References & Learning Material

Here are trusted sources to support your learning:

### 🔸 Instance vs Static Variables

- 📘 [JavaGuides: Static vs Instance Variables](https://www.javaguides.net/2023/11/static-variable-vs-instance-variable-in-java.html#google_vignette)
- 📘 [FreeCodeCamp: Static Variables in Java](https://www.freecodecamp.org/news/static-variables-in-java/)
- 📘 [Medium: Instance and Static Variables Demystified](https://medium.com/@barbieri.santiago/understanding-static-and-instance-variables-in-java-f53173cabe8c)

### 🔸 Static Methods & Blocks

- 📘 [Baeldung: Static in Java](https://www.baeldung.com/java-static)
- 📘 [Baeldung: Static and Instance Initializer Blocks](https://www.baeldung.com/java-static-instance-initializer-blocks)

### 🔸 Java Object Lifecycle & Memory

- 📘 [Oracle Docs: Java Language Spec – Object Lifecycle](https://docs.oracle.com/javase/specs/jls/se17/html/jls-12.html)
- 📘 [GeeksForGeeks: Java Memory Management](https://www.geeksforgeeks.org/java-memory-management/)

---

## 🚀 Submission

This project will be distributed using **GitHub Classroom**.  
You’ll receive a personal repository to complete and push your code.

✅ Follow the folder structure.  
✅ Include inline comments where needed.  
✅ Push before the deadline.  
✅ Put your name in a comment at the top of each `.java` file.
