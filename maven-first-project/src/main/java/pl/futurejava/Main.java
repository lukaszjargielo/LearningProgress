package pl.futurejava;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        File usersFile = new File("src/main/resources/users.json");
        List<User> users = mapper.readValue(usersFile, new TypeReference<List<User>>() {
        });

        for (User user : users ) {
            System.out.println(user.getName() + ", " + user.getAge());
        }

        Car car1 = new Car("Audi", 5, true, 10.2);
        Car car2 = new Car("VW", 3, false, 6.5);
        Car car3 = new Car("Kia", 5, true, 12.7);
        Car car4 = new Car("BMW", 3, false, 8.1);

        List<Car> cars = new ArrayList<>();
        cars = Arrays.asList(car1, car2, car3, car4);

        mapper.writeValue(new File("src/main/resources/cars.json"), car1);
        mapper.writeValue(new File("src/main/resources/carsList.json"), cars);

    }
}