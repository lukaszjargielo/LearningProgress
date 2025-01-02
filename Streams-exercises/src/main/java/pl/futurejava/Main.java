package pl.futurejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listWithData = new ArrayList<>();

        Path path = Paths.get("src/main/resources/data.txt");

        try {
             listWithData = Files.readAllLines(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<UserContent> usersContents = ParseFile.parseDataFromList(listWithData);


        System.out.println(users.get(1).getCommentDate());
    }
}