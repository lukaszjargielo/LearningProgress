import java.util.Scanner;

public class TheLargestNumber2_0_0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number from entered by user is: " + num1);

        } else if (num1 >= num2 && num1 < num3) {
            System.out.println("The largest number from entered by user is: " + num3);

        } else if (num1 < num2 && num2 < num3) {

            System.out.println("The largest number from entered by user is: " + num3);

        } else {
            System.out.println("The largest number from entered by user is: " + num2);

        }
    }
}