package com.sparta.jm.sorters;

import com.sparta.jm.controller.BinarySearchTree;

import java.util.Arrays;

public class BinarySearchTreeSort implements Sorter{

    @Override
    public int[] getSortedArray(int[] unsortedArray) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(unsortedArray.length);
        binarySearchTree.addElements(unsortedArray);
        int[] result = binarySearchTree.getSortedTreeAsc();
        int[] resultFix = Arrays.copyOfRange(result,1,result.length);
        return resultFix;
    }


    @Override
    public String toString() {
        return "Binary Search Tree Sorter";
    }
}
