package pl.futurejava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserContent {
    private String username;
    private String userComment;
    private LocalDate commentDate;
    private int commentLikes;

    public UserContent(String username, String userComment, LocalDate commentDate, int commentLikes) {
        this.username = username;
        this.userComment = userComment;
        this.commentDate = commentDate;
        this.commentLikes = commentLikes;
    }

    public String getUsername() {
        return username;
    }

    public String getUserComment() {
        return userComment;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public int getCommentLikes() {
        return commentLikes;
    }

    public List<UserContent> parseDataFromList(List<String> listWithData) {
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
