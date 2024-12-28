package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Kamil", "Mariusz", "Dominik");
        StringManipulator2 stringManipulator2 = new StringManipulator2();

        List<String> names2 = names.stream()
                .map(StringManipulator::reverseString)
                .toList();

        System.out.println(names2);

        List<String> names3 = names.stream()
                .map(stringManipulator2::reverseString)
                .toList();

        System.out.println(names3);

        Stream<StringBuilder> stringBuilderStream = names.stream()
                .map(StringBuilder::new);

         Function<String,String> reverseString = text -> new StringBuilder(text).reverse().toString();

         names.stream()
                 .map(reverseString)
                 .forEach(System.out::println);
    }
}