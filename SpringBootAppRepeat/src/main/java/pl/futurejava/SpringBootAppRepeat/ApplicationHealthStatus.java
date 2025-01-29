package pl.futurejava.SpringBootAppRepeat;

import org.springframework.stereotype.Component;

@Component
public class ApplicationHealthStatus {

    private boolean isHealthy = true;

    public void setHealthStatus(boolean status) {
        this.isHealthy = status;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }
}
