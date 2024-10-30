import java.util.Scanner;

public class Pyramid_v_1_0_0 {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Give a number of rows to build pyramid: ");

            Scanner scanner = new Scanner(System.in);
            int rowsNumber = scanner.nextInt();

            int asteriskNumber = -1;
            for (int i = 1; i <= rowsNumber; i++) {

                for (int j = i; j <= i; j++) {
                    System.out.println(" ".repeat(rowsNumber - j) + "*".repeat(asteriskNumber += 2) + " ".repeat(rowsNumber - j));

                }
            }
        }
    }
}