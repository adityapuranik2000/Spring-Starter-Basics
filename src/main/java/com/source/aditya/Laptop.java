package com.source.aditya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component //This annotation defines that Spring has to manage the bean creation and destruction for this class
public class Laptop {

    @Autowired // This annotation injects the bean of CPU class here.
    CPU cpu;

    public void start(){

        cpu.load();
        System.out.println("CPU geared up now opening the laptop..");
    }
}
