import java.util.ArrayList;
import java.util.Scanner;

public class NamesListWithInterface_v_1_0_0 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 -> Display a list\n" +
                    "2 -> Add a name\n" +
                    "3 -> Remove a name\n" +
                    "4 -> Exit\n" +
                    "What do you want to do? Type a number:");
            int actionNumber = Integer.valueOf(scanner.nextLine());


            switch (actionNumber) {
                case 1 -> {
                    if (names.isEmpty()) {
                        System.out.println("List is empty!\n");
                    } else {
                        System.out.println("List:");
                        for (String name : names) {
                            System.out.println(name.replace(name.charAt(0),Character.toUpperCase(name.charAt(0))));
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Type a name:");
                    String name = scanner.nextLine();
                    names.add(name.toLowerCase());
                    System.out.println("Name " + name + " has been added.\n");
                }
                case 3 -> {
                    System.out.println("What name do you want to remove? Type the name: ");
                    String name = scanner.nextLine();
                    boolean onTheList = true;
                    while (onTheList) {
                        if (names.contains(name.toLowerCase())) {
                            names.remove(name.toLowerCase());
                        } else {
                            onTheList = false;
                        }
                    }
                    System.out.println("Name " + name + " has been removed from the list.");
                }
                case 4 -> System.exit(0);
            }
        }
    }
}