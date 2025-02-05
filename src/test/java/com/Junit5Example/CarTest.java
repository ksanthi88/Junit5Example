package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void testCarEquality() {
        Car car1 = new Car("Toyota","Camry");
                Car car2 = new Car("Toyota", "Camry");
                assertEquals(car1, car2,"Cars with same make and model are equal");

    }
}

