package com.sparta.jm.sorters;

public class Quicksort implements Sorter {
    @Override
    public int[] getSortedArray(int[] array1) {
        return quickSort(array1,0,array1.length-1);
    }

    public int[] quickSort(int[] array1, int low_index, int high_index) {
        int i = low_index;
        int j = high_index;
        //choose middle element as pivot
        int pivot = array1[low_index + (high_index - low_index) / 2];
        // Divide into two arrays
        while (i <= j) {
            while (array1[i] < pivot) {
                i++;
            }
            while (array1[j] > pivot) {
                j--;
            }
            if (i <= j) { //if element on the left side is smallers than the element on the rightside
                int temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;

                i++; //left
                j--; //right
            }
        }

        if (low_index < j) { //if
            array1 = quickSort(array1, low_index, j);
        }
        if (i < high_index) {
            array1 = quickSort(array1, i, high_index);
        }

        return array1;
    }

    @Override
    public String toString(){
        return "Quick Sorter";
    }
}
