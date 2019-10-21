package com.sparta.jm.sorters;

public class Quicksort implements Sorter {

    @Override
    public int[] getSortedArray(int[] array1) { // Rightmost Pivot
        return quickSort(array1,0,array1.length-1);
    }

    private int[] quickSort(int[] array1, int low_index, int high_index) {
        int i = low_index;
        int j = high_index;
        // calculate pivot number
        int pivot = array1[low_index + (high_index - low_index) / 2];
        // Divide into two arrays
        while (i <= j) {
            while (array1[i] < pivot) {
                i++;
            }
            while (array1[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;
                //move index to next position on both sides // decrement
                i++;
                j--;
            }
        }

        if (low_index < j) {
            int[] sortedArray = quickSort(array1, low_index, j);
        }
        if (i < high_index) {
            int[] sortedArray = quickSort(array1, i, high_index);
        }
        return array1;
    }

}



// merge sort iteratively
// split array into subarrays of size 1
