package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = prepareData();

        Long numberOfStreamElements = users.stream()
                .collect(Collectors.counting());

        System.out.println(numberOfStreamElements);
        System.out.println();

        long countedStreamElements = users.stream()
                .count();
        System.out.println(countedStreamElements);
        System.out.println();

        IntSummaryStatistics sumOfAge = users.stream()
                .collect(Collectors.summarizingInt(User::age));

        System.out.println(sumOfAge);
        System.out.println();

        Integer totalAge = users.stream()
                .collect(Collectors.summingInt(User::age));

        System.out.println(totalAge);
        System.out.println();

        int summedAge = users.stream().mapToInt(User::age).sum();

        System.out.println(summedAge);
        System.out.println();

        Double averageAge = users.stream()
                .collect(Collectors.averagingInt(User::age));

        System.out.println(averageAge);

        Optional<Integer> maxAge = users.stream()
                .map(User::age)
                .collect(Collectors.maxBy(Comparator.naturalOrder() ));

        System.out.println(maxAge);

        Optional<Integer> maxAge2 = users.stream()
                .map(User::age)
                .max(Comparator.naturalOrder());
        System.out.println(maxAge2);

        IntSummaryStatistics statisticsData = users.stream()
                .collect(Collectors.summarizingInt(User::age));
        System.out.println(statisticsData);
        System.out.println(statisticsData.getMax());
        System.out.println(statisticsData.getMin());
        System.out.println(statisticsData.getAverage());
        System.out.println(statisticsData.getSum());
        System.out.println(statisticsData.getCount());
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