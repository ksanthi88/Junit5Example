package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void testBookEquality(){
        Book book1=new Book("Java","Deepi");
        Book book2=new Book("Java","Deepi");
        assertEquals(book1,book2,"Books name and author are the same");
    }
}
