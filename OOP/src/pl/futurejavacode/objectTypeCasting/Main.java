package pl.futurejavacode.objectTypeCasting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();

        userList.add(user);
        userList.add(moderator);
        userList.add(administrator);

        User user2 = userList.get(1);
        user2.hello();

        Moderator user3 = (Moderator) user2;
        user3.editPost();

        for (User u : userList) {
            if (u instanceof Moderator) {
                ((Moderator) u).editPost();
            } else if (u instanceof Administrator) {
                ((Administrator) u).deletePost();
            } else {
                u.hello();
            }
        }

        for (User u : userList) {
            if (u instanceof Administrator) {
                ((Administrator) u).deletePost();
            } else if (u instanceof Moderator) {
                ((Moderator) u).editPost();
            } else {
                u.hello();
            }
        }

        for (User u : userList) {
            if (u instanceof Administrator a) {
                a.deletePost();
            } else if (u instanceof Moderator m) {
                m.editPost();
            } else {
                u.hello();
            }
        }
    }
}
