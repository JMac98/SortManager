package com.sparta.jm.sorters;

import com.sparta.jm.controller.BinarySearchTree;

public class BinarySearchTreeSort implements Sorter{

    @Override
    public int[] getSortedArray(int[] unsortedArray) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(unsortedArray.length);
        return binarySearchTree.getSortedTreeAsc();
    }



    @Override
    public String toString() {
        return "Binary Search Tree Sorter";
    }
}
