package org.example;

public class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = 2023;
    }

    public Car(String make, String model, int year, String color) {
        this(make, model, color);
        this.year = year;
    }
}
