import java.util.Scanner;

public class TotalOf_N_NaturalNumbers_1_0_0 {
    public static void main(String[] args) {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give the natural number");
            int num = scanner.nextInt();
            int score = 0;
            for (int i = 0; i < num; i++) {
                score += i;
            }
            System.out.println("The total of the first " + num + " natural numbers is: " + score);
        }
    }
}