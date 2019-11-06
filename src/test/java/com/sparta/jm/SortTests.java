package com.sparta.jm;

import static org.junit.Assert.*;

import com.sparta.jm.sorters.BubbleSort;
import com.sparta.jm.sorters.Sorter;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortTests
{
    private Sorter sorter;
    private int[] arrayToSort;

    @Before
    public void setup(){
        sorter = new BubbleSort();
        arrayToSort = new int[]{5,20,1,4,10};

    }

    @Test
    public void testArraySorted() {
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        for(int i = 0; i < arrayToSort.length-1;i++){
            assertTrue(sortedArray[i] <= sortedArray[i+1]);
        }
    }

    @Test
    public void testArrayNotEmpty(){
        assertTrue(arrayToSort.length != 0);
    }

    @Test
    public void testArraySameSize(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        assertEquals(arrayToSort.length,sortedArray.length);
    }

    @Test
    public void testArrayNegativeValues(){
        for(int i = 0; i < arrayToSort.length-1;i++){
            assertTrue(arrayToSort[i] >= 0);
        }
    }

    @Test
    public void testArrayDuplicateValues(){
        int[] copyOfArray = arrayToSort.clone();
        for(int i = 0; i < arrayToSort.length-1;i++){
            assertFalse(arrayToSort[i] == copyOfArray[i]);
        }
    }

    @Test
    public void testArrayNullInput(){
        assertFalse(arrayToSort.length == 0);
    }

    @Test
    public void testArraySingleElement(){
        assertTrue(arrayToSort.length > 1);
    }
}
