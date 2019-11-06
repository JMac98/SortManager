package com.sparta.jm;

import com.sparta.jm.sorters.BubbleSort;
import com.sparta.jm.sorters.MergeSort;
import com.sparta.jm.sorters.Quicksort;
import com.sparta.jm.sorters.Sorter;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class PerformanceTester {

    private int[] unsortedArray;
    private static int[] arrayToSort;

    @BeforeClass
    public static void classSetup() {
        Random random = new Random();
        arrayToSort = new int[10000];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(arrayToSort.length) + 1;
        }
    }

    @Before
    public void setup(){
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSorter() {
        System.out.println("***********************" + Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        long timeTaken = end - start;

        printResults(sorter.toString(), timeTaken, sortedArray);
    }

    @Test
    public void testMergeSorter() {
        System.out.println("***********************" + Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        long timeTaken = end - start;

        printResults(sorter.toString(), timeTaken, sortedArray);
    }

    @Test
    public void testQuickSorter() {
        System.out.println("***********************" + Arrays.toString(unsortedArray));
        Sorter sorter = new Quicksort();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        long timeTaken = end - start;

        printResults(sorter.toString(), timeTaken, sortedArray);
    }

    private void printResults(String sorter, long time, int[] sortedArray) {
        DecimalFormat decimalFormatter = new DecimalFormat("###,###.####");
        System.out.println(sorter + ":");
        System.out.println("Size of the array: " + arrayToSort.length);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time taken " + (decimalFormatter.format(time)) + " nano seconds");
    }
}





