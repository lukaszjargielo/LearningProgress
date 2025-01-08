package pl.futurejava;

import com.google.common.base.Splitter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

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

        String longText = ", Lucas,Mark,,Robert ,";
        String[] split = longText.split(",");
        List<String> names = Arrays.asList(split);

        System.out.println(names);

        List<String> splittedStrings = Splitter.on(",").omitEmptyStrings().splitToList(longText);
        System.out.println(splittedStrings);

        List<String> splittedstrings2 = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(longText);
        System.out.println(splittedstrings2);
    }

    /*private static String getCountry(String capital) {
        Set<String> countries = countriesAndCapitals.keySet();
        for (String country : countries) {
            if (capital.equals(countriesAndCapitals.get(country)))
                return country;
        }
        return null;
    }*/
}