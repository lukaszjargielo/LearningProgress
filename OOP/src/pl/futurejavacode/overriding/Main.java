package pl.futurejavacode.overriding;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.hello();

        Moderator moderator = new Moderator();
        moderator.hello();


    }
}
