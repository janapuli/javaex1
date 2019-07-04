package com.janani.training.java.modal;

public class Car implements Vehicle{


    @Override
    public void move() {
        System.out.println("car is moved");
    }

    @Override
    public void stop() {
        System.out.println("car is broken");
    }
}
