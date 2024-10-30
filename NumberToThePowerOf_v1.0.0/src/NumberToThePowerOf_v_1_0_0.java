import java.util.Scanner;

public class NumberToThePowerOf_v_1_0_0 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Give two integers: ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            double score = pow(num1, num2);
            System.out.println("Number " + num1 + " to the power of number " + num2 + " equals: " + score);

        }
    }

    private static double pow(int num1, int num2) {
        if (num2 < 0) {
            double result = num1;

            for (int i = 1; i < Math.abs(num2); i++) {
                result *= num1;
            }
            return 1 / result;
        }
        if (num2 == 0) {
            double result = 0;
            return result = 1;
        }

        if (num2 == 1) {
            double result = num1;
            return result;
        }

        double result = num1;

        for (int i = 1; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}