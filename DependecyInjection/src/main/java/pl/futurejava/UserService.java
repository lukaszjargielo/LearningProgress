package pl.futurejava;

public class UserService {
    private final DatabaseConnection databaseConnection;

    //dependency injection as an example of loose coupling
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }


    public void registerUser(String username) {
        databaseConnection.addUserToDatabase(username);
    }
}
