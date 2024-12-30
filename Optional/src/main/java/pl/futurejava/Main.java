package pl.futurejava;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserFinder userFinder = new UserFinder();

        Optional<User> user = userFinder.findUser("Kamil");
        System.out.println(user.get().getAge());

        Optional<User> user2 = userFinder.findUser("Alfred");
        user2.ifPresent(u -> System.out.println(u.getAge()));

        Optional<User> user3 = userFinder.findUser("Monika");
        user3.ifPresentOrElse(u -> System.out.println(u.getAge()), () -> System.out.println("User not found"));

    }
}
