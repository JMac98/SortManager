package com.sparta.jm.manager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App
{
    private static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    private static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args)
    {
        initaliseLogging();
//        Logging logger = new Logging();
//        logger.setMessage("Welcome to logging");
//        logger.displayMessage();
//        log.error("Oh no");

        new SortManager().sortArray();
    }

    public static void initaliseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        log.trace("Logging initialised");
    }

}
