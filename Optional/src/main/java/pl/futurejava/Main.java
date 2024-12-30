package pl.futurejava;

public class Main {
    public static void main(String[] args) {
        UserFinder userFinder = new UserFinder();

        User user = userFinder.findUser("Kamil");
        System.out.println(user.getAge());

        User user2 = userFinder.findUser("Alfred");
        System.out.println(user2.getAge());
    }
}
