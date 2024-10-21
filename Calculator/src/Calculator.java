import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 2 integers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Select operation from: + , - , * , /");
            scanner.nextLine();
            String operation = scanner.nextLine();
            switch (operation) {
                case "+" -> System.out.println(num1 + num2);
                case "-" -> System.out.println(num1 - num2);
                case "*" -> System.out.println(num1 * num2);
                case "/" -> System.out.println((double) num1 / num2);
                default -> System.out.println("Wrong choice. Try again.");

            }

        }
    }
}