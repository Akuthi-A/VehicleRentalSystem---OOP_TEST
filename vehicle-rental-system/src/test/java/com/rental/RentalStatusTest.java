package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalStatusTest {

    @Test
    void testRentingVehicleChangesStatus() {

        Car car = new Car("Toyota", "Corolla", 700, 4);

        assertFalse(car.isRented());

        car.setRented(true);

        assertTrue(car.isRented());
    }
}