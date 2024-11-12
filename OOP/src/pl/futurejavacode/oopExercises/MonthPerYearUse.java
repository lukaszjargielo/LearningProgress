package pl.futurejavacode.oopExercises;

import java.util.Scanner;

public abstract class MonthPerYearUse {

    public static void monthAndItsDays() {
        System.out.println("Type the name of the month to check the number of days:");

        Scanner scanner = new Scanner(System.in);

        String upperCaseMonth = (scanner.nextLine()).toUpperCase();

        MonthsPerYear monthsPerYear = MonthsPerYear.valueOf(upperCaseMonth);

        switch (monthsPerYear) {
            case JANUARY,
                 FEBRUARY,
                 MARCH,
                 APRIL,
                 MAY,
                 JUNE,
                 JULY,
                 AUGUST,
                 SEPTEMBER,
                 OCTOBER,
                 NOVEMBER,
                 DECEMBER ->
                    System.out.println("Number of days in " + String.valueOf(monthsPerYear).toLowerCase() + ": " + monthsPerYear.getDaysPerMonth());
        }
    }
}
