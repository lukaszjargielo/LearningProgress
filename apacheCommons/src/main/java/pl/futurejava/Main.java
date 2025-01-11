package pl.futurejava;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();*/

//        System.out.println("Hi " + name + "!  ");

        /*String template = "Hi ${name}!";
        StringSubstitutor substitutor = new StringSubstitutor(Map.of("name", name));
        String out = substitutor.replace(template);
        System.out.println(out);*/

        /*String string = "this is chapter title";
        String capitalized1 = StringUtils.capitalize(string);
        System.out.println(capitalized1);

        String capitalized2 = WordUtils.capitalize(string);
        System.out.println(capitalized2);*/

        //blank - null || "" || " " || "        "
        //empty - null || ""

        /*System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank("   "));
        System.out.println(StringUtils.isBlank("            "));

        System.out.println();

        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isEmpty("        "));

        System.out.println(StringUtils.defaultString(getName(), "default value"));*/

        /*BidiMap<String, String> map = new TreeBidiMap<>();
        map.put("Cat", "fish");
        map.put("Dog", "meat");
        map.put("Rat", "cheese");

        System.out.println(map.get("Cat"));
        System.out.println(map.getKey("meat"));
        BidiMap<String, String> inversedBidiMap = map.inverseBidiMap();
        System.out.println(inversedBidiMap);*/

        Bag<String> guests = new HashBag<>();
        guests.add("Anne", 3);
        guests.add("Lucas", 2);
        System.out.println(guests);

        guests.forEach(System.out::println);
        System.out.println();

        guests.remove("Anne", 2);
        guests.forEach(System.out::println);
        System.out.println(guests.getCount("Lucas"));

        System.out.println();

        guests.uniqueSet().forEach(System.out::println);
    }

    /*private static String getName() {
        return null;
    }*/
}