package com.janani.training.java.modal;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Taking off");
    }

    @Override
    public void stop() {
        System.out.println("Landing");
    }
}
