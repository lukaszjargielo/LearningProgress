import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczbê godzin Nejciu i naciœnij Enter:");
            int hours = scanner.nextInt();

            System.out.println("Podaj liczbê minut Nejciu i naciœnij Enter:");
            int minutes = scanner.nextInt();

            System.out.println("Podaj liczbê sekund Nejciu i naciœnij Enter:");
            int seconds = scanner.nextInt();

            int totalTime = hours * 3600 + minutes * 60 + seconds;
            System.out.println("Nejciu, ca³kowity czas e-booka w sekundach wynosi: " + totalTime);
        }
    }
}