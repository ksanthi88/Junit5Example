package com.Junit5Example;

public class StringManipulator {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
