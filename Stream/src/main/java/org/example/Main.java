package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        List<String> listOfSkills = users.stream()
                .map(User::skills)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        listOfSkills.forEach(System.out::println);
        System.out.println();

        Set<String> setOfSkills = users.stream()
                .map(User::skills)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        setOfSkills.forEach(System.out::println);
        System.out.println();

        String  collectedElements = users.stream()
                .map(User::skills)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", "));

        System.out.println(collectedElements);

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