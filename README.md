# Learn-Java-Interfaces

This Java project demonstrates how to implement multiple interfaces in a single class. Basic example of interface with multiple inheritance. The `Learn` class implements two interfaces, `A` and `B`, and provides concrete implementations for their methods.

## Overview

- The project consists of two interfaces:
  - `A`: Contains the `read()` method.
  - `B`: Contains the `write()` method.
- The `Learn` class implements both `A` and `B`, providing concrete implementations for the methods `read()` and `write()`.
- The `App` class contains the `main` method, where an object of `Learn` is created, and both `read()` and `write()` methods are called.

## Features

- Demonstrates **interface inheritance** and **multiple interface implementation** in Java.
- Shows how to define methods in interfaces and override them in the implementing class.
- Simple and clear illustration of Java polymorphism and method overriding.

## Technologies Used

- Java 8 or higher (for interface implementation)

## Code Structure

- `A`: Interface with the `read()` method.
- `B`: Interface with the `write()` method.
- `Learn`: A class implementing both `A` and `B` with overridden methods.
- `App`: The main class where the program is executed.

## Output

  Learn - read
  
  Learn - write
