# Object-Oriented Programming (OOP) - CAT 2

## BBT 1203 - Object-Oriented Programming I

### Overview
This repository contains Java programs demonstrating key Object-Oriented Programming (OOP) concepts, including **Encapsulation, Method Overloading & Overriding, Abstraction, and Exception Handling**.

## Questions and Solutions

### 1. Encapsulation
**File:** `Student.java`  
- Implements a `Student` class with private attributes `name` and `grade`.  
- Provides public getter and setter methods.  
- Ensures `grade` is within 0 to 100; otherwise, sets it to 0.  

### 2. Method Overloading and Overriding
#### a) Method Overloading
**File:** `MathOperations.java`  
- Implements two `multiply()` methods: one for two integers and another for three integers.  

#### b) Method Overriding & Polymorphism
**File:** `TestPolymorphism.java`  
- Defines a base class `Animal` with a `makeSound()` method.  
- Overrides `makeSound()` in `Dog` and `Cat` subclasses.  
- Demonstrates polymorphism by calling `makeSound()` on both subclasses.  

### 3. Abstraction
**File:** `TestAbstraction.java`  
- Implements an abstract class `Appliance` with an abstract method `turnOn()`.  
- Defines two subclasses (`Fan` and `TV`) that override `turnOn()`.  
- Demonstrates abstraction by creating objects and calling `turnOn()`.  

### 4. Exception Handling
**File:** `ExceptionHandlingExample.java`  
- Accepts two numbers from the user and divides the first by the second.  
- Catches `ArithmeticException` if division by zero occurs.  
- Displays a meaningful message: **"Cannot divide by zero!"**.  

## How to Run the Programs
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/OOP-CAT2.git
