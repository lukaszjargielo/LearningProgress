package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) {

        Path pathInput = Paths.get(RESOURCES + args[0]);
        Path pathOutput = Paths.get(RESOURCES + args[1]);
        List<String> namesStartWithA = new ArrayList<>();

        try {

            List<String> lines = Files.readAllLines(pathInput);

            for (String line : lines) {
                if (line.startsWith("A")) {
                    namesStartWithA.add(line);
                }
            }
            try {
                Files.write(pathOutput, namesStartWithA, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Something gone wrong during writing to a file.");
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println("Something gone wrong during reading a file.");
            throw new RuntimeException();
        }

    }
}