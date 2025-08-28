# Java-OOP-Currency-Denomination-Management-System
Java-based program demonstrating OOP principles (encapsulation, information hiding, modularisation) for managing people’s currency amounts and calculating optimal AED denomination breakdowns with menu-driven features.

# 💰 ChangeC – Currency Change System (Java OOP)

## 📌 Overview
Java-based program (ICT167 Assignment 1, 2024) applying **Object-Oriented Programming (OOP)** to manage and calculate currency change.  
It stores records of people and their owed amounts, then breaks them down into optimal UAE Dirham denominations.  

---

## 🛠️ Tech Stack
- **Language:** Java (JDK SE, NetBeans 19)  
- **Paradigm:** Object-Oriented Programming  
- **Concepts:** Encapsulation, Information Hiding, Constructors, Accessors/Mutators, Pre/Post Conditions, Open/Closed Principle  
- **Data Structure:** Array of `Person` objects  

---

## 🔑 Features
- ✅ Input validation  
  - Unique names only  
  - Amounts must be multiples of 5  
- ✅ Choose between **manual entry** or **preset test data** (`usePreset`)  
- ✅ AED denomination breakdown (1000 → 5)  
- ✅ Menu-driven options:
  1. Display change for a name  
  2. Smallest amount  
  3. Largest amount  
  4. Total number of notes  
  5. Total sum of all amounts  
  6. Exit  

---

## 📊 Example
Customer: Jane AED 65
Change:
AED 50 : 1
AED 10 : 1
AED 5 : 1


---

## 📂 Structure


---

## ⚡ How to Run
1. Open in **NetBeans 19**  
2. Set `usePreset = true` (auto test data) or `false` (manual input)  
3. Compile & run `ChangeC.java`  
4. Interact via the on-screen menu  

---

## 🔍 Testing Highlights
- Preset array loads correctly ✅  
- Duplicate names detected ✅  
- Non-multiples of 5 rejected ✅  
- Menu options 1–5 work as expected ✅  
- Exit message displayed ✅  
- **Limitations:**  
  - “Not Found” handling incomplete  
  - Manual input requires double **Enter** after amount  
  - Fixed array capacity (10)  
  




