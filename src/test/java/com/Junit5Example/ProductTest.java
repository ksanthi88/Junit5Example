package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    void testProductEquality(){
        Product product1 = new Product("Tv",399.00);
        Product product2 = new Product("Tv",399.00);
        assertEquals(product1,product2,"Product name and price should be equal");
    }
}
