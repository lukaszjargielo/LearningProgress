package pl.futurejavacode.Strings;

import java.util.StringJoiner;

public class Concatenation {
    public static void main(String[] args) {


        String s1 = "Conca";
        String s2 = "tenation";

        System.out.println(s1 + s2);
        System.out.println("Conca" + "tenation");
        System.out.println("Conca" + 1 + 2 + "tenation");
        System.out.println(1 + 2 + "Conca" + "tenation");
        System.out.println("Conca" + "tenation" + 1 + 2);
        System.out.println();

        System.out.println(s1.concat(s2));
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder(s1);
        StringBuilder appendedString = stringBuilder.append(s2);
        System.out.println(appendedString);
        System.out.println(stringBuilder);
        stringBuilder.append(" && ");
        stringBuilder.append(stringBuilder);
        System.out.println(stringBuilder);
        stringBuilder.delete(stringBuilder.length() - 4, stringBuilder.length() - 1);
        System.out.println(stringBuilder);
        System.out.println();

        String joinedStrings = String.join(" && ", s1 + s2, s1 + s2);
        System.out.println(joinedStrings);
        System.out.println();

        StringJoiner stringJoiner = new StringJoiner(" && ");
        stringJoiner.add(s1 + s2);
        stringJoiner.add(s1 + s2);
        System.out.println(stringJoiner);

        Files.wr

    }
}
