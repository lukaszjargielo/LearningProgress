import java.util.Scanner;

public class DescendingNumbers1_0_0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 integers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max, min, between;
        max = min = between = num1;

        if (num2 > max) {
            max = num2;
        } else {
            min = num2;
        }

        if (num3 > max) {
            between = max;
            max = num3;
        } else if (num3 < min) {
            between = min;
            min = num3;
        } else {
            between = num3;
        }
        System.out.println("Descending order of entered number: " + max + " " + between + " " + min);

    }
}