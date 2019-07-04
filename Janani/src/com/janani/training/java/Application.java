package com.janani.training.java;

import com.janani.training.java.modal.Airplane;
import com.janani.training.java.modal.Car;
import com.janani.training.java.modal.Vehicle;

public class Application {
    public static void main(String[] args) {
        //System.out.println("Hello java");

        Vehicle car =new Car();
        car.move();

        Vehicle airplane = new Airplane();
        airplane.move();



    }


}
