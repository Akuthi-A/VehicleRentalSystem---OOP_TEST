package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarNormalPricing() {
        Car car = new Car("Toyota", "Corolla", 700, 4);

        double cost = car.calculateRentalCost(3);

        assertEquals(2100, cost);
    }

    @Test
    void testMotorcycleDiscountApplied() {
        Motorcycle bike = new Motorcycle("Yamaha", "R1", 500, true);

        double cost = bike.calculateRentalCost(6);

        // 500 * 6 = 3000 - 5% = 2850
        assertEquals(2850, cost);
    }

    @Test
    void testTruckHeavyDutyFee() {
        Truck truck = new Truck("Volvo", "FH16", 1500, 20);

        double cost = truck.calculateRentalCost(4);

        // 1500 * 4 = 6000 + 500 = 6500
        assertEquals(6500, cost);
    }
}
