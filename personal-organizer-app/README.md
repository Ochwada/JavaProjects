# 🎯 **Assignment: Personal Organizer App (with `ArrayList`)**  
### 📅 Theme: Organize your life – one dynamic list at a time!

In this assignment, you’ll build various modules of a **Personal Organizer** application using Java's `ArrayList`. Each task focuses on solving a real-world use case that benefits from the **flexibility**, **efficiency**, and **functionality** of `ArrayList`.

This assignment is broken down into **10 mini-tasks**. Complete each one and commit your progress to GitHub.

---

## 🔧 Starter Structure

```bash
PersonalOrganizerApp/
├── Task01_TodoList.java
├── Task02_ShoppingList.java
├── Task03_BookmarksManager.java
├── Task04_ContactSearch.java
├── Task05_WishlistSorter.java
├── Task06_DailyPlanner.java
├── Task07_QuickNotes.java
├── Task08_TagManager.java
├── Task09_ReminderApp.java
├── Task10_RecentlyWatched.java
└── README.md
```

---

## ✅ Task 1: To-Do List Manager

📌 **Goal**: Build a to-do list that can add, remove, and print tasks.

🧠 **Why `ArrayList`?**
- Fast random access for displaying tasks.
- Dynamic size (unlike arrays).
- Insertion/deletion isn’t heavy at the end – fits common task management behavior.

---

## ✅ Task 2: Shopping List App

📌 **Goal**: Users can add items to their shopping list, check for duplicates, and remove purchased items.

🧠 **Why `ArrayList`?**
- Allows duplicates (e.g., 2 "Milk").
- Easy to display by index (with quantities).
- Simpler than `LinkedList` for shopping-style flows where most additions/removals are at the end.

---

## ✅ Task 3: Bookmarks Manager

📌 **Goal**: Users can save URLs, display the full list, and open any by index.

🧠 **Why `ArrayList`?**
- Random access is needed to pick a bookmark quickly.
- `LinkedList` would be too slow for index-based access.
- Arrays can't dynamically grow as users add bookmarks.

---

## ✅ Task 4: Contact Search

📌 **Goal**: Users can store contacts and search by name using a partial match.

🧠 **Why `ArrayList`?**
- Fast iteration and flexible storage.
- Better than arrays (fixed size).
- No need for `LinkedList` here since insertions/removals aren’t frequent.

---

## ✅ Task 5: Wishlist Sorter

📌 **Goal**: Users maintain a wishlist of products and can sort it alphabetically or by priority.

🧠 **Why `ArrayList`?**
- Can easily be sorted using `Collections.sort()`.
- Arrays don’t allow easy sorting of growing data.
- `LinkedList` doesn’t perform as well with sorting algorithms.

---

## ✅ Task 6: Daily Planner (Time Slots)

📌 **Goal**: Plan your day using a list of time slots, each holding a short task.

🧠 **Why `ArrayList`?**
- Each time slot has a fixed position (like 10:00 AM, 11:00 AM...).
- Perfect use case for indexed access.
- `LinkedList` is inefficient for access by position.

---

## ✅ Task 7: Quick Notes App

📌 **Goal**: Users can quickly jot down and delete notes.

🧠 **Why `ArrayList`?**
- Simple, dynamic, and readable.
- Notes are often accessed or removed by index or content.
- Arrays can’t grow, and `LinkedList` adds unnecessary overhead.

---

## ✅ Task 8: Tag Manager

📌 **Goal**: Allow users to tag things with keywords and print all current tags.

🧠 **Why `ArrayList`?**
- Great for dynamic and iterative tag collections.
- Allows duplicates (if needed), and ordering matters.
- Arrays are too rigid for casual user-generated content.

---

## ✅ Task 9: Reminder System

📌 **Goal**: Add reminders for future events, then view and remove them when done.

🧠 **Why `ArrayList`?**
- Dynamic list makes it easy to update.
- You don’t need constant insertion/removal at the start (so no need for `LinkedList`).
- Ideal for appending and displaying.

---

## ✅ Task 10: Recently Watched Tracker

📌 **Goal**: Track a list of recently watched shows. Show the last 5 and remove the oldest when limit is reached.

🧠 **Why `ArrayList`?**
- You can manually control the size and trim from the start (like a rolling buffer).
- Arrays can’t shrink; `LinkedList` may make `get(i)` operations painful.

---

## 📦 Deliverables

Each task should include:
- A Java class (one per task).
- A main method for demo.
- A few test cases or console output samples.
- Clear variable naming and comments.

---

## 🧪 Bonus Challenge Ideas
💥 Add file storage (save/load list items)  
💥 Use `Collections.sort()` and `Collections.reverse()`  
💥 Implement duplicate checking where it makes sense

---

## 🚀 Submission
1. Clone the GitHub Classroom repo.
2. Complete the 10 Java classes.
3. Push your code with proper commit messages.
4. Submit your link before the deadline 🎯

---

## 💡 Need Help?
Ping your instructor or post in the class Slack — don’t stress alone (or you’ll end up like a Java app in production 😅).

