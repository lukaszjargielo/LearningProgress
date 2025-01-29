package pl.futurejava.SpringBootAppRepeat;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() throws IOException {

        try (Reader input = new FileReader("SpringBootAppRepeat/src/main/resources/users.csv")) {

            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setHeader("name", "age", "isMale")
                    .setSkipHeaderRecord(true)
                    .get();

            try (CSVParser parser = csvFormat.parse(input)) {


                List<User> users = parser.stream()
                        .map(record -> {
                            String name = record.get("name");
                            int age = Integer.parseInt(record.get("age"));
                            boolean isMale = Boolean.parseBoolean(record.get("isMale"));
                            return new User(name, age, isMale);
                        }).toList();

                return ResponseEntity.ok(users);

            }
        }
    }
}