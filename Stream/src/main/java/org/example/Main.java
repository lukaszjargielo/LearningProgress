package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        Map<Integer, List<String>> collectedData = users.stream()
                .map(User::name)
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collectedData);

        Map<Boolean, List<User>> collectedData2 = users.stream()
                .collect(Collectors.partitioningBy(User::isActive));
        System.out.println(collectedData2);
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