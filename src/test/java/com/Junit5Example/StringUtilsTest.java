package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void getLength() {
        StringUtils stringUtils = new StringUtils();
       int result= stringUtils.getLength("abc");
       assertEquals(3,result,"The length of 'abc' should be 3");
    }
    @Test
    void testConcatenate(){
        StringUtils stringUtils = new StringUtils();
        String result= stringUtils.concatenate("Hello","World");
        assertEquals("HelloWorld",result,"The concatenated string should be HelloWorld");
    }
}