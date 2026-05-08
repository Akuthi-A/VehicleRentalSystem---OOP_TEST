package com.rental;

/*
========================================
        VEHICLE RENTAL SYSTEM
========================================

TODO:
- Complete all classes
- Implement all methods
- Apply OOP principles correctly

========================================
*/

abstract class Vehicle {

    // ATTRIBUTES
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean isRented;

    // CONSTRUCTOR
    public Vehicle(String brand, String model, double rentalPrice) {
    }

    // GETTERS & SETTERS



    // ABSTRACT METHODS
    public abstract void displayDetails();

    // Calculation: rentalPrice * days
    public abstract double calculateRentalCost(int days);
}
