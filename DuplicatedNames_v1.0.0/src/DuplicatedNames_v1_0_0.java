import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatedNames_v1_0_0 {
    public static void main(String[] args) {
        ArrayList<String> names1 = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();
        Set<String> duplicatedNames = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give 20 names: "  );

        for (int i = 0; i < 20; i++) {
            String name = scanner.nextLine();
            if (i < 10) {
                names1.add(name);
            } else {
                names2.add(name);
            }
        }

        for (String s : names1) {
            for (int i = 0; i < 10; i++) {
                if(s.equals(names2.get(i))) {
                    duplicatedNames.add(names2.get(i));
//                    System.out.println(names2.get(i));
                }
            }
        }
        System.out.println("Duplicated names: ");
        for (String s : duplicatedNames) {
            System.out.println(s);
        }
    }
}