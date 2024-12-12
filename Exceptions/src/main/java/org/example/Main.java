package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        NamesReader namesReader = new NamesReader("src/main/resources/text.txt");
        namesReader.printAllNames();

        NamesReader2 namesReader2 = new NamesReader2("src/main/resources/text2.txt");
        try {
            namesReader2.readNames();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}