package pl.futurejava.SpringBootAppRepeat;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final ApplicationHealthStatus healthStatus;

    @Autowired
    public HealthCheckController(ApplicationHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {

        Gson gson = new Gson();
        String json = gson.toJson(healthStatus);

        if (healthStatus.isHealthy()) {
//            String json = gson.toJson("Application is healthy.");
            return ResponseEntity.status(200).header("Content-Type", "application/json;charset=UTF-8").body(json);
        } else {
//                        String json = gson.toJson("Service is unavailable");
            return ResponseEntity.status(503).header("Content-Type", "application/json;charset=UTF-8").body(json);
        }

    }
}
