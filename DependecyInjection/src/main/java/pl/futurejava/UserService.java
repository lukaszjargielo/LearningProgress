package pl.futurejava;

public class UserService {

    //Example of tight coupling
    public void registerUser(String username) {
        DatabaseConnection databaseConnection = new DatabaseConnection("localhost", "Lucas", "Passwor");
        databaseConnection.addUserToDatabase(username);
    }
}
