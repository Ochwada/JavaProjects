# 💰👨‍👩‍👧‍👦 **Mini Project: Family Budget Assistant**

### 🧠 Objective:
Build a Java program that simulates a **family budgeting assistant**. This assistant will evaluate spending behavior based on each member’s role and amount spent.

You will use:
- ✅ `if`, `if-else`, `nested if-else`
- ✅ Logical operators (`&&`, `||`, `!`)
- ✅ Ternary expressions
- ✅ `switch` and `nested switch` structures

---

## 📦 Suggested Folder Structure

```
FamilyBudgetAssistant/
├── src/
│   ├── SpendingCategorizer.java
│   ├── RoleSpendingPolicy.java
│   ├── BudgetStatusChecker.java
│   ├── RoleBasedSuggestions.java
│   ├── DailyReportGenerator.java
│   ├── BonusComparisonTool.java
├── README.md
```

---

## ✅ **Task 1: Spending Categorizer (if-else logic)**

### 🎯 Goal:
Determine the **spending level** based on the amount spent.

### 🧩 Instructions:
1. Create a class called `SpendingCategorizer`.
2. Create a method:
```java
public static String getSpendingCategory(double amount)
```
3. Use `if-else` to return:
   - `"Low"` for < 50
   - `"Medium"` for 50–150
   - `"High"` for > 150

### 📚 Reference:
- [Java if-else Tutorial – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

## ✅ **Task 2: Role Spending Policy (`switch` statement)**

### 🎯 Goal:
Set **spending limits** based on family roles.

### 🧩 Instructions:
1. Create `RoleSpendingPolicy` class.
2. Create method:
```java
public static double getSpendingLimit(String role)
```
3. Use `switch` to assign:
   - `"Parent"` → 200
   - `"Teen"` → 100
   - `"Child"` → 50
   - Default → 75

### 📚 Reference:
- [Java switch Statements – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)

---

## ✅ **Task 3: Budget Status Checker (ternary + logic)**

### 🎯 Goal:
Check if a person stayed **within their budget**.

### 🧩 Instructions:
1. Create `BudgetStatusChecker` class.
2. Method:
```java
public static String checkBudgetStatus(double amountSpent, double limit)
```
3. Use a **ternary operator** to return:
   - `"Within Budget"` if amountSpent <= limit
   - `"Over Budget"` otherwise

### 📚 Reference:
- [Java Ternary Operator – W3Schools](https://www.w3schools.com/java/java_conditions_shorthand.asp)

---

## ✅ **Task 4: Role-Based Suggestions (`nested if-else` + logic operators)**

### 🎯 Goal:
Give **suggestions** based on age, role, and budget status.

### 🧩 Instructions:
1. Create `RoleBasedSuggestions` class.
2. Method:
```java
public static String suggestAction(String role, int age, boolean isOverBudget)
```
3. Use nested `if-else` + `&&`/`||` to:
   - For Teens over budget: `"Review your spending habits"`
   - For Children over budget: `"Ask your parents first"`
   - For Parents: `"Adjust future planning"`
   - Otherwise: `"All good"`

### 📚 Reference:
- [Java Logical Operators – GeeksForGeeks](https://www.geeksforgeeks.org/java-logical-operators-with-examples/)
- [Java Nested if Statements – JavaTPoint](https://www.tutorialspoint.com/java/nested_if_statements_in_java.htm)

---

## ✅ **Task 5: Daily Budget Report Generator (uses all)**

### 🎯 Goal:
Generate a **daily report** for each family member.

### 🧩 Instructions:
1. Create `DailyReportGenerator` class.
2. In `main()`:
   - Input: name, role, age, amount spent
   - Use:
     - Task 1 to get category
     - Task 2 to get limit
     - Task 3 to check status
     - Task 4 to get suggestion
   - Print a final summary:
     ```
     Name: John | Role: Teen
     Spending: $110 → High
     Status: Over Budget
     Suggestion: Review your spending habits
     ```

### 📚 Reference:
- [Java Methods Review – Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

## ⭐ **Bonus Task: Compare Two Family Members’ Spending**

### 🧩 Instructions:
1. Create `BonusComparisonTool` class.
2. Method:
```java
public static String compareSpending(String name1, double amt1, String name2, double amt2)
```
3. Use **nested ternary operators** to return:
   - `"Both spent equally"`
   - `"X spent more than Y"`

### 📚 Reference:
- [Java Nested Ternary Logic – TutorialsPoint](https://www.tutorialspoint.com/java-ternary-operator-puzzle)

---

## 🏁 Wrap-up:
This project will strengthen your understanding of Java’s decision-making power — by helping a family **stay financially wise and in control**. 💳✅

