import java.util.HashMap;
import java.util.Scanner;

public class CountriesAndCapitals_v_1_0_0 {
    public static void main(String[] args) {

        HashMap<String, String> countriesAndCapitals = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        countriesAndCapitals.put("polska", "Warszawa");
        countriesAndCapitals.put("niemcy", "Berlin");
        countriesAndCapitals.put("francja", "Pary¿");
        countriesAndCapitals.put("ukraina", "Kijów");
        countriesAndCapitals.put("rosja", "Moskwa");
        while (true) {
            System.out.println("Ask about a capital. Give a country name: ");

            String country = scanner.nextLine();

            if (countriesAndCapitals.containsKey(country.toLowerCase())) {
                System.out.println(countriesAndCapitals.get(country.toLowerCase()));
            } else {
                System.out.println("There is no country in a database");
            }
        }
    }
}