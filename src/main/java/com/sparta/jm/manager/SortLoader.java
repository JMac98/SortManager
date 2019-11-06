package com.sparta.jm.manager;

import com.sparta.jm.sorters.Sorter;

public class SortLoader {
    private static final String SRC = "/src/main/java/";
    private String name;

    { //anonblock, this will run when an instance of sort loader is created.
        String classpath = Sorter.class.getName(); //gets the full path of the class com.sparta.jm.sorters.Sorter
        name = classpath.substring(0,classpath.lastIndexOf('.')); // com.sparta.jm.sorters
    }

    public String getSortersLocation(){
        String classpathStr = System.getProperty("user.dir"); //return the current working directory
        return(classpathStr + SRC + name.replace('.' , '/'));
    }

    public Sorter getSorter(String sortType) {
        try{
            String sorterName = name + "." + sortType.substring(0,sortType.lastIndexOf('.'));
            Class selectedSorter = Class.forName(sorterName);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}