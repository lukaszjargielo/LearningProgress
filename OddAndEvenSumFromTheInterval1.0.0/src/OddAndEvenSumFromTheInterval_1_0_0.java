import java.util.Scanner;

public class OddAndEvenSumFromTheInterval_1_0_0 {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Give two integers as the beginning and the end of a numerical interval: ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int numStop = 0;
            int numStart = 0;
            int sumEven = 0;
            int sumOdd = 0;

            if (num1 < num2) {
                numStart = num1;
                numStop = num2;
            } else {
                numStart = num2;
                numStop = num1;
            }
            while (numStart <= numStop) {
                if (numStart % 2 != -1 && numStart % 2 != 1) {
                    sumEven += numStart;
                    numStart++;
                } else {
                    sumOdd += numStart;
                    numStart++;
                }
            }
            System.out.println("The sum of even numbers between " + numStart + " and " + numStop + " is: " + sumEven);
            System.out.println("The sum of odd numbers between " + numStart + " and " + numStop + " is: " + sumOdd);
        }
    }
}