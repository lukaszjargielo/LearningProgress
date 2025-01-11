package pl.futurejava;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.WordUtils;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();*/

//        System.out.println("Hi " + name + "!  ");

        /*String template = "Hi ${name}!";
        StringSubstitutor substitutor = new StringSubstitutor(Map.of("name", name));
        String out = substitutor.replace(template);
        System.out.println(out);*/

        /*String string = "this is chapter title";
        String capitalized1 = StringUtils.capitalize(string);
        System.out.println(capitalized1);

        String capitalized2 = WordUtils.capitalize(string);
        System.out.println(capitalized2);*/

        //blank - null || "" || " " || "        "
        //empty - null || ""

        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank("   "));
        System.out.println(StringUtils.isBlank("            "));

        System.out.println();

        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isEmpty("        "));

        System.out.println(StringUtils.defaultString(getName(), "default value"));
    }

     private static String getName() {
        return null;
     }
}