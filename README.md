# 🧠 Java Coding Challenge Solutions by Diana Musee

This project contains solutions to seven algorithmic coding problems written in **Java 1.8**. Each solution is self-contained, well-commented, and includes a sample test runner and lightweight test script.

---

## 💪 Language & Environment

* **Language:** Java
* **Version:** Java 1.8
* **No external libraries** — only Java Standard Library (`java.util.*`)

---

## ✨ How to Compile & Run

### Run the main demo (solves all 7 questions):

```bash
javac Questions/*.java Main.java
java Main
```

### Run the test script (manual test validations):

```bash
javac Questions/*.java TestQuestions.java
java TestQuestions
```

---

## 📌 Problem Descriptions & How Each Solution Works

### ✅ Question 1: Find Unique Pairs That Sum to a Target

* Finds all **unique pairs** in a list that add up to a given target sum using a `Set` for lookup.

### ✅ Question 2: Validate Bracket String

* Uses a **stack** to check if brackets `(), {}, []` are balanced and correctly nested.

### ✅ Question 3: Anagram Checker

* Sorts both strings and compares them, ignoring case and whitespace to determine if they are anagrams.

### ✅ Question 4: First Unique Product

* Tracks product frequencies using a `Map` and returns the **first** non-repeating string from a list.

### ✅ Question 5: Minimum Distance Between Duplicate Minimums

* Finds the **minimum value**, then computes the shortest distance between its duplicates in the list.

### ✅ Question 6: Top 3 Most Frequent Words

* Counts frequency of each word and returns the top 3 most frequent using a **priority queue** (max-heap).

### ✅ Question 7: Rotate List to the Right

* Rotates a list of strings `n` steps to the right by slicing and rejoining two sublists.

---

## ✅ Test Script Included

The file `TestQuestions.java` contains test cases for key logic (especially for Question 7: rotation) and prints expected vs actual results.

---

## 👩🏾‍💻 Author

**Diana Musee**
Junior Java Developer | Focused on clarity, correctness, and efficient problem-solving
📍 Nairobi, Kenya

---
