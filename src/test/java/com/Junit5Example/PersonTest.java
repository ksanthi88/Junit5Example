package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void  testPersonEquality(){
        Person person1 = new Person("John Doe",30);
        Person person2 = new Person("John Doe",30);
        assertEquals(person2, person1,"Persons should be equal");
    }
}
