package pl.futurejava.SpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    private final String host;
    private final String username;
    private final String password;

    public DatabaseConnection(@Value("localhost") String host, @Value("Lucas") String username, @Value("Password") String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void addUserToDatabase(String username) {
        System.out.println("User has been added.");
    }
}
