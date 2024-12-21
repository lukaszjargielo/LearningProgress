package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        int[] numbers = {1, 2, 8, 40, 75};
        OptionalDouble average = Arrays.stream(numbers)
                .average();
        System.out.println(average.getAsDouble());

        IntStream intStream = IntStream.of(1, 2, 4, 9, 19);
        long counted = intStream.count();
        System.out.println(counted);

        DoubleStream.of(1.1, 1.2,1.3).forEach(System.out::println);

        IntStream.rangeClosed(0,10).forEach(System.out::println);
    }
    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();

        users.add(new User("Kamil", 35, List.of("Java", "Python", "JavaScript"), true));
        users.add(new User("Mariusz", 30, List.of("Java", "C#", "C++"), true));
        users.add(new User("Dominik", 20, List.of("Java", "Dart", "Python"), false));
        users.add(new User("Rafał", 40, List.of("C", "C++", "C#"), true));
        users.add(new User("Paulina", 31, List.of("Python", "JavaScript", "Rust"), true));
        users.add(new User("Kasia", 30, List.of("PHP", "Haskell"), false));
        users.add(new User("Asia", 25, List.of("Java", "Scala", "Kotlin", "Haskell", "Clojure"), true));

        return users;
    }
}