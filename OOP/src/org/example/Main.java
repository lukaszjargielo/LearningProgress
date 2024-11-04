package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A7", "silver");
        Car car2 = new Car("Suzuki", "Swift", 2024, "red");

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.color = "total rust";

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        
    }
}