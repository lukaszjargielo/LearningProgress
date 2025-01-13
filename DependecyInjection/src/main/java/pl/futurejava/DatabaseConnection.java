package pl.futurejava;

public class DatabaseConnection {
    private final String host;
    private final String username;
    private final String password;

    public DatabaseConnection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void addUserToDatabase(String username) {
        System.out.println("User has been added.");
    }
}
