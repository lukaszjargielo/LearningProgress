import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczb� godzin Nejciu i naci�nij Enter:");
            int hours = scanner.nextInt();

            System.out.println("Podaj liczb� minut Nejciu i naci�nij Enter:");
            int minutes = scanner.nextInt();

            System.out.println("Podaj liczb� sekund Nejciu i naci�nij Enter:");
            int seconds = scanner.nextInt();

            int totalTime = hours * 3600 + minutes * 60 + seconds;
            System.out.println("Nejciu, ca�kowity czas e-booka w sekundach wynosi: " + totalTime);
        }
    }
}