package pl.futurejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String username;
        String comment;
        String dateInString;
        LocalDate date;
        int likes;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<String> listWithData = new ArrayList<>();
        ArrayList<UserContent> users = new ArrayList<>();


        Path path = Paths.get("src/main/resources/data.txt");

        try {
             listWithData = Files.readAllLines(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < listWithData.size(); i++) {
            String[] split = (listWithData.get(i)).split(";");
            username = split[0];
            comment = split[1];
            dateInString = split[2];
            date = LocalDate.parse(dateInString, dateTimeFormatter);
            likes = Integer.parseInt(split[3]);

            UserContent userContent = new UserContent(username, comment, date, likes);
            users.add(userContent);

        }

        System.out.println(users.get(1).getCommentDate());
    }
}