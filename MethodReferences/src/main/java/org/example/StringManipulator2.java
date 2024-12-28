package org.example;

public class StringManipulator2 {

    public String reverseString(String text) {
        String s = "";

        for (int i = text.length() - 1; i >= 0; i--) {
          s+= text.charAt(i);

        }

        return s;
    }
}
