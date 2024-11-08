package pl.futurejavacode.overriding;

public class Moderator extends User{
    @Override
    public void hello() {
//        super.hello();
        System.out.println("Message from Moderator class");
    }
}
