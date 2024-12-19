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

        Country country1 = new Country("Poland", "Cracow");
        Country country2 = new Country("Germany", "Berlin");
        Country country3 = new Country("France", "Paris");
        Country country4 = new Country("Poland", "Warsaw");

        List<Country> countries = List.of(country1, country2, country3);

        Map<String, String> mapOfCountries = countries.stream()
                .collect(Collectors.toMap(Country::name, Country::capital, (OldValue, newValue) -> newValue));

        System.out.println(mapOfCountries.get("Poland"));

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