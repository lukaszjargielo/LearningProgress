package pl.futurejava;

import java.time.LocalDate;

public class User {
    private String username;
    private UserContent comment;

    public User(String username, UserContent comment) {
        this.username = username;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public UserContent getComment() {
        return comment;
    }
}
