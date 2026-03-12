# E-commerce Flash Sale Inventory Manager

## 📌 Project Overview

The **Flash Sale Inventory Manager** is a system designed to manage limited product stock during high-traffic events such as flash sales.

During events like Amazon Prime Day or limited product launches, thousands of users attempt to purchase a product simultaneously. This system ensures that stock is managed efficiently without overselling while maintaining high performance.

---

## 🚀 Features

* Real-time product stock tracking
* O(1) purchase processing using HashMap
* Thread-safe operations to prevent overselling
* FIFO waiting list when stock is unavailable
* Instant stock availability checking

---

## 🧠 Concepts Used

* Hash Tables (HashMap)
* Concurrency handling
* Synchronization in Java
* FIFO Queue for waiting list
* Performance optimization during high traffic

---

## 🛠 Technologies Used

* Java
* HashMap
* Queue (LinkedList)
* Git
* GitHub

---

## 📂 Project Structure

```
FlashSaleInventoryManager.java
README.md
```

---

## ⚙️ How the System Works

### 1️⃣ Check Product Stock

The system instantly checks stock using a HashMap lookup.

Example:

```
checkStock("IPHONE15_256GB") → 100 units available
```

---

### 2️⃣ Purchase Product

If stock is available, the purchase is successful and stock decreases.

Example:

```
purchaseItem("IPHONE15_256GB", userId=12345)
→ Success, 99 units remaining
```

---

### 3️⃣ Waiting List System

When stock becomes zero, new users are added to a waiting list.

Example:

```
purchaseItem("IPHONE15_256GB", userId=99999)
→ Added to waiting list, position #1
```

The waiting list follows **FIFO (First In First Out)** order.

---

## 📊 Time Complexity

| Operation           | Complexity |
| ------------------- | ---------- |
| Check Stock         | O(1)       |
| Purchase Item       | O(1)       |
| Add to Waiting List | O(1)       |

---

## 🌍 Real World Use Cases

* Flash sale events
* Concert ticket booking
* Limited edition product launches
* Online gaming item sales

Examples include major e-commerce events like flash sales conducted by large online marketplaces.

---

## 📚 Learning Outcomes

This project demonstrates how **HashMap and synchronization can be used to handle high traffic systems while preventing overselling**. It also introduces concurrency-safe design for real-time applications.

---

## 👨‍💻 Author

Bhanu Prakash Reddy
