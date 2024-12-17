package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Kamil","Mariusz", "Dominik", "Paulina", "Kasia", "Asia");
/*
        int femaleCount = 0;

        for(String name: names) {
            if(name.endsWith("a")) {
                femaleCount++;
            }
        }
        System.out.println(femaleCount);
*/
        long femaleCount = names.stream()
                .filter(name -> name.endsWith("a")).
                count();
        System.out.println(femaleCount);

        names.stream()
                .filter(name -> name.endsWith("a"))
                .forEach(System.out::println);

        names.forEach(System.out::println);
    }
}