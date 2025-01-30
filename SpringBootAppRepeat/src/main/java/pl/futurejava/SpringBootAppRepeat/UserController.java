package pl.futurejava.SpringBootAppRepeat;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.databind.MappingIterator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Path;
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

    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) throws IOException {

        List<User> usersFromFile = getUsersFromFile();
        List<User> updatedUsers = new ArrayList<>();
        User updatedUser = null;

        for (User userFromFile : usersFromFile) {
            if (userFromFile.id() == id) {
                updatedUser = new User(id, user.name(), user.age(), user.isMale());
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

    @DeleteMapping("users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) throws IOException {
        List<User> usersFromFile = getUsersFromFile();

        List<User> users = new ArrayList<>(usersFromFile);

        users.removeIf(user -> user.id() == id);

        CSVFormat csvFormat = getCSVFormat(false);

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("SpringBootAppRepeat/src/main/resources/users.csv"), csvFormat)) {
            for (User user : users) {
                printer.printRecord(user.id(), user.name(), user.age(), user.isMale());
            }
        }

        return ResponseEntity.noContent().build();
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

    private List<User> getUsersListFromFile (String pathname) throws IOException {
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("id")
                .addColumn("name")
                .addColumn("age")
                .addColumn("isMale")
                .build()
                .withHeader()
                .withColumnReordering(true);

List<User> users = new ArrayList<>();

        try (MappingIterator<User> mappingIterator = mapper.readerFor(User.class)
                .with(schema)
                .readValue(new File(pathname))) {

            while (mappingIterator.hasNext()) {
                users.add(mappingIterator.next());
            }

            return users;
        }
    }
}