package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = prepareData();

//Display user names who know Java

/*      users.stream()
                .filter(user -> user.skills().contains("Java"))
                .map(User::name)
                .forEach(System.out::println);
        System.out.println();
*/

//Display name and age of inactive users

/*      users.stream()
                .filter(user -> !user.isActive())
                .map(user -> user.name() + ", " + user.age() + " years old")
                .forEach(System.out::println);
*/

//Display name and known languages of users who know at least 3 of them.

/*      users.stream()
                .filter(user -> user.skills().size() >= 3)
                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
                .forEach(System.out::println);
*/

//Display name and known technologies of the most skilled user.

/*      String mostSkilledUser = users.stream()
                .max(Comparator.comparing(user -> user.skills().size()))
                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
                .get();

        System.out.println(mostSkilledUser);
*/

//Display an average age of active users.

/*      double averageAgeOfActiveUsers = users.stream()
                .filter(User::isActive)
                .mapToInt(User::age)
                .average()
                .getAsDouble();

        System.out.println(averageAgeOfActiveUsers);
*/

//Display an average age of inactive users.

/*
        double averageAgeOfInactiveUsers = users.stream()
                .filter(user -> !user.isActive())
                .mapToInt(User::age)
                .average()
                .getAsDouble();

        System.out.println(averageAgeOfInactiveUsers);
*/

//Display an average amount of known technologies

/*      double averageAmountOfKnownTechs = users.stream()
                .mapToInt(user -> user.skills().size())
                .average()
                .getAsDouble();

        System.out.println(averageAmountOfKnownTechs);
*/

// Divide users into 2 groups: knowing and unknowing Java.
// Display their names and known techs.

/*        Map<Boolean, List<User>> java = users.stream()
                .collect(Collectors.partitioningBy(user -> user.skills().contains("Java")));

          java.get(true).stream()
                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
                .forEach(System.out::println);

           System.out.println();

           java.get(false).stream()
                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
                .forEach(System.out::println);*/

//Check if all users are of legal age

/*         boolean isOfAge = users.stream()
                .allMatch(user -> user.age() >= 18);

            System.out.println(isOfAge);
*/

//Check if any user is 40 or older

/*          boolean fourtyOrOlder = users.stream()
                .anyMatch(user -> user.age() >= 40);

            System.out.println(fourtyOrOlder);
*/

//Find the oldest user who knows Java

/*          String theOldestJavaSpecialist = users.stream()
                .filter(user -> user.skills().contains("Java"))
                .max(Comparator.comparing(User::age))
                .get().name();

            System.out.println(theOldestJavaSpecialist);

            Optional<User> oldestJavaProgrammer = users.stream()
                .filter(user -> user.skills().contains("Java"))
                .max(Comparator.comparing(User::age));

            System.out.println(oldestJavaProgrammer.get().name() + ", " + oldestJavaProgrammer.get().age());
*/

//Find users who know languages start with "C" letter. Display their names and these techs. DIFFICULT

/*        users.stream()
                .filter(user -> user.skills().stream().anyMatch(skill -> skill.startsWith("C")))
                .map(user -> user.name() + " : " + String.join(", ", user.skills()))
                .forEach(System.out::println);
*/

//Create a map with users name as a key and number of known technologies as a value

/*         Map<String, Integer> collect = users.stream()
                .collect(Collectors.toMap(User::name, user -> user.skills().size()));

             for(Map.Entry<String, Integer> entry : collect.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " known languages.");
        }
*/

//Choose palindromes from the list.

/*         List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie", "anna");

           words.stream()
                 .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                 .forEach(System.out::println);

            System.out.println();

            words.stream()
                 .filter(word -> word.contentEquals(new StringBuilder(word).reverse()))
                 .forEach(System.out::println);
*/

//Display the list below as a comma separated capitalized words

/*
        List<String> words = List.of("kajak", "oko", "komputer", "ala", "zakaz", "java", "programowanie", "anna");

        String collectedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(collectedWords);
*/

//Find the s even number from 2 integers lists

        List<Integer> list1 = List.of(62, 55, 120, 17, 7, 11);
        List<Integer> list2 = List.of(42, 27, 35, 98);

        Integer theSmallestEvenNumber
                = Stream.concat(list1.stream(), list2.stream())
                .filter(num -> num % 2 == 0)
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(theSmallestEvenNumber);
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