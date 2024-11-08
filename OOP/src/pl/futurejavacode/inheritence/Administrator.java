package pl.futurejavacode.inheritence;

public class Administrator extends Moderator {
    public void deletePost (int id) {
        System.out.println("The post with id " + id + " has been deleted.");
    }
}
