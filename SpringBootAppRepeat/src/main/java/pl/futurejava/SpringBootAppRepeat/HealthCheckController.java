package pl.futurejava.SpringBootAppRepeat;

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
    public ResponseEntity<ApplicationHealthStatus> healthCheck() {

        if (healthStatus.isHealthy()) {

            return ResponseEntity.status(200).body(healthStatus);
        } else {

            return ResponseEntity.status(503).body(healthStatus);
        }

    }
}
