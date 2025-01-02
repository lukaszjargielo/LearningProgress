package pl.futurejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

//        usersContents.stream()
//                .forEach(System.out::println);

//Show comments in chronological order

    /*      usersContents.stream()
                .sorted(Comparator.comparing(UserContent::getCommentDate))
                .map(user -> user.getUsername() + " : " + user.getUserComment()
                        + " " + user.getCommentDate())
                .forEach(System.out::println);*/

//Show comments with 10 or more likes.

    /*      usersContents.stream()
                .filter(user -> user.getCommentLikes() > 10)
                .map(user -> user.getUsername() + " : " + user.getUserComment() + " " + user.getCommentLikes() + " LIKES")
                .forEach(System.out::println);*/

//Find the longest and the shortest comment

    /* Optional<UserContent> theLongestComment = usersContents.stream()
                .max(Comparator.comparing(userContent -> userContent.getUserComment().length()));

        System.out.println(theLongestComment.get().getUserComment());
        System.out.println(theLongestComment.get().getUserComment().length() + " signs.\n");

        Optional<UserContent> theShortestComment = usersContents.stream()
                .min(Comparator.comparing(userContent -> userContent.getUserComment().length()));

        System.out.println(theShortestComment.get().getUserComment());
        System.out.println(theShortestComment.get().getUserComment().length() + " signs.\n");

        usersContents.stream()
                .sorted(Comparator.comparing(u -> u.getUserComment().length()))
                .map(u -> u.getUsername() + " : " + u.getUserComment() + " - " + u.getUserComment().length() + " signs." )
                .forEach(System.out::println);*/

//Calculate average likes for all comments

        /*Double averageLikes = usersContents.stream()
                .collect(Collectors.averagingInt(UserContent::getCommentLikes));
        System.out.println("An average likes: " + averageLikes + " for comment.");*/

//Count how many comments were added by men and women.

        /*long womenComments = usersContents.stream()
                .filter(user -> user.getUsername().endsWith("a"))
                .count();

        System.out.println("Number of comments wrote by women: " + womenComments);

        long menComments = usersContents.stream()
                .filter(user -> !user.getUsername().endsWith("a"))
                .count();

        System.out.println("Number of comments wrote by men: " + menComments);*/

//Calculate total likes.

        /*Integer totalLikes = usersContents.stream()
                .mapToInt(UserContent::getCommentLikes).sum();

        System.out.println("Total likes: " + totalLikes);*/

//Find users who wrote comment 50 signs in length.

        /*usersContents.stream()
                .filter(user -> user.getUserComment().length() > 50)
                .map(user -> user.getUsername())
                .distinct()
                .forEach(System.out::println);*/

//Sort comment by descending number of likes

     /*   usersContents.stream()
                .sorted(Comparator.comparing(UserContent::getCommentLikes).reversed())
                .map(user -> user.getUserComment() + " " + user.getCommentLikes())
                .forEach(System.out::println);*/

//Show comments added in October 2023.

        /*usersContents.stream()
                .filter(user -> user.getCommentDate().getMonth().equals(Month.OCTOBER))
                .map(user -> user.getCommentDate() + " : " + user.getUserComment())
                .forEach(System.out::println);*/
    }
}