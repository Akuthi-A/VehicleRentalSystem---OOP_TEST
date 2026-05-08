package com.rental;

// ========================================
// MAIN CLASS
// ========================================

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ARRAYLIST FOR POLYMORPHISM
        ArrayList<Vehicle> vehicles = new ArrayList<>();


        // SAMPLE OBJECTS
//        vehicles.add(new Car("Toyota", "Corolla", 700, 4));
//        vehicles.add(new Motorcycle("Yamaha", "R1", 500, true));
//        vehicles.add(new Truck("Volvo", "FH16", 1500, 20));


        int choice;

        do {

            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");

            System.out.println("1. View Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    // TODO:
                    // Display all vehicles

                    break;

                case 2:

                    // TODO:
                    // Rent vehicle

                    break;

                case 3:

                    // TODO:
                    // Return vehicle

                    break;

                case 4:

                    // TODO:
                    // Display rented vehicles

                    break;

                case 5:

                    System.out.println("Exiting system...");
                    break;

                default:

                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
