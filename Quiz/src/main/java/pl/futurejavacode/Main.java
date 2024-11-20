package pl.futurejavacode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src/main/resources/Q&A.txt");
        List<String> lines = Files.readAllLines(path);
        int correctAnswers = 0;


        for (String line : lines) {
            String[] splits = line.split(";");
            int count = 0;
            for (String split : splits) {
                if (split.endsWith("?")) {
                    count = 0;
                    System.out.println(split);
//                } else if (count == 4) {
//                    System.out.println();
//                    continue;
                } else if (Character.isDigit(split.charAt(split.length() - 1))) {
                    System.out.println();
                    System.out.println("Którą odpowiedź wybierasz?");
                    String answer = scanner.nextLine();
                    if (answer.endsWith(split)) {
                        System.out.println("Odpowiedź poprawna.\n");
                        correctAnswers++;

                    } else {
                        System.out.println("Odpowiedź niepoprawna.");
                        System.out.println("Prawidłowa odpowiedź to " + split + " - " + splits[Integer.parseInt(split)]);
                    }
                    continue;
                } else {
                    System.out.println(++count + "." + split);

                }
            }

        }

        System.out.println("Liczba prawidłowych odpowiedzi to: " + correctAnswers);
    }
}