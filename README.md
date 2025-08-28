# 💰 Java-OOP-Currency-Denomination-Management-System


<h3>📌 Overview</h3>
Java program that demonstrates **Object-Oriented Programming (OOP)** principles.  
It manages records of people and their currency amounts, and breaks them down into **optimal AED denominations** using modular, reusable design.

<h3>🛠️ Tech Stack</h3>
- **Language:** Java (JDK SE, NetBeans 19)  
- **Paradigm:** Object-Oriented Programming  
- **Concepts:** Encapsulation, Information Hiding, Constructors, Accessors/Mutators, Pre/Post Conditions, Open/Closed Principle  
- **Data Structure:** Array of `Person` objects  

<h3>🔑 Features</h3>
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

<h3>📊 Example</h3>
```plaintext
Customer: Jane AED 65
Change:
AED 50 : 1
AED 10 : 1
AED 5 : 1
```

<h3>📂 Project Structure</h3>
```plaintext
ChangeC/
├── Person.java        # Person class – stores name & money, with getters/setters
├── ChangeC.java       # Main program – handles input, validation, denominations & menu
├── StudentInfo.java   # (optional) Prints student details (name, ID, tutor info)
├── docs/              # External documentation (UML diagrams, algorithms, test results)
└── README.md          # Project summary
```

- **Person.java**  
  Encapsulates person details with private variables (`name`, `money`) and accessor/mutator methods.  

- **ChangeC.java**  
  Implements main logic:
  - `main()` for execution flow  
  - `getPersonName()` & `getPersonMoney()` for validated input  
  - `denomination()` for breakdown into AED notes  
  - `currencyMenu()` for 6 menu-driven options  
  - `getSample()` for preset hardcoded test data  
  - `printInfo()` for testing output  

- **StudentInfo.java**  
  Outputs author details for tutor verification.  

<h3>⚡ How to Run</h3>
1. Open in **NetBeans 19**  
2. Set `usePreset = true` (auto test data) or `false` (manual input)  
3. Compile & run `ChangeC.java`  
4. Interact via the on-screen menu  

<h3>🔍 Testing Highlights</h3>
- Preset array loads correctly ✅  
- Duplicate names detected ✅  
- Non-multiples of 5 rejected ✅  
- Menu options 1–5 work as expected ✅  
- Exit message displayed ✅  

<b>Limitations:</b> 
  - “Not Found” handling incomplete  
  - Manual input requires double **Enter** after amount  
  - Fixed array capacity (10)  
  




