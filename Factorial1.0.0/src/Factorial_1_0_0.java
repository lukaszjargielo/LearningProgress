import java.util.Scanner;

public class Factorial_1_0_0 {
    public static void main(String[] args) {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Give a non-negative natural number:");
            int n = scanner.nextInt();
            long factorial = 1;
            if (n == 0) {
                System.out.println("The factorial from " + n + " is: " + factorial );
            } else {
                int i = 1;
                while (i <= n) {
                    factorial *= i;
                    i++;
                }
                System.out.println("The factorial from " + n + " is: " + factorial);
            }
        }
    }
}