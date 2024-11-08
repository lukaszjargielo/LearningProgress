package pl.futurejavacode.inheritence;

public class Moderator extends User{
    public void editPost(String post, int id) {
        System.out.println("The post with id " + id + " has been edited.");
    }
}
