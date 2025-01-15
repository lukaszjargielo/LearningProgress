package pl.futurejava.webservice;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("health")
    public ResponseEntity<String> checkHealth() {

        Gson gson = new Gson();
        ApplicationStatus status = new ApplicationStatus(1);
        String jsonStatus = gson.toJson(status);

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(jsonStatus);

    }
}
