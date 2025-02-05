package com.Junit5Example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
private Calculator calculator;
//Initialize a fresh Calculator instance before each test
@BeforeEach
void setUp() {
    calculator=new Calculator();
}
   @Test
    public void testAddition(){
Calculator calculator = new Calculator();
int result = calculator.add(3,2);
assertEquals(5, result,"The Addition result should be 5");
    }
    @Test
public void testSubtraction(){
       int result = calculator.subtract(3,2);
       assertEquals(1, result,"The Subtraction result should be 1");
}
@Test
    public void testMultiplication(){
       int result = calculator.multiply(6,6);
       assertEquals(36, result,"The Multiplication result should be 36");
}
@Test
    public void testDivision(){
       double result = calculator.divide(6,6);
       assertEquals(1, result,"The Division result should be 1");
}
@Test
    public void testFactorial(){
       int result=calculator.myFactorial(5);
       assertEquals(120, result,"The Factorial result should be 120");
       result=calculator.myFactorial(0);
       assertEquals(1, result,"The Factorial of 0 result should be 1");
       result=calculator.myFactorial(-1);
       assertThrows(IllegalArgumentException.class,()->calculator.myFactorial(-1),"Factorial of negative numbers should throw an IllegalArgumentException");
}
}
