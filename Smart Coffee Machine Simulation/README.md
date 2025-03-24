### ☕ **Smart Coffee Machine Simulation**

---

## **Exercise: Build a Smart Coffee Machine**
#### **Objective:**  
Simulate a Smart Coffee Machine using Java. Practice defining and invoking methods, using method parameters and return types, applying naming best practices, and leveraging method overloading. You'll also explore how Java treats **primitive vs. reference types** when passed to methods.

---

### **Tasks**

### **1. Create the `CoffeeMachine` Class**

Define a Java class named `CoffeeMachine` with the following methods:

#### 📌 Basic Machine Behavior (Methods)
- `void displayMenu()`  
  → Prints available coffee options: Espresso, Americano, Latte.

- `void greetUser(String name)`  
  → Greets the user by name.

- `int calculateBrewTime(String coffeeType)`  
  → Returns estimated brew time based on coffee type.

#### 📌 Brewing Coffee (Overloaded Methods)
- `void brewCoffee(String type)`  
  → Brews coffee with default size and no milk.

- `void brewCoffee(String type, int sizeInMl)`  
  → Brews coffee with a specific size.

- `void brewCoffee(String type, int sizeInMl, boolean withMilk)`  
  → Brews a fully customized coffee.

### **2. Create the `Order` Class**
Represents an individual coffee order:
```java
public class Order {
    public String type;
    public int size;
    public boolean hasMilk;
    public String status;
}
```

### **3. Value vs Reference Demonstration**
In `CoffeeMachine`, add the following:

- `void updateOrderId(int id)`  
  → Tries to change a primitive value (showing no effect outside).

- `void updateOrderStatus(Order order)`  
  → Updates the order status to `"Ready"` (should persist, as objects are passed by reference).

### **4. `CoffeeMachineApp` Class**
Create a `main()` method to:

- Call all the overloaded `brewCoffee()` methods.
- Greet the user.
- Display the coffee menu.
- Print brew time.
- Demonstrate both **value and reference** types using the order and order ID.

---

### **Expected Output Example**
```
Welcome, Alice!
--- Menu ---
1. Espresso
2. Americano
3. Latte

Brewing Americano (Default)...
Brewing Latte (250ml)...
Brewing Espresso (150ml, with milk)...

Estimated brew time: 4 minutes

Original Order ID: 101
After updateOrderId: 101

Order status before: null
Order status after: Ready
```

---

## 📚 **References**

### Java Methods & OOP:
- [Methods in Java - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)  
- [Java Classes and Objects - JavaTPoint](https://www.javatpoint.com/java-oops-concepts)  

### Overloading, Parameters, and Memory:
- [Method Overloading - GeeksForGeeks](https://www.geeksforgeeks.org/method-overloading-in-java/)  
- [Value vs Reference in Java - Baeldung](https://www.baeldung.com/java-value-vs-reference)  

---

### 🚀 **Challenge Task (Optional)**
- Extend the `Order` class with `price` and `addOns` (like "extra shot", "vanilla").
- Add an overloaded `brewCoffee()` that accepts an `Order` object.
- Calculate total price based on size and add-ons.
- Return a receipt string.

---

### 🔥 **Bonus Fun Fact**
If we were coding this in **PHP**, method overloading wouldn’t even work properly without manually checking the number of arguments... Java wins again 😎
