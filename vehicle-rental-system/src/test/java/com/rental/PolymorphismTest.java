package com.rental;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PolymorphismTest {

    @Test
    void testPolymorphicList() {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Toyota", "Corolla", 700, 4));
        vehicles.add(new Motorcycle("Yamaha", "R1", 500, true));
        vehicles.add(new Truck("Volvo", "FH16", 1500, 20));

        assertEquals(3, vehicles.size());

        // Ensures objects are stored as Vehicle type
        assertTrue(vehicles.get(0) instanceof Vehicle);
        assertTrue(vehicles.get(1) instanceof Vehicle);
        assertTrue(vehicles.get(2) instanceof Vehicle);
    }
}