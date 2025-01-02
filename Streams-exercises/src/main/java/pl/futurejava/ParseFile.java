package pl.futurejava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ParseFile {
    public static List<UserContent> parseDataFromList(List<String> listWithData) {
        ArrayList<UserContent> users = new ArrayList<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 1; i < listWithData.size(); i++) {
            String[] split = (listWithData.get(i)).split(";");
            String username = split[0];
            String comment = split[1];
            String dateInString = split[2];
            LocalDate date = LocalDate.parse(dateInString, dateTimeFormatter);
            int likes = Integer.parseInt(split[3]);

            UserContent userContent = new UserContent(username, comment, date, likes);
            users.add(userContent);

        }

        return users;
    }
}
