import java.util.ArrayList;
import java.util.Scanner;

public class GuestList_v_1_0_0 {
    public static void main(String[] args) {

        System.out.println("How many names do you want to enter?");

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int namesNumber = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int maleNumber = 0;
        int femaleNumber = 0;

        while (i < namesNumber) {
            System.out.println("Type the name:");
            String name = scanner.nextLine();
            names.add(name);
            i++;
        }

        for (String s : names) {
            if (s.endsWith("a")) {
                femaleNumber++;
            } else {
                maleNumber++;
            }
        }

        System.out.println("The list contains: " + femaleNumber + " female(s) and " + maleNumber + " male(s).");


    }
}