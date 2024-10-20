import java.util.Scanner;

public class DescendingNumbers3_0_0 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 3 integers:");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 < num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println(num1 + " " + num2 + " " + num3);
        }
    }
}