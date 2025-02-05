package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverse() {
        StringManipulator manipulator = new StringManipulator();
        String reversed = manipulator.reverse("hello");
        assertEquals("olleh", reversed);
    }
}