package com.Junit5Example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void sortArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] unSortedArray = {4,6,7,8,3,9};
        int[] sortedArray={3,4,6,7,8,9};
        assertArrayEquals(sortedArray, arrayUtils.sortArray(unSortedArray),"The array should be sorted in ascending order");
    }
}