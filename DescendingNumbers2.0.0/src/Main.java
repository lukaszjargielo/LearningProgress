import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 3 integers:");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int max, between, min;
            max = between = min = num1;

            if (num1 >= num2 && num1 >= num3) {
                max = num1;
                if (num2 > num3) {
                    between = num2;
                    min = num3;
                } else {
                    between = num3;
                    min = num2;
                }
            }
            if (num2 >= num1 && num2 >= num3) {
                max = num2;
                if (num1 > num3) {
                    between = num1;
                    min = num3;
                } else {
                    between = num3;
                    min = num1;
                }
            }
            if (num3 >= num1 && num3 >= num2) {
                max = num3;
                if (num2 > num1) {
                    between = num2;
                    min = num1;
                } else {
                    between = num1;
                    min = num2;
                }
            }
            System.out.println("Descending order of entered numbers: " + max + " " + between + " " + min);

    }
}