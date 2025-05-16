## 📝 Assignment: **Logging / Audit Trail Writer (Simulation)**

### 🎯 **Problem Background**

In real-world applications — especially in **banking**, **healthcare**, or **e-commerce** — it’s essential to keep an **audit trail** of critical actions. Each time a user performs an action (like transferring money or accessing sensitive data), we need to log that event asynchronously, so we don’t slow down the main system flow.

> ❗ Logs must be recorded in real-time but should **not block** the main user operations.

We’ll simulate an **audit logging system** using Java threads. Each "user action" will trigger a log entry, and we’ll handle the logging asynchronously using threads.

---

## 🧠 **Algorithmic Thinking & Design Discussion**

Break it down:

| Task              | What to Think About                                                    |
| ----------------- | ---------------------------------------------------------------------- |
| Action simulation | How do we simulate a user event like "Login" or "Transfer"?            |
| Logging           | How can we log messages in real-time without blocking the main thread? |
| Thread use        | Should logging be in the same thread? (No – it must be separate.)      |
| Logging queue     | What happens if multiple actions are triggered at once?                |
| Output            | Where do we log? For this simulation: print to console.                |

---

