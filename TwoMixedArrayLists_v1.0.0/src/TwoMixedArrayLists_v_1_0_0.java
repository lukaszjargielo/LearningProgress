import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class TwoMixedArrayLists_v_1_0_0 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> mixedFruits = new ArrayList<>();
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        int index;

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Grapefruit");
        fruits.add("Orange");
        fruits.add("Blueberries");
        fruits.add("Plum");

        for (int i = 0; i < fruits.size(); i++) {
            mixedFruits.add("");
        }

        int i = 0;

        while (i < 10) {
            index = random.nextInt(10);
            if (!integers.contains(index)) {
                integers.add(index);
                mixedFruits.set(index, fruits.get(i));
                i++;
            }
        }
        for (String fruit : mixedFruits) {
            System.out.println(fruit);
        }
    }
}