package pl.futurejavacode;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        String s1 = "2";
        System.out.println(Character.isDigit(s1.charAt(s1.length()-1)));

        LocalDate date = LocalDate.of(2024, 11, 19);
        System.out.println(LocalTime.now()) ;
    }
}
