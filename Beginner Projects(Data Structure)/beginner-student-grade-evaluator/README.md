# 🎓 **Mini Project: Student Grade Evaluator**

### 🧠 Objective:
Create a Java application that evaluates a student's **numeric score**, assigns a **letter grade**, and provides **personalized feedback** using various decision-making structures.

This project is designed to build a solid foundation in control flow using **Java conditional statements**.

---

## 📦 Suggested Folder Structure

```
StudentGradeEvaluator/
├── src/
│   ├── ScoreToGradeConverter.java
│   ├── PassFailChecker.java
│   ├── GradeFeedbackSwitch.java
│   ├── HonorsEligibilityChecker.java
│   ├── FinalGradeReport.java
├── README.md
```

---

## ✅ **Task 1: Score to Grade Converter (`if-else` / `nested if-else`)**

### 🎯 Goal:
Convert a numeric score (0–100) into a letter grade.

### 🧩 Instructions:
1. Create class `ScoreToGradeConverter`
2. Method:
```java
public static char getGrade(int score)
```
3. Use nested `if-else` to return:
   - `A` for 90+
   - `B` for 80–89
   - `C` for 70–79
   - `D` for 60–69
   - `F` for < 60

### 📚 Resource:
- [Java if-else Statement – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

## ✅ **Task 2: Pass/Fail Checker (ternary operator)**

### 🎯 Goal:
Use a ternary operator to determine if the student passed.

### 🧩 Instructions:
1. Create class `PassFailChecker`
2. Method:
```java
public static String checkPassFail(int score)
```
3. Return `"Passed"` if score ≥ 60, else `"Failed"` using ternary.

### 📚 Resource:
- [Ternary Operator in Java – W3Schools](https://www.w3schools.com/java/java_conditions_shorthand.asp)

---

## ✅ **Task 3: Grade Feedback Provider (switch statement)**

### 🎯 Goal:
Provide feedback based on the letter grade using a `switch`.

### 🧩 Instructions:
1. Create class `GradeFeedbackSwitch`
2. Method:
```java
public static String getFeedback(char grade)
```
3. Use `switch` to return:
   - `A` → "Excellent!"
   - `B` → "Great job!"
   - `C` → "Good effort."
   - `D` → "Needs improvement."
   - `F` → "Failed. Let's study harder!"
   - Default → "Invalid grade."

### 📚 Resource:
- [Java Switch Statement – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)

---

## ✅ **Task 4: Honors Eligibility (logical operators)**

### 🎯 Goal:
Determine if the student qualifies for honors.

### 🧩 Instructions:
1. Create class `HonorsEligibilityChecker`
2. Method:
```java
public static boolean isEligibleForHonors(int score, boolean hasPerfectAttendance)
```
3. Use `&&` to return true only if:
   - score >= 90
   - AND hasPerfectAttendance is true

### 📚 Resource:
- [Logical Operators in Java – GeeksForGeeks](https://www.geeksforgeeks.org/logical-operators-in-java/)

---

## ✅ **Task 5: Final Grade Report (bring it all together)**

### 🎯 Goal:
Generate a complete student grade report.

### 🧩 Instructions:
1. Create class `FinalGradeReport`
2. In `main()`:
   - Input: Student name, score, attendance status
   - Use:
     - Task 1 for letter grade
     - Task 2 for pass/fail
     - Task 3 for feedback
     - Task 4 for honors
   - Output:
```
Student: Maria
Score: 92
Grade: A
Result: Passed
Feedback: Excellent!
Honors: Eligible ✅
```

### 📚 Resource:
- [Java Basics: Methods and Classes – Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

---

## 🌟 Bonus Task: GPA Equivalent using Nested Ternary

### 🧩 Instructions:
1. Add to `ScoreToGradeConverter`:
```java
public static double getGPA(int score)
```
2. Use **nested ternary**:
   - 90+ → 4.0
   - 80–89 → 3.0
   - 70–79 → 2.0
   - 60–69 → 1.0
   - < 60 → 0.0

### 📚 Resource:
- [Java Ternary Operator (Nested) – Codespindle](https://codespindle.com/Java/Java_Ternary.html)

---

## 🏁 Wrap-Up

This project simulates a **real student grading system**, using all control flow structures covered in **Day 07**. It's a fun and practical way to master:

- ✅ `if`, `if-else`, `nested if-else`
- ✅ Logical & ternary operators
- ✅ `switch` and clean method structure
