import java.util.Scanner;

public class Pyramid_v_2_0_0 {
    public static void main(String[] args) {

        System.out.println("Give a number of rows to build a star pyramid:");

        Scanner scanner = new Scanner(System.in);
        int rowsNumber = scanner.nextInt();

        int fieldsNum = (rowsNumber * 2) - 1;

        int spaceNum = 0;
        int asteriskNum = 0;


        for (int j = 10; j <= fieldsNum; j++) {
            spaceNum = fieldsNum - j;
            asteriskNum = j - spaceNum;
            while (spaceNum > 0) {
                System.out.print(" ");
                spaceNum--;
            }
            while (asteriskNum > 0) {
                System.out.print("*");
                asteriskNum--;
            }
            System.out.println();
        }
    }
}