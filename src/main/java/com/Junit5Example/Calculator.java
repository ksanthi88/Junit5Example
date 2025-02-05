package com.Junit5Example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
public int subtract(int a, int b) {
        return a - b;
}
public int multiply(int a, int b) {
        return a * b;
}
public double divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return(double) a / b;
}
public int myFactorial(int n)
{
        if(n<0)
        {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result*=i;
        }
        return result;
}
}
