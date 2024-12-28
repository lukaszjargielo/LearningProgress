package org.example;

public class StringManipulator {
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
