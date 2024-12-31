package pl.futurejava;

import java.time.LocalDate;

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
}
