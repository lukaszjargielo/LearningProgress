package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give your date of birth in following format: yyyy-mm-dd");
        String dateOfBirth = scanner.nextLine();

        String[] split = dateOfBirth.split("-");
        int yearOfBirth = Integer.parseInt(split[0]);
        int monthOfBirth = Integer.parseInt(split[1]);
        int dayOfBirth = Integer.parseInt(split[1]);

        LocalDate localDateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        LocalDate localDateNow = LocalDate.now();
//        LocalDate dateNow = LocalDate.of(now);

        Period period = Period.between(localDateOfBirth, localDateNow);
        int userYears = period.getYears();
        int userMonths = period.getMonths();
        int userDays = period.getDays();
        System.out.println("You have: " + userYears + " years " + userMonths + " months and " + userDays + " days.");


        /*System.out.println("What is your year of birth?");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("What month were you born in?");
        System.out.println();*/


    }
}