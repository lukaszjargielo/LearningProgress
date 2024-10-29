import java.util.Scanner;

public class PrimeNumbers_v_1_0_0 {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Give two integers as a beginning and the end of interval:");

            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println("The prime numbers from the given interval: ");

            if (num2 < num1) {
                int temp = num1;
                num1 = num2;
                num2 = num1;
            }

            if (num1 < 2) num1 = 2;

            for (int i = num1; i <= num2; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) System.out.println(i);
            }
        }
    }
}