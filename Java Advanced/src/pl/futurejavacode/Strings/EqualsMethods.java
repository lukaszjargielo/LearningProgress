package pl.futurejavacode.Strings;

import java.util.Objects;

public class EqualsMethods {
    public static void main(String[] args) {
        String s1 = "EquALiTy";
        String s2 = "equality";
        String s3 = "equality";
        String s4 = null;

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println();

//        System.out.println(s4.equals(s3));
        System.out.println(s4 != null && s4.equals(s3));
//        System.out.println(s4 != null & s4.equals(s3));
//        System.out.println(s4.equals(s3) && s4 != null);
        System.out.println(s3.equals(s4));
        System.out.println();

        System.out.println(Objects.equals(s3, s4));
        System.out.println(Objects.equals(s4, s3));
        System.out.println();

        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
