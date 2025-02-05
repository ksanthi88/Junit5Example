package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void testUsesEquality(){
        Address address=new Address("123,Lake Strret","Lakeville");
        User user1=new User("john",address);
        User user2=new User("john",address);
        assertEquals(user1,user2,"Users with same name and address should be equal");
    }
}
