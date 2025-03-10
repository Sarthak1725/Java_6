# 🦆 Duck Simulation Program

## 📌 Description
This program simulates different types of ducks and their behaviors using the **Strategy Pattern**.  
It allows dynamic assignment of behaviors such as flying, swimming, and quacking.  

Each duck can:
- ✅ Fly or Not Fly  
- ✅ Swim, Float, or Drown  
- ✅ Quack, Squeak, or Stay Silent  

## 🚀 Features
- Implements **Strategy Pattern** for flexible duck behaviors.  
- Uses **OOP principles** like **abstraction, encapsulation, and polymorphism**.  
- Includes **menu-driven interaction** for selecting and displaying ducks.  
- Well-structured code with modular files and comments.  

---

## 📂 Class & Interface Overview  

### **Interfaces**
1. `FlyBehavior.java` → Defines `fly()` method for different flying behaviors.  
2. `SwimBehavior.java` → Defines `swim()` method for different swimming behaviors.  
3. `QuackBehavior.java` → Defines `quack()` method for different quacking behaviors.  

### **Concrete Behavior Classes**
4. `Fly.java` → Implements `FlyBehavior` → *"I can fly high in the sky!"*  
5. `NotFly.java` → Implements `FlyBehavior` → *"I cannot fly."*  
6. `Swim.java` → Implements `SwimBehavior` → *"I can swim in the water!"*  
7. `Float.java` → Implements `SwimBehavior` → *"I float on the water."*  
8. `Drown.java` → Implements `SwimBehavior` → *"I sink in the water..."*  
9. `Quack.java` → Implements `QuackBehavior` → *"Quack! Quack!"*  
10. `MuteQuack.java` → Implements `QuackBehavior` → *"..."*  
11. `Squeak.java` → Implements `QuackBehavior` → *"Squeak! Squeak!"*  

### **Duck Classes**
12. `Duck.java` (Abstract Class) → Defines common behaviors and structure for all ducks.  
13. `MallardDuck.java` → ✅ Flies, ✅ Swims, ✅ Quacks  
14. `RubberDuck.java` → ❌ Cannot fly, ✅ Floats, 🔊 Squeaks  
15. `DecoyDuck.java` → ❌ Cannot fly, ❌ Sinks, ❌ No quacking  
16. `RedheadDuck.java` → ✅ Flies, ✅ Swims, ✅ Quacks  

### **Main Program**
17. `Main.java` → Entry point of the program  
   - Displays Menu  
   - Allows User Selection  
   - Runs Duck Behaviors  







 
