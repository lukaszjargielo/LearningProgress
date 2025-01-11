package pl.futurejava;

import org.apache.commons.text.StringSubstitutor;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();

//        System.out.println("Hi " + name + "!  ");

        String template = "Hi ${name}!";
        StringSubstitutor substitutor = new StringSubstitutor(Map.of("name", name));
        String out = substitutor.replace(template);
        System.out.println(out);
    }
}