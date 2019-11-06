package com.sparta.jm.manager;

import com.sparta.jm.sorters.BubbleSort;
import com.sparta.jm.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class SortFactory {
    private static final String PATH = "resources/sort.properties";
    private static final String KEY = "sort";

    String sortType = null;

    public static Sorter getInstance() {
        String sortType = null;
        try {
            Properties properties = new Properties();
            properties.load(new FileReader(PATH));
            sortType = properties.getProperty(KEY);
            Class selectedSorter = Class.forName(sortType); // create the class for the sort type, then create the instance
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance(); // find construcotr within the created class, then creates a new instance of that class.
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Exception found - defaulting to bubble sort");
            return new BubbleSort();
        }
    }
}

//        if (sortType.equals("bubble")){
//            return new BubbleSort();
//        }
//        else if (sortType.equals("merge")){
//            return new MergeSort();
//        }
//        else if(sortType.equals("quicksort")){
//            return new Quicksort();
//        }
//        else{
//            return null;
//        }