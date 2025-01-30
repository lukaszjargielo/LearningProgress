package pl.futurejava.SpringBootAppRepeat;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers() throws IOException {

        List<User> users = getUsersFromFile();

        return ResponseEntity.ok(users);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user) throws IOException {

        List<User> users = getUsersFromFile();
        int lastId = users.getLast().id();

        CSVFormat csvFormat = getCSVFormat(true);

        User newUser = new User(lastId + 1, user.name(), user.age(), user.isMale());

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("SpringBootAppRepeat/src/main/resources/users.csv", true), csvFormat)) {

            printer.printRecord(newUser.id(), newUser.name(), newUser.age(), newUser.isMale());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @PutMapping("users")
    public ResponseEntity<User> updateUser(@RequestBody User user) throws IOException {

        List<User> usersFromFile = getUsersFromFile();
        List<User> updatedUsers = new ArrayList<>();
        User updatedUser = null;

        for (User userFromFile : usersFromFile) {
            if (userFromFile.id() == user.id()) {
                updatedUser = new User(user.id(), user.name(), user.age(), user.isMale());
                updatedUsers.add(updatedUser);
            } else {
                updatedUsers.add(userFromFile);
            }
        }

        CSVFormat csvFormat = getCSVFormat(false);

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("SpringBootAppRepeat/src/main/resources/users.csv"), csvFormat)) {
            for (User newUser : updatedUsers) {
                printer.printRecord(newUser.id(), newUser.name(), newUser.age(), newUser.isMale());
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(updatedUser);
    }

    private CSVFormat getCSVFormat(boolean setSkipHeaderRecord) {

        return CSVFormat.DEFAULT.builder()
                .setHeader("id", "name", "age", "isMale")
                .setSkipHeaderRecord(setSkipHeaderRecord)
                .get();
    }

    private List<User> getUsersFromFile() throws IOException {
        try (Reader input = new FileReader("SpringBootAppRepeat/src/main/resources/users.csv")) {

            CSVFormat csvFormat = getCSVFormat(true );

            try (CSVParser parser = csvFormat.parse(input)) {

                List<User> users = parser.stream()
                        .map(record -> {
                            int id = Integer.parseInt(record.get("id"));
                            String name = record.get("name");
                            int age = Integer.parseInt(record.get("age"));
                            boolean isMale = Boolean.parseBoolean(record.get("isMale"));
                            return new User(id, name, age, isMale);
                        })
                        .sorted(Comparator.comparingInt(User::id))
                        .toList();
                return users;
            }
        }
    }
}