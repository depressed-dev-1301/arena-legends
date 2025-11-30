# **Arena Legends**

*A beginner-friendly Object-Oriented Programming (OOP) project demonstrating the four pillars of OOP through a simple text-based arena battle game.*

---

## **📌 Overview**

**Arena Legends** is a console-based game where players choose a character class—such as **Warrior** or **Mage**—and battle opponents using different attacks and abilities.
The project is designed to help beginners understand how OOP works in practice using Java.

This project showcases all **four pillars of Object-Oriented Programming**:

1. **Encapsulation** – Each class manages its own data and behavior.
2. **Inheritance** – Character classes inherit from a shared `Character` superclass.
3. **Polymorphism** – Different characters implement attacks in unique ways.
4. **Abstraction** – Common behaviors are defined in abstract or base classes.

---

## **🎮 Gameplay Summary**

* You select a character class.
* Each class has:

  * Base stats (HP, attack power, etc.)
  * Special attack variations
* You battle an opponent in turn-based combat.
* The game continues until one combatant’s HP reaches zero.

---

## **📁 Project Structure**

```
arena-legends/
└── src/
    ├── Character.java   // Base class with core attributes & methods
    ├── Warrior.java     // Subclass with Warrior-specific attacks
    ├── Mage.java        // Subclass with Mage-specific attacks
    ├── Game.java        // Game loop & user interaction
```

---

## **🧠 OOP Concepts Demonstrated**

### **Encapsulation**

Attributes like health, attack power, and name are kept private within the `Character` class, accessible through getters/setters or methods.

### **Inheritance**

`Warrior` and `Mage` extend the `Character` base class and inherit its fields and functions.

### **Polymorphism**

Each character overrides attack behaviors.
Example:

* Warrior might have a stronger physical strike
* Mage might have elemental magic attacks

### **Abstraction**

The base class `Character` provides a shared template so subclasses only need to implement what makes them unique.

---

## **🚀 How to Run**

1. Clone the repository:

   ```bash
   git clone https://github.com/depressed-dev-1301/arena-legends.git
   ```
2. Navigate to the `src` folder.
3. Compile the Java files:

   ```bash
   javac *.java
   ```
4. Run the game:

   ```bash
   java Game
   ```

---

## **📘 Learning Purpose**

This project is intentionally simple.
It’s designed primarily for:

* Practicing Java basics
* Understanding OOP foundations
* Seeing how multiple classes interact
* Learning code organization in a small project

Perfect for beginners learning Java OOP. 
(me, i'm the beginner. Join my suffering as i debug and update my own project.)
