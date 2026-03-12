# Username Availability System

## 📌 Project Description

The **Username Availability System** is designed to check whether a username is available during user registration on a social media platform.

The system performs fast username lookup using **HashMap**, suggests alternative usernames if the requested name is already taken, and tracks the most frequently attempted usernames.

This type of system is commonly used in platforms like Twitter, Instagram, gaming platforms, and email services.

---

## 🚀 Features

* Instant username availability check
* O(1) lookup time using HashMap
* Suggests alternative usernames
* Tracks most attempted usernames
* Simple and efficient design

---

## 🧠 Concepts Used

* Hash Table (HashMap)
* O(1) lookup performance
* Collision handling
* Frequency counting
* Data structures in Java

---

## 🛠 Technologies Used

* Java
* HashMap
* Git
* GitHub

---

## 📂 Project Structure

```
UsernameSystem.java
README.md
```

---

## ⚙️ How It Works

### 1️⃣ Check Username Availability

The system checks if a username already exists in the HashMap.

Example:

```
checkAvailability("john_doe") → false
checkAvailability("jane_smith") → true
```

---

### 2️⃣ Suggest Alternative Usernames

If a username is taken, the system generates alternatives such as:

```
john_doe1
john_doe2
john_doe3
john.doe
```

---

### 3️⃣ Track Username Attempts

The system records how many times each username was attempted.

Example:

```
admin → 10543 attempts
user → 2500 attempts
```

---

## 💻 Example Output

```
false
true
[john_doe1, john_doe2, john_doe3, john_doe4, john_doe5, john.doe]
admin
```

---

## 📊 Time Complexity

| Operation            | Complexity |
| -------------------- | ---------- |
| Check username       | O(1)       |
| Register user        | O(1)       |
| Suggest alternatives | O(k)       |
| Find most attempted  | O(n)       |

---

## 🌍 Real World Applications

* Social media username registration
* Gaming platform usernames
* Email address availability checking
* Domain name availability systems

---

## 📚 Learning Outcome

This project demonstrates how **HashMap can be used for real-time lookup operations**, which is a fundamental concept in designing scalable systems.

---

## 👨‍💻 Author

Bhanu Prakash Reddy
