package com.sparta.jm.manager;

import org.apache.log4j.Logger;

public class Logging {

    private String message;
    private static Logger log = Logger.getLogger(Logging.class.getName());

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
        log.trace("Message set");
    }

    public void displayMessage(){
        System.out.println("Message Printed - " + message);
    }

    public void deleteMessage(){

    }

}
