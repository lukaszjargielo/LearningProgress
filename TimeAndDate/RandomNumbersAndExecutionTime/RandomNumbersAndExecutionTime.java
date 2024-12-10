package RandomNumbersAndExecutionTime;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

class RandomNumbersAndExecutionTime {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(100_000_000);
        Random random = new Random();

        Instant instant = Instant.now();
        for (int i = 0; i < 100_000_000; i++) {
            int number = random.nextInt(100_000_000) + 1;
            numbers.add(number);
        }
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);
        long millisSeconds = duration.toMillis();

        System.out.println("Time of program execution in milliseconds is: " + millisSeconds);
    }
}
