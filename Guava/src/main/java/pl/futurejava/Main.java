package pl.futurejava;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private final static Map<String, String> countriesAndCapitals = new HashMap<>();
    private final static BiMap<String, String> guavaCountriesAndCapitals = HashBiMap.create();

    public static void main(String[] args) {

        /*countriesAndCapitals.put("Poland", "Warsaw");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("France", "Paris");

        System.out.println(countriesAndCapitals.get("Poland"));
        System.out.println(getCountry("Paris"));*/

        /*guavaCountriesAndCapitals.put("Poland", "Warsaw");
        guavaCountriesAndCapitals.put("Germany", "Berlin");
        guavaCountriesAndCapitals.put("France", "Paris");

        System.out.println(guavaCountriesAndCapitals.inverse().get("Berlin"))*/;

        /*List<String> names = new ArrayList<>();
        names.add("Lucas");
        names.add("Mark");
        names.add(null);
        names.add("Robert");

        String joinedNames = String.join("; ", names);
        System.out.println(joinedNames);

        String joinedNamesGuava = Joiner.on("; ").skipNulls().join(names);
        System.out.println(joinedNamesGuava);

        String joinedWithDefault = Joiner.on("; ").useForNull("default value").join(names);
        System.out.println(joinedWithDefault);*/

       /* String longText = ", Lucas,Mark,,Robert ,";
        String[] split = longText.split(",");
        List<String> names = Arrays.asList(split);

        System.out.println(names);

        List<String> splittedStrings = Splitter.on(",").omitEmptyStrings().splitToList(longText);
        System.out.println(splittedStrings);

        List<String> splittedstrings2 = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(longText);
        System.out.println(splittedstrings2);*/

        /*System.out.println(nonFailFastDivideMethod(2,0));
        System.out.println(failFastDivideMethod(2, 0));
        System.out.println(guavaFailFastDivideMethod(2, 0));*/

        /*System.out.println(nonFailFastTransformWordMethod("  lucas    "));
        System.out.println(nonFailFastTransformWordMethod(null));
        System.out.println(FailFastTransformWordMethod(null));
        System.out.println(guavaFailFastTransformWordMethod(null));*/

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();



        map1.put("Poland", "Warsaw");
        map1.put("Germany", "Berlin");
        map1.put("France", "Paris");

        map2.put("Poland", "Cracow");
        map2.put("France", "Paris");
        map2.put("Czech Republic", "Prague");
        map2.put("Slovakia", "Bratislava");
        map2.put("Deutschland", "Berlin");

        System.out.println(mapToStringConverter(map2));

        MapDifference<String, String> difference = Maps.difference(map1, map2);

        Map<String, MapDifference.ValueDifference<String>> differing = difference.entriesDiffering();
        System.out.println(differing);

        Map<String, String> inCommon = difference.entriesInCommon();
        System.out.println(inCommon);

        Map<String, String> onlyMap1 = difference.entriesOnlyOnLeft();
        System.out.println(onlyMap1);

        Map<String, String> onlyMap2 = difference.entriesOnlyOnRight();
        System.out.println(onlyMap2);



    }

    /*private static String getCountry(String capital) {
        Set<String> countries = countriesAndCapitals.keySet();
        for (String country : countries) {
            if (capital.equals(countriesAndCapitals.get(country)))
                return country;
        }
        return null;
    }*/

    private static int nonFailFastDivideMethod(int a, int b) {
        System.out.println("Method intermediate processes");

        return a / b;
    }

    private static int failFastDivideMethod(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divider should be different from zero!");
        }
        System.out.println("Method intermediate processes");

        return a / b;
    }

    private static int guavaFailFastDivideMethod(int a, int b) {
        Preconditions.checkArgument(b != 0, "Divider should be different from zero!");

        System.out.println("Method intermediate processes");

        return a / b;
    }

    private static String nonFailFastTransformWordMethod(String s) {
        StringBuilder newStringBuilderObject = new StringBuilder("New StringBuilderObject");
        System.out.println(newStringBuilderObject.toString());
        return s.toUpperCase().trim();
    }

    private static String FailFastTransformWordMethod(String s) {
        if (s == null) {
            throw new RuntimeException("Passed argument is null!");
        }
        StringBuilder newStringBuilderObject = new StringBuilder("New StringBuilderObject");
        System.out.println(newStringBuilderObject.toString());
        return s.toUpperCase().trim();
    }

    private static String guavaFailFastTransformWordMethod(String s) {
        Preconditions.checkNotNull(s , "Passed argument should be different from null!");
        StringBuilder newStringBuilderObject = new StringBuilder("New StringBuilderObject");
        System.out.println(newStringBuilderObject.toString());
        return s.toUpperCase().trim();
    }

    public static String mapToStringConverter(Map<String, String> map) {
        Map <String, String> myMap = Maps.newLinkedHashMap(map);
        String delimiter = " & ";
        String separator = " = ";
        String result = Joiner.on(delimiter).withKeyValueSeparator(separator).join(myMap);
        return result;
    }
}