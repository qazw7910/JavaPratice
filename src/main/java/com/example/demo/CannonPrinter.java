package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CannonPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Cannon Printer: " + message);
    }
}
