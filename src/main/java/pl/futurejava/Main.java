package pl.futurejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String passwordFilePath = System.getenv("DB");

        String password = readPasswordFromFile(passwordFilePath);

        if (password != null) {
            try {
                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_schema", "root", password)) {
                    System.out.println("Połączenie udane!");

                    String sql = "SELECT id, login, display_name, year_of_birth FROM user";

                    String addUserSql = "INSERT INTO user(login, display_name, year_of_birth) VALUES ('robcio', 'Robert', 1975)";

                    try (Statement statement = connection.createStatement()) {
                        statement.executeUpdate(addUserSql);
                    }
                    try (Statement statement = connection.createStatement()) {
                        try (ResultSet resultSet = statement.executeQuery(sql)) {
                            while (resultSet.next()) {
                                System.out.println(resultSet.getInt("id"));
                                System.out.println(resultSet.getString("login"));
                                System.out.println(resultSet.getString("display_name"));
                                System.out.println(resultSet.getInt("year_of_birth"));
                                System.out.println();
                            }
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("Błąd połączenia: " + e.getMessage());
            }
        } else {
            System.out.println("Nie udało się wczytać hasła z pliku.");
        }
    }

    public static String readPasswordFromFile(String filePath) {
        String password = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            password = reader.readLine();
        } catch (IOException e) {
            System.out.println("Błąd przy wczytywaniu pliku: " + e.getMessage());
        }
        return password;
    }
}

