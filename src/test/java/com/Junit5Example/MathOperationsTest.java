package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void multiply() {
        MathOperations mathOperations = new MathOperations();
        int result=mathOperations.multiply(3,4);
        assertEquals(12,result,"The result should be 12");
    }
    @Test
    void testAbsoluteValue() {
        MathOperations mathOperations = new MathOperations();
        int result=mathOperations.absoluteValue(-1);
        assertEquals(1,result,"The result should be -1");
    }
}