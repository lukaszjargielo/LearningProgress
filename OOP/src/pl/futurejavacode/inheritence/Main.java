package pl.futurejavacode.inheritence;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.addPost("New post");
        System.out.println();

        Moderator moderator = new Moderator();
        moderator.addPost("New post");
        moderator.editPost("Edited post",1);
        System.out.println();

        Administrator administrator = new Administrator();
        administrator.addPost("New post");
        administrator.editPost("Edited post", 1);
        administrator.deletePost(1);
        System.out.println();

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(administrator);
        users.add(moderator);

        for(User u : users) {
            System.out.println(u);
        }



    }
}
