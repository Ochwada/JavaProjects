# 🏛️ **Smart City Utility Portal – Java Project Assignment**

### 🎯 **Real-Life Theme:**  
Imagine you're building a **Smart City Utility Portal**, which handles **user authentication, electricity billing, unit conversions, control panels**, and **reporting features** for residents and administrators.

This project tests your Java understanding across:

- Numeral systems  
- Data types, variables, math operations  
- Logical & relational operators  
- Control flow (`if`, `switch`, `ternary`)  
- Methods, parameters, overloading, return values  
- Reference vs. primitive behavior  

---

## 📦 Suggested GitHub Structure:

```
SmartCityUtilityPortal/
├── src/
│   ├── LoginSystem.java
│   ├── UnitConverter.java
│   ├── BillingCalculator.java
│   ├── ComparisonHelper.java
│   ├── LogicChecker.java
│   ├── SmartMeter.java
│   ├── ResidentDashboard.java
│   ├── AdminPanel.java
│   ├── UtilityReportGenerator.java
│   ├── SwitchMenuRouter.java
│   ├── BonusDigitalClock.java
├── README.md
```

---

# 🧩 **TASKS OVERVIEW**

---

## ✅ **Task 1: Resident Login System**
📄 *LoginSystem.java*

**Goal:** Use `if-else`, `String` comparison, and ternary operators.

🔧 Implement:
```java
public static String authenticate(String username, String password)
```

- Use `if-else` to match known credentials.
- Use ternary to return status message.

📚 [Java String Comparisons – Oracle](https://docs.oracle.com/javase/tutorial/java/data/strings.html)

---

## ✅ **Task 2: Binary and Base Conversions**
📄 *UnitConverter.java*

**Goal:** Work with **numeral systems**.

🔧 Implement methods:
```java
public static String toBinary(int decimal)
public static String toHex(int decimal)
public static int binaryToDecimal(String binary)
```

📚 [Java Number Methods – Oracle](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

---

## ✅ **Task 3: Electricity Billing Calculator**
📄 *BillingCalculator.java*

**Goal:** Apply arithmetic, unary, relational, and logical operators.

🔧 Implement:
```java
public static double calculateBill(int unitsUsed)
```

- First 100 units → ₹1/unit  
- Next 100 units → ₹2/unit  
- >200 units → ₹3/unit  
- Add 5% surcharge if usage > 250  

📚 [Java Math – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arithmetic.html)

---

## ✅ **Task 4: Comparison Helper (Relational/Logical)**
📄 *ComparisonHelper.java*

**Goal:** Compare two customers' usage using relational and logical ops.

```java
public static boolean isHigherUsage(int user1, int user2)
```

Use `>`, `==`, `&&`, `||`.

📚 [Java Operators – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

---

## ✅ **Task 5: Control Structure Tester**
📄 *LogicChecker.java*

**Goal:** Practice `if`, `else`, `nested if`, and `ternary`.

```java
public static String classifyUsage(int units)
```

- >300 → "Excessive"
- 201–300 → "High"
- 101–200 → "Moderate"
- ≤100 → "Low"

Also return `"Critical"` if `units > 400 && overBudget == true`

📚 [Java Control Flow – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

## ✅ **Task 6: Smart Meter Controller (Method Overloading)**  
📄 *SmartMeter.java*

**Goal:** Use **method overloading** and **parameters**.

```java
public static void logUsage(String name, int units)
public static void logUsage(String name, int day, int units)
```

📚 [Method Overloading – Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

## ✅ **Task 7: Resident Dashboard (Void + Return Type Methods)**
📄 *ResidentDashboard.java*

**Goal:** Demonstrate void vs return-type methods.

```java
public static void showWelcome(String name)
public static int getDaysSinceLastReading(int lastDay)
```

📚 [Java Methods – Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

## ✅ **Task 8: Admin Panel Switch Router**
📄 *AdminPanel.java*

**Goal:** Use **`switch` and nested switch** for admin tasks.

```java
public static void adminMenu(String role, int action)
```

- `"superadmin"`: Can view users, reset data  
- `"moderator"`: Can only view users  
- Other roles → Denied

Use `switch(role)` and inside it, `switch(action)`

📚 [Java Switch Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)

---

## ✅ **Task 9: Generate Utility Report**
📄 *UtilityReportGenerator.java*

**Goal:** Combine everything into a **summary report**.

```java
public static String generateReport(String name, int units, boolean isOverBudget)
```

Use:
- `calculateBill(...)`
- `classifyUsage(...)`
- `getGPA(...)` ← Bonus reuse

📚 [Java String Formatting](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

---

## ✅ **Task 10: Dynamic Menu Using Switch**
📄 *SwitchMenuRouter.java*

**Goal:** Use `switch` for dynamic routing (resident/admin actions).

```java
public static void route(int choice)
```

Choices:
1 → Show Profile  
2 → Pay Bill  
3 → Update Info  
4 → Exit

📚 [Switch Guide – Baeldung](https://www.baeldung.com/java-switch)

---

## 🌟 **Bonus Task: Digital Clock Converter**
📄 *BonusDigitalClock.java*

**Goal:** Convert 24-hour time into 12-hour format using logic and string formatting.

```java
public static String to12HourFormat(int hour, int minute)
```

Examples:
- 14:30 → "2:30 PM"
- 09:15 → "9:15 AM"

📚 [Java String Formatting – Oracle](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

---

# 🧑‍🏫 Grading Rubric (example for GitHub Classroom)

| Criteria                        | Max Points |
|--------------------------------|------------|
| Task 1: Login System           | 5 pts      |
| Task 2: Numeral Conversion     | 5 pts      |
| Task 3: Billing Logic          | 10 pts     |
| Task 4: Comparison Logic       | 5 pts      |
| Task 5: Control Structures     | 10 pts     |
| Task 6: Method Overloading     | 10 pts     |
| Task 7: Method Design          | 10 pts     |
| Task 8: Switch Admin Panel     | 10 pts     |
| Task 9: Summary Report         | 10 pts     |
| Task 10: Dynamic Menu Switch   | 5 pts      |
| Bonus: Clock Converter         | +5 pts     |
| **TOTAL**                      | **80 + 5** |

---

### ✅ Suitable for GitHub Classroom
Each class file = one task  
Each method = a focused learning objective  
You can create **autograding unit tests** per method if needed.

