1. Purpose of the Program
- Explain that this is a simple combat simulation built to demonstrate 3 OOP principles:
- Abstraction → shared base class Character
- Polymorphism → calling attack() or useAbility() on Character runs subclass logic
- Inheritance → Warrior and Mage inherit from Character

2. Class Breakdown
- Character.java
  - Abstract class
  - Holds shared fields: name, maxHealth, health
  - Contains abstract methods:
    - attack(Character target)
    - useAbility()

- Warrior.java
  - Has sword attack
  - Ability: rage mode

- Mage.java
  - Has fireball attack
  - Ability: heal

- Game.java
  - Creates objects
  - Demonstrates polymorphism using Character hero1 = conan;
  - Runs attack + ability tests
 
3. Known Issues / Fixes

⚠️ had yellow underline on
this.health = health;
Because health does not exist in the constructor parameters — so you're assigning the variable to itself (which is meaningless).

Correct version:
this.health = maxHealth;
Meaning: when creating a new character, they start with full HP.

⛔ had red underline one
System.out.println(this.name + " lunges with a sword!");
System.out.println(this.name + " conjures a fireball!");
Because a subclass cannot access private fields of it's parent class. Private = only visible to inside that exact class file. (dumbass)

Correct Version:
in Character.java
public String getName() {
    return name;
}

Then in Warrior and Mage:
System.out.println(getName() + " lunges with a sword!");
System.out.println(getName() + " conjures a fireball!");

Disclaimer: The readme is also my list of mistakes, so please excuse my self-deprecation.
