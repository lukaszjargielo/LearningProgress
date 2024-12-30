package pl.futurejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserFinder {
    final List<User> users = new ArrayList<>();

    public UserFinder() {
        User user1 = new User("Kamil", 35);
        User user2 = new User("Mariusz", 30);
        User user3 = new User("Dominik", 20);

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public Optional<User> findUser(String name) {
        for (User user : users) {
            if (name.equals(user.getName())) {
                return  Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
