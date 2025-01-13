package pl.futurejava.SpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @Value("localhost")
    private String host;

    @Value("Lucas")
    private String username;

    @Value("Password")
    private String password;

    public void addUserToDatabase(String username) {
        System.out.println("User has been added.");
    }
}
