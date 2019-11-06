package com.sparta.jm.display;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class DisplayManager {

//    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
//        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
//        System.out.println("Sorted array using: " + sortType);
//        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
//    }

    private Scanner scanner = new Scanner(System.in);

    public String displayTerminalSortTypeRequest(String path){
        System.out.println("Enter the number of the sorter you wish to use: ");
        String[] sortNames = getMenuItems(path); //get
        int sortType = scanner.nextInt();
        return sortNames[sortType-1];
    }

    public String displayTerminalArraySizeRequest(){
        System.out.println("Please enter the size of the array");
        return scanner.nextLine();
    }

    public void printBeforeSort(int[] arrayToSort){
        System.out.println("Unsorted Array: " + Arrays.toString(arrayToSort));
    }

    public void printAfterSort(int[] sortedArray, long time) {
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println("Time taken: " + time);
    }

    public String displayUnsortedArray(){
        return "hello";
    }


//    private String[] getMenuItems(String path){
//        File sortDirectory = new File(path);
//        String[] names = sortDirectory.list();
//        Arrays.sort(names != null ? names : new String[0]); // safeguard
//        int index = 1;
//        for(String name : names){
//            if(!name.equals("Sorter.java")){
//                name = name.substring(0,name.indexOf('.'));
//                System.out.println(index + ". " + name);
//                index++;
//            }
//        }
//        return names;
//    }

    private String[] getMenuItems(String path){
        AtomicInteger index = new AtomicInteger(1);
        File sortDirectory = new File(path);
        List<String> namesAsList = Arrays.asList(sortDirectory.list());

        namesAsList.stream()
                .filter(fileName -> !fileName.equals("Sorter.java"))
                .map(fileName -> fileName.substring(0, fileName.indexOf('.'))) // pass in stream and a function
                .sorted()
                .forEach(name -> System.out.println(index.getAndIncrement() + ". " + name));

        return namesAsList.toArray(new String[namesAsList.size()]);
    }
}
