package pl.futurejavacode;

import java.util.Scanner;

public class CarUse1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What car do you want to create?");

        System.out.println("Specify car make:");
        String make = scanner.nextLine();

        System.out.println("Specify car model:");
        String model = scanner.nextLine();

        System.out.println("Specify car year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Specify car color:");
        String color = scanner.nextLine();

        System.out.println("Specify car maximum speed:");
        int maxSpeed = Integer.parseInt(scanner.nextLine());

        System.out.println("Specify car maximum range:");
        int maxRange = Integer.parseInt(scanner.nextLine());

        Car car1 = new Car(make, model, year, color, maxSpeed, maxRange);

        System.out.println("You have created the car:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Maximum speed: " + car1.getMaxSpeed());
        System.out.println("Range: " + car1.getMaxRange() + " in kilometers.");
        System.out.println();

        while (true) {
            System.out.println("If you want to drive press 1");
            System.out.println("If you want to tank fuel press 2");
            System.out.println("If you want to exit press 3");
            System.out.println();

            int actionNumber = Integer.parseInt(scanner.nextLine());

            switch (actionNumber) {
                case 1 -> {
                    if(car1.getActualRange() == 0) {
                        System.out.println("You must tank fuel.");
                        break;
                    }
                    System.out.println("Specify what distance do you want to cover:");
                    int distance = Integer.parseInt(scanner.nextLine());
                    if (distance > maxRange) {
                        distance = maxRange;
                    }
                    car1.drive(distance);
                    System.out.println("Actual mileage: " + car1.getMileage());
                    System.out.println("Remaining distance to cover: " + (car1.getMaxRange() - distance));
                }
                case 2 -> {
                    car1.addFuel();
                    System.out.println("Actual mileage: " + car1.getMileage());
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }

//        Car car1 = new Car("Suzuki", "Swift", "red");
//        Car car2 = new Car("VW", "Passat", 2024, "silver");
//
//        System.out.println(car1.make);
//        System.out.println(car1.model);
//        System.out.println(car1.year);
//        System.out.println(car1.color);
//        System.out.println();
//        System.out.println(car2.make);
//        System.out.println(car2.model);
//        System.out.println(car2.year);
//        System.out.println(car2.color);
//        System.out.println();
//
//        car1.color = "black";
//        car2.year = 2022;
//
//        System.out.println(car1.color);
//        System.out.println(car2.year);

    }
}
