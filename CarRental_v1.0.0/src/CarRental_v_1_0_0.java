import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarRental_v_1_0_0 {
    public static void main(String[] args) {

        HashMap<String, String> cars = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        cars.put("Volkswagen Passat", "available");
        cars.put("Suzuki Swift", "available");
        cars.put("Volkswagen Transporter", "available");
        cars.put("Harvester John Deer", "available");
        cars.put("Horse-drawn carriage", "available");
        cars.put("Tractor John Deer", "available");
        cars.put("Lamborghini Diablo", "available");
        cars.put("Fiat Maluch", "available");
        cars.put("Lincoln limousine", "available");
        cars.put("Audi A7", "available");

        int countRentalCars = 0;
        while (true) {
            System.out.println(""" 
                    
                    MENU
                    1 -> Display all cars list.
                    2 -> Display only available cars.
                    3 -> Display your rentals.
                    4 -> Rent a car.
                    5 -> Exit.
                    """);

            int actionNumber = Integer.valueOf(scanner.nextLine());

            switch (actionNumber) {
                case 1 -> {
                    System.out.println("List of all cars:");
                    for (Map.Entry<String, String> entry : cars.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println(key + " - " + value);
                    }
                }
                case 2 -> {
                    System.out.println("List of available cars:");
                    for (Map.Entry<String, String> entry : cars.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (value.equals("available")) {
                            System.out.println(key + " - " + value);
                        }
                    }
                }
                case 3 -> {
                    if (countRentalCars == 0) {
                        System.out.println("You didn't rent a car.");
                    } else {
                        System.out.println("List of your rentals: ");

                        for (Map.Entry<String, String> entry : cars.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (value.equals("not available")) {
                                System.out.println(key);

                            }
                        }
                    }
                }

                case 4 -> {
                    if (countRentalCars < 3) {
                        System.out.println("Which car do you want to rent? Type the model: ");
                        String rentalCar = scanner.nextLine();
                        cars.put(rentalCar, "not available");
                        countRentalCars++;
                    } else {
                        System.out.println("You can rent up to 3 cars.");
                    }
                }
                case 5 -> {
                    System.exit(0);
                }

            }
        }
    }
}