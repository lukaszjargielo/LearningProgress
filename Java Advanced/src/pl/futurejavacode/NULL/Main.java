package pl.futurejavacode.NULL;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.isOfAge());

        ArrayList<String> names = null;

        User user1 = new User("Kamil", null, 35);
        System.out.println(user1.getName());
        System.out.println(user1.getLastName());
        user1.getAge();

        User user2 = new User("Wiktoria", "Okupnik", 40);
        Users users = new Users();
        users.addUser(user1);
        users.addUser(user2);

        User firstMaleUser = users.getFirstMaleUser();
        System.out.println(firstMaleUser);
    }
}