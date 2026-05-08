# Vehicle Rental System

A console-based Java application demonstrating the four pillars of Object-Oriented Programming (OOP):

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

# Project Overview

The Vehicle Rental System allows a rental company to manage different types of vehicles and customers.

Users should be able to:
- View available vehicles
- Rent vehicles
- Return vehicles
- View rented vehicles
- Calculate rental costs

This project is designed to test your understanding of Java OOP concepts and your ability to apply them in a real-world scenario.

---

# OOP Concepts Required

## 1. Abstraction

Create an abstract class called:

```java
Vehicle
```

The class must contain:
- common vehicle attributes
- abstract methods

Example:

```java
public abstract void displayDetails();

public abstract double calculateRentalCost(int days);
```

---

## 2. Inheritance

Create the following child classes:

```java
Car
Motorcycle
Truck
```

All classes must inherit from:

```java
Vehicle
```

---

## 3. Encapsulation

All fields must be:

```java
private
```

Use:
- getters
- setters

Include validation where necessary.

Examples:
- rental price cannot be negative
- rental days cannot be less than 1

---

## 4. Polymorphism

Store all vehicles inside:

```java
ArrayList<Vehicle>
```

Loop through the list and call:

```java
displayDetails();
```

Each vehicle should display information differently depending on its actual type.

---

# Functional Requirements

# Vehicle Class

## Attributes

```java
private String brand;
private String model;
private double rentalPrice;
private boolean isRented;
```

## Methods

```java
displayDetails()
calculateRentalCost()
```

---

# Car Class

## Additional Attribute

```java
numberOfDoors
```

## Rental Rule

Uses normal rental pricing.

---

# Motorcycle Class

## Additional Attribute

```java
hasHelmetIncluded
```

## Rental Rule

Apply a 5% discount if rented for more than 5 days.

---

# Truck Class

## Additional Attribute

```java
loadCapacity
```

## Rental Rule

Add an additional R500 heavy-duty fee if rented for more than 3 days.

---

# Customer Class

Create a class called:

```java
Customer
```

## Attributes

```java
private String name;
private String customerId;
```

## Methods

```java
rentVehicle(Vehicle vehicle)
returnVehicle(Vehicle vehicle)
```

---

# Menu System

Your application must include a working menu system similar to:

```text
===== VEHICLE RENTAL SYSTEM =====

1. View Vehicles
2. Rent Vehicle
3. Return Vehicle
4. View Rented Vehicles
5. Exit
```

The program should continue running until the user chooses Exit.

---

# Program Rules

- A rented vehicle cannot be rented again
- Returning a vehicle changes its rental status
- Rental cost must be calculated correctly 
- Use meaningful output messages

---

# Example Output

```text
Vehicle Type: Car
Brand: Toyota
Model: Corolla
Rental Price Per Day: R700
Doors: 4
Status: Available
```



---

# Assessment Rubric

| Section | Marks |
|----------|--------|
| Encapsulation | 20 |
| Inheritance | 20 |
| Abstraction | 20 |
| Polymorphism | 20 |
| Program Functionality | 10 |
| Code Quality & Readability | 10 |

**Total: 100 Marks**

---

# Submission Requirements

Students must submit:
- Fork first
- Push to your github

---

# Important Notes

- Use proper naming conventions
- Write clean and readable code
- Use comments where necessary

---

