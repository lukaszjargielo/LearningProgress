import java.util.HashMap;
import java.util.Scanner;

public class LettersOccurrence_v_1_0_0 {
    public static void main(String[] args) {

        HashMap<Integer, Character> sentenceContent = new HashMap<>();
        HashMap<Character, Integer> letterOccurrence = new HashMap<>();

        System.out.println("Type anything:");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            sentenceContent.put(i, c);
        }

        for (int i = 0; i < sentenceContent.size(); i++) {
            char c = sentenceContent.get(i);

            if (letterOccurrence.containsKey(c)) {
                int value = letterOccurrence.get(c);
                letterOccurrence.put(c, ++value);
            } else {
                letterOccurrence.put(c, 1);
            }

        }
        for (char c : letterOccurrence.keySet()) {
            System.out.println("letter: " + c + " number of occurences: " + letterOccurrence.get(c));
        }


    }
}