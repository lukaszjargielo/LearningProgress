import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfNameOccurrence_v_1_0_0 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        names.add("³ukasz");
        names.add("natalia");
        names.add("tobiasz");
        names.add("justyna");
        names.add("ania");
        names.add("gra¿yna");
        names.add("danuta");
        names.add("anita");
        names.add("³ukasz");
        names.add("natalia");
        names.add("natalia");


        System.out.println("Give a name:");

        String name = scanner.nextLine();

        if (names.contains(name.toLowerCase())) {

            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).equals(name.toLowerCase())) {
                    System.out.println("Index of occurrence: " + i);
                }

            }
        } else {
            System.out.println("There is no name in the list");
        }
    }
}