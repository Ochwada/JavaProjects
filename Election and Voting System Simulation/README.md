# 🗳️ **Java Mini Project: Election & Voting System**

## 🎯 Project Goal:
Design a **smart election system** that helps validate voter eligibility, manage polling logic, calculate results, and apply voting rules — all using **boolean logic** and **ternary expressions**.

---

## 📦 Suggested Folder Structure:
```
SmartElectionSystem/
├── src/
│   ├── VoterEligibility.java
│   ├── BallotValidator.java
│   ├── VoteProcessor.java
│   ├── TurnoutAnalyzer.java
│   ├── CandidateEligibility.java
│   ├── ResultReporter.java
│   ├── ElectionDashboard.java
├── README.md
```

---

## 🧩 Tasks Overview

You will implement **7 tasks**, each introducing increasingly complex logic challenges using:
- Logical operators (`&&`, `||`, `!`)
- Ternary operators (`condition ? A : B`)

---

## ✅ Task 1: Voter Eligibility Checker

### 🎯 Goal:
Check if a user is allowed to vote.

### 📋 Steps:
1. Create `VoterEligibility.java`
2. Method:
   ```java
   public static boolean isEligible(int age, boolean hasID)
   ```
3. Rules:
   - Must be 18+ **AND** have ID.

4. Print: `"Eligible"` or `"Not Eligible"`

### 📚 Resource:
- [Java Boolean Conditions – W3Schools](https://www.w3schools.com/java/java_conditions.asp)

---

## ✅ Task 2: Ballot Validation

### 🎯 Goal:
Determine if a submitted ballot is **valid**.

### 📋 Steps:
1. Create `BallotValidator.java`
2. Method:
   ```java
   public static String validateBallot(boolean filledCorrectly, boolean hasSignature)
   ```
3. Use **ternary operator**:
   - If both true → "Ballot Accepted"
   - Else → "Invalid Ballot"

### 📚 Resource:
- [Ternary Operator – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

---

## ✅ Task 3: Vote Processor

### 🎯 Goal:
Record a vote and determine whether it's a **vote for a candidate** or **a spoiled vote**.

### 📋 Steps:
1. Create `VoteProcessor.java`
2. Method:
   ```java
   public static String processVote(String selectedCandidate)
   ```
3. Rules:
   - If selectedCandidate is not `"null"` or `""` → return `"Vote Recorded"`
   - Else → `"Spoiled Vote"`

### 📚 Resource:
- [String comparison in Java – GeeksForGeeks](https://www.geeksforgeeks.org/how-to-compare-strings-in-java/)

---

## ✅ Task 4: Turnout Analyzer

### 🎯 Goal:
Analyze voter turnout based on **registered vs. actual voters**.

### 📋 Steps:
1. Create `TurnoutAnalyzer.java`
2. Method:
   ```java
   public static String turnoutMessage(int registered, int voted)
   ```
3. Use ternary to print:
   - "High Turnout" if voted > 70% of registered
   - "Moderate Turnout" if between 40% and 70%
   - "Low Turnout" otherwise

### 📚 Resource:
- [Java Math & Percentages – Baeldung](https://www.baeldung.com/java-arithmetic-operators)

---

## ✅ Task 5: Candidate Eligibility Checker

### 🎯 Goal:
Check if a person is eligible to run for office.

### 📋 Steps:
1. Create `CandidateEligibility.java`
2. Method:
   ```java
   public static String isEligibleCandidate(int age, boolean citizen, boolean criminalRecord)
   ```
3. Rules:
   - Must be 30+ AND citizen AND no criminal record

### 📚 Resource:
- [Logical AND/OR/NOT – JavaPoint](https://www.javatpoint.com/logical-operator)

---

## ✅ Task 6: Result Reporter

### 🎯 Goal:
Compare votes between two candidates and declare a winner or a tie.

### 📋 Steps:
1. Create `ResultReporter.java`
2. Method:
   ```java
   public static String reportResult(int votesA, int votesB)
   ```
3. Use nested ternary:
   - If votesA > votesB → "Candidate A Wins"
   - If votesB > votesA → "Candidate B Wins"
   - Else → "Tie"

### 📚 Resource:
- [Nested Ternary Examples – TutorialsPoint](https://www.tutorialspoint.com/java/java_basic_operators.htm)

---

## ✅ Task 7: Election Dashboard

### 🎯 Goal:
Bring it all together! Simulate a full vote from start to end.

### 📋 Steps:
1. Create `ElectionDashboard.java`
2. From `main()`, simulate:
   - Check voter eligibility
   - Validate ballot
   - Process vote
   - Compare results
   - Report status

💡 This ties together all previous classes/methods into a final **functional election flow**.

---

## 🔚 Wrap-Up:
This mini-project tests your understanding of:
- Ternary logic
- Real-world conditions
- Method composition
- Logical operator flow

Great practice for writing **clean, decision-driven Java code**!

