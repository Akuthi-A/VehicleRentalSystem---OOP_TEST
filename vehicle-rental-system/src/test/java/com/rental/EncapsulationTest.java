package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncapsulationTest {

    @Test
    void testRentalPriceValidation() {

        Car car = new Car("Toyota", "Corolla", 700, 4);

        car.setRentalPrice(-100);

        // You should improve your setter to prevent invalid values
        assertTrue(car.getRentalPrice() >= 0);
    }
}