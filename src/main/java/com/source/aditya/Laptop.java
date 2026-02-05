package com.source.aditya;
import org.springframework.stereotype.Component;


@Component //This annotation defines that Spring has to manage the bean creation and destruction for this class
public class Laptop {

    public void start(){
        System.out.println("Starting...");
    }
}
