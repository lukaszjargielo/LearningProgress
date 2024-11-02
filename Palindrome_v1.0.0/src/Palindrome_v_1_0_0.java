import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_v_1_0_0 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Type anything to see if it's a palindrome: ");
            Scanner scanner = new Scanner(System.in);
            String isSentencePalindrome = scanner.nextLine();
            ArrayList<Character> list = process(isSentencePalindrome);
            check(list);
        }
    }

    private static ArrayList process(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] letters = s.toCharArray();
        for (char c : letters) {
            if (Character.isLetter(c)) {
                char letter = Character.toLowerCase(c);
                list.add(letter);
            }
        }
        return list;
    }

    private static void check(ArrayList array) {
        boolean isThisPalindrome = true;
        for (int i = 0; i < array.size(); i ++) {
            char a = (char) array.get(i);
            char z = (char) array.get((array.size()-1) - i);
            if (a == z) continue;
            else {
                System.out.println("The given String is not a palindorome");
                isThisPalindrome = false;
                break;
            }
        }


        if(isThisPalindrome) System.out.println("A given String is a palindrome!");
    }
}