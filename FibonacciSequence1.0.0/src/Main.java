import java.util.Scanner;

public class FibonacciSequence_1_0_0 {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("How many expressions of the Fibonacci sequence to display? Give a number: ");

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int Fprev = 0;
            int Fnext = 1;
            int Fsum = Fprev + Fnext;

            switch (num) {
                case 0 -> System.out.println();
                case 1 -> System.out.println(Fprev);
                case 2 -> {
                    System.out.print(Fprev + " ");
                    System.out.print(Fnext + " ");
                    System.out.println();
                }
                case 3 -> {
                    System.out.print(Fprev + " ");
                    System.out.print(Fnext + " ");
                    System.out.print(Fsum + " ");
                    System.out.println();
                }
                default -> {
                    System.out.print(Fprev + " ");
                    System.out.print(Fnext + " ");
                    System.out.print(Fsum + " ");

                    for (int Fi = 3; Fi < num; Fi++) {
                        Fprev = Fnext;
                        Fnext = Fsum;
                        Fsum = Fprev + Fnext;
                        System.out.print(Fsum + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}