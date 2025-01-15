package pl.futurejava.webservice;

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
import java.util.List;

@RestController
public class UserController {
    @GetMapping("users")
    public ResponseEntity<List<User>> getUsersList() throws IOException {
        Reader input = new FileReader("src/main/resources/users.csv");

        CSVFormat csvFormat = getCSVFormat();

        CSVParser parser = csvFormat.parse(input);

        List<User> users = parser.stream()
                .map(record -> {
                    int id = Integer.parseInt(record.get("id"));
                    String name = record.get("name");
                    int age = Integer.parseInt(record.get("age"));
                    boolean isMale = Boolean.parseBoolean(record.get("isMale"));

                    return new User(id, name, age, isMale);
                }).toList();

        return ResponseEntity.ok(users);
    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user) throws IOException {
        CSVFormat csvFormat = getCSVFormat();

        try (CSVPrinter printer = new CSVPrinter(new FileWriter("src/main/resources/users.csv", true), csvFormat)) {
            printer.printRecord(user.id(), user.name(), user.age(), user.isMale());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("users")
    public ResponseEntity<User> updateUser(@RequestBody User newUser) {

    }

    private CSVFormat getCSVFormat() {
        return CSVFormat.DEFAULT.withHeader("name", "age", "isMale")
                .withSkipHeaderRecord();
    }
}
