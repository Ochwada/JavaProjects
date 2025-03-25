# 🔐 **Mini Project: Smart Home Access System**

## 🧠 **Project Objective**
Simulate a **Smart Home Access System** that controls entry, room access, and privileges for different users (family members, guests, staff). The system makes decisions using:

- ✅ `if`, `if-else`, `nested if-else`  
- ✅ Logical operators (`&&`, `||`, `!`)  
- ✅ Ternary expressions  
- ✅ `switch` and nested `switch` statements  

---

## 📦 Suggested Folder Structure

```
SmartHomeAccess/
├── src/
│   ├── UserAccessLevel.java
│   ├── RoomAccessController.java
│   ├── AccessDecisionEngine.java
│   ├── GuestRestrictions.java
│   ├── EntryPointMenu.java
│   ├── SmartHomeMain.java
├── README.md
```

---

## ✅ **Task 1: User Access Level (if-else)**

### 🎯 Goal:
Determine a user's access level based on their role.

### 👨‍👩‍👧‍👦 Roles:
- "Parent" → Full access  
- "Child" → Limited access  
- "Guest" → Guest access  
- Any other input → No access

### 🔧 Method:
```java
public static String getAccessLevel(String role)
```

### 📚 Resource:
- [Java if-else Control Flow – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)

---

## ✅ **Task 2: Room Access Controller (switch + nested switch)**

### 🎯 Goal:
Use `switch` to determine access to specific rooms.

### 🔧 Method:
```java
public static String checkRoomAccess(String role, String room)
```

### 📝 Logic:
- Use `switch` on `role`
  - Inside each, use `switch` on `room`:
    - `Parent` can access all
    - `Child` can access Bedroom, Living Room
    - `Guest` can only access Guest Room and Living Room
    - Unknown role → Denied

### 📚 Resource:
- [Java Nested switch Statements – CodeSpindle](https://codespindle.com/Java/Java_switch_case.html)

---

## ✅ **Task 3: Access Decision Engine (Logical + Ternary)**

### 🎯 Goal:
Check if user is allowed to enter based on:
- Has keycard
- Is recognized by face scan

### 🔧 Method:
```java
public static String canEnter(boolean hasKeycard, boolean faceRecognized)
```

### 🧠 Logic:
- If has keycard OR faceRecognized → `"Access Granted"`
- Else → `"Access Denied"`
- Use **logical operator + ternary** in one line.

### 📚 Resource:
- [Logical & Ternary Operators – CodeSpindle](https://codespindle.com/Java/Java_Ternary.html)

---

## ✅ **Task 4: Guest Restrictions (Nested if-else)**

### 🎯 Goal:
Decide guest behavior restrictions.

### 🔧 Method:
```java
public static String getGuestPermissions(int hoursStayed, boolean isSupervised)
```

### 📝 Rules:
- If hoursStayed > 3
  - If supervised → `"Allowed to stay"`
  - Else → `"Must leave soon"`
- If hoursStayed ≤ 3 → `"Enjoy your visit!"`

### 📚 Resource:
- [Java Nested if-else – Codedamn](https://codedamn.com/news/java/nested-if-else-statement-in-java)

---

## ✅ **Task 5: Entry Point Menu (switch + input)**

### 🎯 Goal:
Create a `main()` method that simulates entering the home and selecting options.

### 📝 Steps:
- Ask for user role
- Ask if keycard or face recognized
- Display:
  - Access status
  - Room options
  - Room access result
  - Guest restrictions (if applicable)

### 📚 Resource:
- [Java switch Menu Systems – GeeksForGeeks](https://www.geeksforgeeks.org/switch-statement-in-java/)

---

## 🌟 **Bonus Task: Emergency Override**

### 🎯 Goal:
If there’s an emergency, **bypass all logic** and allow anyone in.

### 🔧 Add to `canEnter()`:
```java
public static String canEnter(boolean hasKeycard, boolean faceRecognized, boolean isEmergency)
```

If `isEmergency == true`, return `"Emergency Override: Entry Granted"` immediately.

---

## 🧠 Learning Outcome:
By the end of this mini project, students will:

- Fully understand the use of control structures to drive app logic
- Make layered decisions using both `if-else` and `switch`
- Write cleaner conditional code using ternary expressions
- Apply real-world constraints like access rules and user roles

